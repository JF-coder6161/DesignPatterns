package com.jf.singleton;

/**
 * lazy loading
 * 也称懒汉式
 * ok!
 */
public class Mgr06 {

    private static volatile Mgr06 INSTANCE;

    private Mgr06(){}

    public static synchronized Mgr06 getInstance(){
        if(INSTANCE == null){
            // 双重检查
            synchronized (Mgr06.class){
                if(INSTANCE == null){
                    INSTANCE = new Mgr06();
                }
            }
        }
        return INSTANCE;
    }

    public void m(){
        System.out.println("thread not safe");
    }

    


}
