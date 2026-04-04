package com.ironcattle.dijun6.variable;

/*
    街头霸王练习
    我方: 叉子
    攻击: 220
    防御: 85
    血量: 1012.5
    技能加成: 1.2

    敌方: 长手
    攻击: 210
    防御: 80
    血量: 1223.3
    技能加成: 1.3

    技能造成伤害的公式:
        攻击力 * 技能加成 - 对方防御力
    普攻造成伤害的公式:
        攻击力 - 对方防御力
    question1.
        我方第一次进行普通攻击,造成多少伤害,对方剩余多少血
    question2.
        我方第一次进行技能攻击,造成多少伤害,对方剩余多少血

 */
public class VariableDemo2 {
    public static void main(String[] args) {
        // 定义我方攻击
        int my_attack = 220;
        // 定义我方防御
        int my_defense = 85;
        // 定义我方血量
        double my_health = 1012.5;
        // 定义我方技能加成
        double my_skill = 1.2;

        // 定义敌方攻击
        int enemy_attack = 210;
        // 定义敌方防御
        int enemy_defense = 80;
        // 定义敌方血量
        double enemy_health = 1223.3;
        // 定义敌方技能加成
        double enemy_skill = 1.3;

        // question1.
        double round_1_attack = my_attack - enemy_defense;
        enemy_health = enemy_health - round_1_attack;
        System.out.println("我方第一次进行普通攻击,造成" + round_1_attack + "点伤害,对方剩余" + enemy_health + "点血量");
        // question2.
        double round_2_attack = my_attack * my_skill - enemy_defense;
        enemy_health = enemy_health - round_2_attack;
        System.out.println("我方第二次进行技能攻击,造成" + round_2_attack + "点伤害,对方剩余" + enemy_health + "点血量");
    }
}
