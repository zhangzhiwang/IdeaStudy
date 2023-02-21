package com.kuaishou;

import java.util.ArrayList;
import java.util.List;

public class IdeaStudy1 extends  IdeaStudy1Father {
    /**
     *
     */
    private int age;

    public IdeaStudy1(int age) {
        this.age = age;
    }

    public IdeaStudy1() {
    }

    public static void main(String[] args) {
//        String s = f2(f1("100"));
//        System.out.println("hello");
        int i = f1("300");
        System.out.println(i);
//        try {
//            Thread.sleep(Integer.MAX_VALUE);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

//        System.out.println(1);
//        List<IdeaStudy1> list = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            list.add(new IdeaStudy1(i));
//        }
//        System.out.println(2);
//
//        IdeaStudy1 ideaStudy1 = new IdeaStudy1(20);
//        System.out.println();

//        List<String> list = new ArrayList<>();
//        list.add("abc");
//        list.add("ade");
//        list.add("fg");
//
//        list.stream()
//                .skip(0)
//                .filter(s -> s.contains("a"))
//                .forEach(System.out::println);

        Thread t = new Thread(() -> {
            System.out.println(123);
        });
    }

    public static int f1(String s) {
        System.out.println("f1...");
        int i = Integer.parseInt(s) + 1000;
//
//        try {
//            System.out.println("try");
//        } catch(Exception e) {
//            e.printStackTrace();
//        }finally {
//            System.out.println("finally");
//        }

        if("100".equals(s)) {
            System.out.println("A");
        } else if ("200".equals(s)) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }

        f3();
        return i;
    }

    public static String f2(int i) {
        System.out.println("f2...");
        return "hello " + i;
    }

    private static void f3() {
        try {
            System.out.println("f3...");
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        f4();
    }

    private static void f4() {
        try {
            System.out.println("f4...");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        f5();
    }

    private static void f5() {}
}

class IdeaStudy1Father {
    public void ff() {}
}

class IdeaStudy1Son extends IdeaStudy1 {}