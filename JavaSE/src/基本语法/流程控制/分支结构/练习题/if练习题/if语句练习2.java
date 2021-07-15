package 基本语法.流程控制.分支结构.练习题.if练习题;

import java.util.Scanner;

/**
 * 假设你想开发一个玩彩票的游戏，程序随机地产生一个两位数的彩票，提示用户输入一个两位数,然后按照下面的规则判定用户是否能赢。
 * 1)如果用户输入的数匹配彩票的实际顺序,奖金10 000美元。
 * 2)如果用户输入的所有数字匹配彩票的所有数字，但顺序不一致，奖金3000美元。
 * 3)如果用户输入的一个数字仅满足顺序情况下匹配彩票的一个数字，奖金1000美元。
 * 4)如果用户输入的一个数字仅满足非顺序情况下匹配彩票的一个数字，奖金500美元。
 * 5)如果用户输入的数字没有匹配任何一个数字,则彩票作废。
 * 提示:使用（int)(Math.random()*90 +10)产生随机数。
 * Math.random():[0,1)*90>[0,90) + 10→>[10,100) >[10,99]
 * */
public class if语句练习2 {
    public static void main(String[] args) {
        //如何获取一个随机数
        int value = (int)(Math.random()*90+10); //[0.0,1.0) --> [0.0,90.0) --> [10.0,100.0) -->强转之后 [10,99]
        //公式 [a,b]: (int)(Math.random() * (b-a+1) + a)
        System.out.println(value);
        int randomTen = value / 10;
        int randomGe = value %10;

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两位数");
        int maths = scanner.nextInt();
        int mathsTen = maths / 10;
        int mathsGe = maths %10;

        if (maths == value){
            System.out.println("奖金10 000美元。");
        }else if (randomTen == mathsGe && randomGe == mathsTen){
            System.out.println("奖金3000美元。");
        }else if (randomTen == mathsTen || randomGe == mathsGe){
            System.out.println("奖金1000美元。");
        }else if (randomTen == mathsGe || randomGe == mathsTen){
            System.out.println("奖金500美元。");
        }else {
            System.out.println("彩票作废。");
        }

    }
}
