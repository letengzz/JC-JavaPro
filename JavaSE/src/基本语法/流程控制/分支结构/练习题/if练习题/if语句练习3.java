package 基本语法.流程控制.分支结构.练习题.if练习题;

import java.util.Scanner;

/**
 * 男大当婚女大当嫁 要提出一些条件
 *      高：180cm以上 富：财富1千万以上 帅 ：是
 *     如果三个条件同时满足 则 "我一定要嫁给他"
 *     如果三个条件有为真的情况 则 "嫁吧 "
 *     如果三个条件都不满足 则 "不嫁"
 * */
public class if语句练习3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入身高");
        double height = scanner.nextDouble();

        System.out.println("请输入财富");
        double wealth = scanner.nextDouble();

        System.out.println("帅吗");
        String isHandsome = scanner.next();


        if (height >= 180 && wealth > 1 && isHandsome.equals("帅")){
            System.out.println("我一定要嫁给他");
        }else if (height >= 180 || wealth > 1 || isHandsome.equals("帅")){
            System.out.println("嫁吧 ");
        }else {
            System.out.println("不嫁");
        }


    }
}
