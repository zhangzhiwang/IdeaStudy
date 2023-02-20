package com.kuaishou;

import junit.framework.Assert;
import junit.framework.TestCase;

public class IdeaStudy1Test extends TestCase {

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {

    }

    public void testF1() {
        int i = IdeaStudy1.f1("100");
        System.out.println("i = " + i);
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        Assert.assertTrue(true);
        Assert.assertEquals("abc", "123");
    }

    public void testF2() {
        IdeaStudy1.f2(10);
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        Assert.assertTrue(true);
    }
}


