package com.jf.singleton;

import org.junit.Test;

public class Mrg01Test {

    @Test
    public void test1(){

        Mgr01 mgr01 = Mgr01.getInstance();
        mgr01.m();
        Mgr01 mgr02 = Mgr01.getInstance();

        System.out.println( mgr01 == mgr02 ); // true
    }
}
