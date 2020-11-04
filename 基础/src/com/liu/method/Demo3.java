package com.liu.method;

public class Demo3 {
    public static void main(String[] args) {
        printMax(12,54,7,8,3,343);
        printMax(new double[]{1,2,3});
    }

    public static void printMax(double... num) {
        if (num.length == 0){
            System.out.println("No argument passed");
            return;
        }
        double result = num[0];
//        排序
        for (int i = 0; i < num.length; i++) {
            if (num[i] > result){
                result = num[i];
            }
        }
        System.out.println("The max value is " + result);
    }
}
