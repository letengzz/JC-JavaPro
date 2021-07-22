package 基本语法.流程控制.分支结构.练习题.switch练习题;

import java.util.Scanner;

/**
 * 从键盘输入2019的month 和day 要求通过程序输出输入的日期为2019 的第几天
 * */
public class switch练习题3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("2019的月份");
        int month = scanner.nextInt();
        System.out.println("2019的天数");
        int day = scanner.nextInt();
        //定义一个变量存总天数
        int sunday = 0;
        switch (month){
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
                sunday += 28;
            case 2:
                sunday += 31;
            case 1:
                sunday += day;
        }
        System.out.println(sunday);
    }
}
