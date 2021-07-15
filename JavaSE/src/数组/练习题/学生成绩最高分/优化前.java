package JavaSE.数组.练习题.学生成绩最高分;

import java.util.Scanner;

/**
 * 从键盘读入学生成绩找出最高分 并输出学生成绩等级
 * 成绩 >= 最高分-10 等级为A
 * 成绩 >= 最高分-20 等级为B
 * 成绩 >= 最高分-30 等级为C
 * 其余 等级为D
 *
 * */
public class 优化前 {
    public static void main(String[] args) {
        //1使用Scanner读取学生个数
        System.out.print("输入学生人数：");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num);
        //2创建数组，存储学生成绩，动态初始化
        int[] scores = new int[num];
        System.out.println("请输入"+ num + "学生成绩");
        //3给数组中的元素赋值
        for (int i = 0; i < num; i++) {
           scores[i] = scanner.nextInt();
        }
        //4获取数组中的元素的最大值：最高分
        int maxScore = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > maxScore){
                maxScore = scores[i];
            }
        }
        System.out.println(maxScore);
        //5根据每个学生成绩与最高分的差值得到每个学生的等级 并输出等级和成绩
        char level;
        for (int i = 0; i < scores.length; i++) {
            int temp = maxScore - scores[i];
            if (temp <= 10){
                level = 'A';
            }else if (temp <=20){
                level = 'B';
            }else if (temp <=30){
                level = 'C';
            }else {
                level = 'D';
            }
        System.out.println("student " + i + " score is" + scores[i] + "grade is " + level);
        }

    }
}
