package com.zx.single.lazy;

import java.util.concurrent.*;

/**
 * 懒汉式，线程不安全
 *          线程安全写法   第一种！！！
 */
public class SingleTon4 {
    private static SingleTon4 INSTANCE;  //需要private修饰，因为要用静态方法得到单例对象，不能用类名.的方式

    private SingleTon4() {
    }

    public static  SingleTon4 getInstance() {
        if (INSTANCE==null){
            synchronized (SingleTon4.class){
                if (INSTANCE == null) {
                    INSTANCE = new SingleTon4();
                }
            }
        }
        return INSTANCE;
    }
}

class Test4 {
    public static void main(String[] args) {
        Callable<SingleTon4> c = new Callable<SingleTon4>() {
            @Override
            public SingleTon4 call() throws Exception {
                return SingleTon4.getInstance();
            }
        };
        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<SingleTon4> submit1 = service.submit(c);
        Future<SingleTon4> submit2 = service.submit(c);
        try {
            SingleTon4 f1 = submit1.get();
            SingleTon4 f2 = submit2.get();
            System.out.println(f1);
            System.out.println(f2);
            System.out.println(f1 == f2);
            service.shutdown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}