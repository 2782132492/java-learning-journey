package com.ironcattle.dijun6.operator;

// 导入Scanner类
import java.util.Scanner;

public class OperatorDemo2 {
    public static void main(String[] args) {
        // 键盘录入一个3位数,拆出它的个位,十位,百位

        Scanner sc = new Scanner(System.in);
        // 键盘录入一个3位数
        System.out.println("请输入一个3位数: ");
        int num = sc.nextInt();
        // 拆出个位
        int ge = num % 10;
        System.out.println("个位是:" + ge);
        // 拆出十位
        int shi = num / 10 % 10;
        System.out.println("十位是:" + shi);
        // 拆出百位
        int bai = num / 100;
        System.out.println("百位是:" + bai);

    }
}
