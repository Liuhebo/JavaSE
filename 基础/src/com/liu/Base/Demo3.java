package com.liu.Base;

public class Demo3 {
    public static void main(String[] args) {
        int a = 3;
        int b = a++;  //执行完这行代码后，先给b赋值，再自增
        System.out.println(a);
        int c = ++a;  //执行完这行代码后，先自增，再给c自增
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //幂运算 很多运算，我们会使用一些工具类来操作
        double e = Math.pow(3,4);
        System.out.println(e);
        boolean f = true;
        boolean d = false;
        //与  或  非
        System.out.println("f && d:" +(f&&d));    //逻辑与运算：两个变量都为真，结果才为true
        System.out.println("f || d:" +(f||d));    //逻辑或运算：两个变量有一个为真，则结果为true
        System.out.println("!(f && d):" +!(f&&d));    //逻辑非运算：如果是真，则变为假，如果是假，则变为为真
    }
}
