package com.ironcattle.dijun6.scanner;
// 导入Scanner类
import java.util.Scanner;
public class ScannerDemo3 {
    public static void main(String[] args) {

        // 键盘录入人体数据计算BMI

        Scanner sc = new Scanner(System.in);
        // 录入身高
        System.out.println("请输入身高: ");
        double tall = sc.nextDouble();
        // 录入体重
        System.out.println("请输入体重: ");
        double weight = sc.nextDouble();
        // 计算BMI
        double bmi = weight / (tall * tall);
        System.out.println("BMI = " + bmi);
    }
}
