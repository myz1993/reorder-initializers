package com.github.hcsp.objectbasic;

public class Cat {
    //1先初始化，但是用到了initStaticCount()，所以initStaticCount()先开始
    public static int count = initStaticCount();

    //2顺序接下来，执行静态代码块
    static {
//        System.out.println(1);
        System.out.println(2);
    }

    //3成员变量初始化开始，initAge()会被执行
    int age = initAge();
    String name;

    //4顺序执行代码块
    {
//        System.out.println(2);
        System.out.println(4);
    }

    //5顺序执行代码块
    {
//        System.out.println(3);
        System.out.println(5);
    }

    //
    public int initAge() {
//        System.out.println(4);
        System.out.println(3);
        return 0;
    }

    public static int initStaticCount() {
//        System.out.println(5);
        //静态方法优先
        System.out.println(1);
        return 0;
    }

    public Cat(String name) {
        //调用构造方法6
        this(0, name);
//        System.out.println(6);
        //顺序执行7
        System.out.println(7);
    }

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
        //执行输出语句
//        System.out.println(7);
        System.out.println(6);
    }

}
