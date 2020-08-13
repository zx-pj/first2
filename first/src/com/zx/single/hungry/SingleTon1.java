package com.zx.single.hungry;

/**
 * 饿汉式  线程安全
 *      直接创建实例对象，不管你需不需要。 在类加载时已经创建
 *
 *      1.构造器私有化
 *      2.内部自行创建对象，并且用static修饰
 *      3.向外提供这个实例
 *      4.为了强调单例，可以再用final修饰
 */

//此处方法简洁直观
public class SingleTon1 {

    private SingleTon1(){}

    public final static SingleTon1 INSTANCE = new SingleTon1();  //public修饰，可以使用类名.的方式

    public static void main(String[] args) {
        System.out.println("aaaaaaaaa");
    }

}
