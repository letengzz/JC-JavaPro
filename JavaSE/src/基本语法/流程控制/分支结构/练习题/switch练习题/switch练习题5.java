package 基本语法.流程控制.分支结构.练习题.switch练习题;

import java.util.Scanner;

/**
 * 编写程序 从键盘上读入学生成绩 存放在变量score 根据score输出
 *  score>=90 A
 *  70<= score <90 B
 *  60<= score <70 C
 *  score < 60 D
 *  方式一  使用if-else
 *  方式二 使用switch-case : score/10:  0-10
 * */
public class switch练习题5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入分数");
        int score = scanner.nextInt();
        //if-else
//        if (score >= 90){
//            System.out.println('A');
//        }else if (70 <= score && score < 90){
//            System.out.println('B');
//        }else if (60 <= score && score < 70){
//            System.out.println('C');
//        }else if (score < 60){
//            System.out.println('D');
//        }
        score /= 10;
        switch (score){
            case 10:
            case 9:
                System.out.println('A');
            case 8:
            case 7:
                System.out.println('B');
            case 6:
                System.out.println('C');
            default:
                System.out.println('D');
        }
    }
}
