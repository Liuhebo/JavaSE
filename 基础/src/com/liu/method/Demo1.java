package com.liu.method;

public class Demo1 {
    public static void main(String[] args) {
        int c = max(30,40,30);
        System.out.println(c);
    }

    public static int max(int a,int b) {
        int result = 0;
        if (a == b){
            System.out.println("a = b");
        }
        if (a > b){
            result = a;
        }else {
            result = b;
        }
        return result;
    }
    public static int max(int a,int b,int c) {
        int result = 0;
        if (a == b){
            System.out.println("a = b");
        }
        if (a > b){
            result = a;
        }else {
            result = b;
        }
        return a+b+c;
    }
}
