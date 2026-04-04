package com.ironcattle.dijun6.scanner;

// 引入Scanner类
import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        // 创建一个Scanner对象
        Scanner sc = new Scanner(System.in);
        // 接收键盘录入的整数j
        System.out.println("请输入整数:");
        int number = sc.nextInt();
        System.out.println("你输入的数字是: " + number);
        // 接收键盘录入的浮点数
        System.out.println("请输入浮点数:");
        double number2 = sc.nextDouble();
        System.out.println("你输入的数字是: " + number2);
        // 接收键盘录入的字符串
        System.out.print("请输入字符串:");
        String name = sc.next();
        System.out.println("你输入的字符串是: " + name);
    }
}
