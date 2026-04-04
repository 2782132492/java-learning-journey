package com.ironcattle.dijun6.operator;


// 导入Scanner类
import java.util.Scanner;


public class OperatorDemo3 {
    public static void main(String[] args) {
        // 键盘输入秒数,将其转换为对应的小时数,分钟数,秒数

        Scanner sc = new Scanner(System.in);
        // 键盘录入秒数
        System.out.println("请输入秒数: ");
        int seconds = sc.nextInt();
        // 转换为小时数,分钟数,秒数
        int hours = seconds / 3600;
        int minutes = seconds / 60 % 60;
        int se = seconds % 60;
        // 输出到一行
        System.out.println(hours + " " + minutes + " " + se);
    }
}
