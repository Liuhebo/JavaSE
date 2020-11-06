package com.liu.method;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.print("输入第一个数：");
        double num1 = get.nextDouble();

        System.out.print("运算方法是：");
        String ope = get.next();

        System.out.print("输入第二个数：");
        double num2 = get.nextDouble();

        double result = 0;

        switch (ope){
            case "+":
                result = num1 + num2;
                System.out.println(num1 + ope + num2 + "=" + result );
                break;
            case "-":
                result = num1 - num2;
                System.out.println(num1 + ope + num2 + "=" + result );
                break;
            case "*":
                result = num1 * num2;
                System.out.println(num1 + ope + num2 + "=" + result );
                break;
            case "/":
                result = num1 / num2;
                System.out.println(num1 + ope + num2 + "=" + result );
                break;
            case "%":
                result = num1 % num2;
                System.out.println(num1 + ope + num2 + "=" + result );
                break;
            default:
                System.out.println("输入不合法。");
        }
    }
}
