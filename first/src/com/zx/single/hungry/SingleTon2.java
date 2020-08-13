package com.zx.single.hungry;

/**
 * 枚举类型
 *    表示该类型的对象是有限的几个
 *    当我们限制为一个，就自动是单例了
 */

//此种方法最简洁
public enum  SingleTon2 {
    INSTANCE
}


class Test{
    public static void main(String[] args) {
        System.out.println(SingleTon2.INSTANCE);  //直接输出对象名字
    }
}