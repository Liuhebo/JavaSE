package com.liu.cycle;

public class Demo4 {
    public static void main(String[] args) {
        int[] num = {10,20,30,40,50};  //定义一个数组

        for (int i = 0; i < 5; i++) {
            System.out.println(num[i]);
        }
        System.out.println("=============================");
        //遍历数组中的元素
        for (int x:num){
            System.out.println(x);
        }
    }
}
