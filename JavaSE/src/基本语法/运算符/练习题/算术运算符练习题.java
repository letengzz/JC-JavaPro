package 基本语法.运算符.练习题;

import java.util.Scanner;

/**
 * 随意给出一个整数，打印显示它的个数位，十位数，百位数的值
 * 格式如下：
 * 数字xxx的情况下
 * 个位数：
 * 十位数：
 * 百位数：
 *
 * */
public class 算术运算符练习题 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  maths = scanner.nextInt();
        int ins = maths / 100;
        System.out.println("百位数：" + ins);
        int tens = maths / 10 % 10; //t22ens = maths % 100 /10
        System.out.println("十位数：" + tens);
        int ones = maths % 10;
        System.out.println("个位数：" + ones);
    }
}
