package 基本语法.流程控制.分支结构.练习题.switch练习题;

import java.util.Scanner;

/**
 * 对学生成绩大于60分的 输出合格 低于60分的 输出不合格
 * */
public class switch练习题1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生成绩：");
        int score = scanner.nextInt();
      /*  switch (score / 10){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("不及格");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("及格");
                break;
        }*/
        //更优的解决方案
        switch (score / 60){
            case 0:
                System.out.println("不及格");
                break;
            case 1:
                System.out.println("及格");
                break;
        }
    }
}
