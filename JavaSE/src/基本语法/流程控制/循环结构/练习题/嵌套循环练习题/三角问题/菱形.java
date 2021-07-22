package 基本语法.流程控制.循环结构.练习题.嵌套循环练习题.三角问题;

public class 菱形 {
    public static void main(String[] args) {
        /*
          *
         * *
        * * *
       * * * *
      * * * * *
       * * * *
        * * *
         * *
          *
         * */

        // 上半部分
        for (int i = 0; i < 5; i++) {
            // 输出“-”
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }

            // 输出“* ”
            for (int k = 0; k < i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // 下半部分
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 4 - i; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}
