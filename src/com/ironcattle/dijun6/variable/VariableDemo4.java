package com.ironcattle.dijun6.variable;

public class VariableDemo4 {
    public static void main(String[] args) {
        // BMI公式 : 体重 / 身高^2

        // 定义变量记录体重
        double weight = 90.0;
        // 定义变量记录身高
        double height = 1.75;
        // 计算BMI
        double bmi = weight / (height * height);
        System.out.println("BMI = " + bmi);
    }
}
