package com.liu.Base;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        //创建一个扫描对象，用于接收键盘数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("使用next方式接收：");

        //判断用户有没有输入字符串
        if (scanner.hasNextLine()){
            //使用next方式接收
            String chat = scanner.nextLine();
            System.out.println("输出的内容为："+chat);
        }
        scanner.close();
    }
}