package 基本语法.流程控制.分支结构.练习题.switch练习题;

import java.util.Scanner;

/**
 * 根据用于指定月份 打印该月份所属季节
 * 3,4,5春季 678夏季 9 10 11 秋季 12 1 2 冬季
 *
 * */
public class switch练习题2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int years = scanner.nextInt();
        switch (years){
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
        }
    }
}
