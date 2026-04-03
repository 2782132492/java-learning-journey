package com.ironcattle.dijun6;

public class VariableDemo1 {
    public static void main(String[] args) {
        /*
            微信余额: 0元
            支付宝余额: 10元
            银行卡余额: 20元
                现在一共有多少钱
                微信收了10元又发了2元,余额多少
         */

        // 定义一个整数类型的变量,用于存储微信余额
        int wx_balance = 0;
        // 定义一个整数类型的变量,用于存储支付宝余额
        int zfb_balance = 10;
        // 定义一个整数类型的变量,用于存储银行卡余额
        int bank_balance = 20;
        // 定义一个整数类型的变量,用于存储总余额
        int total_balance = wx_balance + zfb_balance + bank_balance;
        // question1: 现在一共有多少钱
        System.out.println("现在在一共有" + total_balance + "元");
        // question2: 微信收了10元又发了2元,余额多少
        // 微信收10元
        wx_balance += 10;
        // 微信发了2元
        wx_balance -= 2;
        System.out.println("微信余额是: " + wx_balance);
    }
}