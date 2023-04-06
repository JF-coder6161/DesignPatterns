package com.jf.singleton;

/**
 * lazy loading
 * 也称懒汉式
 */
public class Mgr05 {

    private static Mgr05 INSTANCE;

    private Mgr05(){}

    public static synchronized Mgr05 getInstance(){
        if(INSTANCE == null){
            // 试图通过减小同步代码块的方式提高效率,不可行
            synchronized (Mgr05.class){
                INSTANCE = new Mgr05();
            }
        }
        return INSTANCE;
    }

    public void m(){
        System.out.println("thread not safe");
    }

    


}
