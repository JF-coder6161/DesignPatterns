package com.jf.singleton;

/**
 * 枚举单例
 不仅可以解决线程同步,还可以防止反序列化
 */
public enum Mgr08 {

    INSTANCE;

    public void m() {
        System.out.println("perfect!!!");
    }

}
