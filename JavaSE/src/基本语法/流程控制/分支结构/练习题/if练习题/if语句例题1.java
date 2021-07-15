package 基本语法.流程控制.分支结构.练习题.if练习题;

import java.util.Scanner;

/**
 * 岳小鹏参加java考试
 * 如果成绩为100分时 奖励一台BMW
 * 如果成绩(80,99]奖励一台iPhone xs
 * 当成绩为[60,80]时奖励一个iPad
 * 其他时 什么奖励都没有
 *
 *
 *
 * */
public class if语句例题1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入岳小鹏的成绩");
        int score = scanner.nextInt();
        if (score == 100){
            System.out.println("奖励一台BMW");
        }else if( score > 80 /*&& score <=99*/){
            System.out.println("奖励iPhone");
        }else if (score >= 60/* && score <= 80*/){
            System.out.println("奖励ipad");
        }else {
            System.out.println("什么都没有");
        }
    }
}
