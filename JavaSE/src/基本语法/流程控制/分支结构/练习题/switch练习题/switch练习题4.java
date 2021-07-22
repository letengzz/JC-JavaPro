package 基本语法.流程控制.分支结构.练习题.switch练习题;

import java.util.Scanner;

/**
 * 从键盘分别输入年月日 判断这一天是当年 的几天
 * 判断闰年 标准是 可以被4整除但不可被100整除
 * 可以被400整除
 * */
public class switch练习题4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("年");
        int years = scanner.nextInt();
        System.out.println("月");
        int months = scanner.nextInt();
        System.out.println("日");
        int days = scanner.nextInt();

        //定义一个变量存总天数
        int sunday = 0;
        switch (months){
            case 12:
                sunday += 30;
            case 11:
                sunday += 31;
            case 10:
                sunday += 30;
            case 9:
                sunday += 31;
            case 8:
                sunday += 31;
            case 7:
                sunday += 30;
            case 6:
                sunday += 31;
            case 5:
                sunday += 30;
            case 4:
                sunday += 31;
            case 3:
//                sunday += 28;
                if (years % 4 == 0 && years % 100 != 0 || years % 400 == 0){
                    sunday +=29;
                }else {
                    sunday += 28;
                }
            case 2:
                sunday += 31;
            case 1:
                sunday += days;






        }
        System.out.println(sunday);

    }
}
