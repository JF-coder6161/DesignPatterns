package com.jf.singleton;

public class Mgr02 {

    private static final Mgr02 INSTANCE;

    static {
        INSTANCE = new Mgr02();
    }

    public static Mgr02 getInstance(){
        return INSTANCE;
    }

    public void m(){
        System.out.println("Mgr2");
    }

}
