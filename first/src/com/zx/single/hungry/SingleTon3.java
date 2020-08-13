package com.zx.single.hungry;

import java.io.IOException;
import java.util.Properties;

/**
 * 静态代码块的饿汉式
 *
 */
//此种方法适合复杂的实例化
public class SingleTon3 {
    public static final SingleTon3 INSTANCE;
    private String info;

    public String getInfo() {
        return info;
    }

    static {
        try {
            Properties pro = new Properties();
            pro.load(SingleTon3.class.getClassLoader().getResourceAsStream("com\\zx\\single\\hungry\\single.properties"));
            INSTANCE = new SingleTon3(pro.getProperty("info"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private SingleTon3(String info){
        this.info = info;
    }
}

class Test3{
    public static void main(String[] args) {
        System.out.println(SingleTon3.INSTANCE.getInfo());
    }
}