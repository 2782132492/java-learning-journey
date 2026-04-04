package com.ironcattle.dijun6.operator;

public class OperatorDemo4 {
    public static void main(String[] args) {
        // 数据类型转换

        // byte
        byte num1 = 100;
        byte num2 = 127;
        // 这里是错误的,以为值超过byte的范围
        //byte num3 = num1 + num2;
        // 采用强制转换
        byte num3 = (byte) (num1 + num2);
        System.out.println(num3);
        // 这里也是错误的,因为转换的实际是去掉前面的位
        // 正确方法
        int num4 = num1 + num2;
        System.out.println(num4);
    }
}
