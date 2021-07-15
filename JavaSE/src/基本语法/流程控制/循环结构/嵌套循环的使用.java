package 基本语法.流程控制.循环结构;
/**
 * 嵌套循环的使用
 *  嵌套循环 将一个循环结构A声明在另一个循环结构B的循环体中，就构成了嵌套循环
 * 2
 * 外层循环：循环结构B
 * 内层循环：循环结构A
 * 说明
 *      内层循环结构遍历一遍 只相当于外层循环体
 * 技巧
 *      外层循环控制行数，内层循环控制列数
 * */
public class 嵌套循环的使用 {
    public static void main(String[] args) {
        //******
        for (int i = 0;i < 6;i++){
            System.out.print("*");
        }
        System.out.println();
        System.out.println("-------");
        /*
        ****
        ****
        ****
        ****
        * */
        for (int i = 0;i < 4;i++){
            for (int j = 0;j < 4;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        /*
        *
        **
        ***
        ****
        * */
        System.out.println("----");
        for (int i = 0;i < 4;i++){
            for (int j = 0;j <= i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        /*
         ****
         ***
         **
         *
         * */
        System.out.println("----");
        for (int i = 0;i < 4;i++){
            for (int j = 0;j < 4-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
