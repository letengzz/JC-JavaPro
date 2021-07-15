package 基本语法.流程控制.分支结构.练习题.switch练习题;

import java.util.Scanner;

/**
 * 编写程序 为一个给定的年份找出对应的中国生肖 中国生肖基于12年一个周期
 * 每年用一个动物代表 rat ox tiger rabbit dragon snake horse sheep monkey
 * rooster dog pig
 *
 * 2019:猪 2019% 12 == 3
 * */
public class 中国生肖问题 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份");
        int years = scanner.nextInt();


        years %=12;
        switch (years){
            case 11:
                System.out.println("羊");
                break;
            case 10:
                System.out.println("马");break;
            case 9:
                System.out.println("蛇");break;
            case 8:
                System.out.println("龙");break;
            case 7:
                System.out.println("兔");break;
            case 6:
                System.out.println("虎");break;
            case 5:
                System.out.println("牛");break;
            case 4:
                System.out.println("鼠");break;
            case 3:
                System.out.println("猪");break;
            case 2:
                System.out.println("狗");break;
            case 1:
                System.out.println("鸡");break;
            case 0:
                System.out.println("猴");break;
            default:
                System.out.println("输入大于0的");

        }
    }
}
