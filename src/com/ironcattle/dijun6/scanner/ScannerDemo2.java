package com.ironcattle.dijun6.scanner;
// 导入Scanner类
import java.util.Scanner;
public class ScannerDemo2 {
    public static void main(String[] args) {
        // 创建一个Scanner对象
        Scanner sc = new Scanner(System.in);
        // 输入第一个数
        System.out.println("请输入第一个数:");
        int num1 = sc.nextInt();
        // 输入第二个数
        System.out.println("请输入第二个数:");
        int num2 = sc.nextInt();
        // 求和
        int sum = num1 + num2;
        System.out.println("和是:" + sum);
    }
}
