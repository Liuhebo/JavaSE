package com.liu.Base;

import sun.awt.CGraphicsDevice;
import sun.security.x509.InvalidityDateExtension;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("你的成绩等级是：");
        String grade = get.nextLine();
        switch (grade){
            case "A":
                System.out.println("优秀");
                break;
            case "B":
                System.out.println("良好");
                break;
            case "C":
                System.out.println("普通");
                break;
            case "D":
                System.out.println("不及格");
                break;
        }
    }
}
