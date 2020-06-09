package com.study.bean;

import java.util.Arrays;

/**
 * @author kejianming
 * @date 2020/6/8 - 23:05
 */
public class Hello {
    /**
     *num表示书本数量
     */
    private int num=10;


    public static void main(String[] args) {
        System.out.println();
        System.out.println("args = " + args);
        System.out.println("args = " + Arrays.deepToString(args));
        int num1=10;
        int num2=20;
        System.out.println("num1 = " + num1);
        System.out.println("num = " + num1);
    }
    public void testUpdate(){
        System.out.println("test");
    }
}
