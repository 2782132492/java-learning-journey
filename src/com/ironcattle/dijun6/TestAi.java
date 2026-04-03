package com.ironcattle.dijun6;

import java.util.Scanner;

/*
    AI初体验\
 */
public class TestAi {
    public static void main(String[] args) {
        // 生成一个随机的七位数
        int a = (int)(Math.random()*10000000);
        // 键盘输入七位数字简化代码
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入七位数字");
        int b = sc.nextInt();
        // 判断输入的七位数字和随机的七位数是否一致
        if(a == b){
            System.out.println("恭喜你猜对了");
        }else {
            System.out.println("你猜错了");
        }
    }
}
