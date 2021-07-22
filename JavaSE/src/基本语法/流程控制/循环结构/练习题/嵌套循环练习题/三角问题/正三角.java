package 基本语法.流程控制.循环结构.练习题.嵌套循环练习题.三角问题;

public class 正三角 {
    public static void main(String[] args) {
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
            *
           **
          ***
         ****
         * */
        for (int i = 0;i < 4;i++){
            for (int j = 0;j < 4-i;j++){
                System.out.print(" ");
            }
            for (int t = 0;t <= i;t++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
