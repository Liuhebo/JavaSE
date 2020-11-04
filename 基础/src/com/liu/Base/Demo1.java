package com.liu.Base;

public class Demo1 {
    //类变量 static
    static double salary = 20000;
    //实例变量：从属于对象；如果不自行初始化，这个类型的默认值0 0.0
    //布尔值：默认类型是false
    //除了基本类型，其余的默认值都是null；
    String name;
    int age;
    //main方法
    public static void main(String[] args) {
        //局部变量；必须声明和初始化值
        int i = 10;
        System.out.println(i);

        //变量类型；变量名字 = new demo1();
        Demo1 demo1 = new Demo1();
        System.out.println(demo1.age);
        System.out.println(salary);

    }
}
