package com.ironcattle.dijun6;

public class VariableDemo3 {
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
    public static void main(String[] args) {
        // 定义int类
        int my_attack, enemy_attack, my_defense, enemy_defense;
        my_attack = 220;
        enemy_attack = 210;
        my_defense = 85;
        enemy_defense = 80;
        // 定义double类
        double my_health, enemy_health, my_skill, enemy_skill;
        my_health = 1012.5;
        enemy_health = 1223.3;
        my_skill = 1.2;
        enemy_skill = 1.3;
        // 计算第一次伤害
        double round_1_attack = my_attack - enemy_defense;
        enemy_health = enemy_health - round_1_attack;
        System.out.println("我方第一次进行普通攻击,造成" + round_1_attack + "点伤害,对方剩余" + enemy_health + "点血量");
        // 计算第二次伤害
        double round_2_attack = my_attack * my_skill - enemy_defense;
        enemy_health = enemy_health - round_2_attack;
        System.out.println("我方第二次进行技能攻击,造成" + round_2_attack + "点伤害,对方剩余" + enemy_health + "点血量");
    }
}
