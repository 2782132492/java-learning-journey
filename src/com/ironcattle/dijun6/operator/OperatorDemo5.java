package com.ironcattle.dijun6.operator;

public class OperatorDemo5 {
    public static void main(String[] args) {
        // 练习1
        byte b = 100;
        short c = 200;
        double d = 20.3;

        // 计算时候的数据类型
        // byte 与 short 会 升位到 int
        // int 与 double 相加 会 升位到 double
        // 低位 + 高位 会 采取 高位
        // byte 和 short 会自动升为 int

        // 错误示例
        //byte e = b +c;
        //System.out.println(e);
        // java: 不兼容的类型: 从int转换到byte可能会有损失

        // 正确示例
        int e = b + c;
        System.out.println(e);
        double f = d + b + c;
        System.out.println(f);
    }
}
