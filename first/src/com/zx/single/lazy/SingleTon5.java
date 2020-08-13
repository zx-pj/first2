package com.zx.single.lazy;

/**
 * 饿汉式   线程安全写法   第二种！！！
 *      在内部类被加载和初始化时，才创建INSTANCE实例对象
 *      静态内部类不会自动随着外部类的加载和初始化而初始化，它要单独去加载和初始化
 *      当我们去调用内部类时，静态内部类才会初始化
 *
 *      此种方法的INSTANCE实例对象是在内部类使用时才加载的，所以是线程安全的
 */
public class SingleTon5 {

    private SingleTon5(){}

    private static class Inner{
        private static final SingleTon5 INSTANCE = new SingleTon5();
    }

    public static SingleTon5 getInstance(){
        return Inner.INSTANCE;
    }
}
