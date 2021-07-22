package 基本语法.流程控制.循环结构.练习题;

public class 完数 {
    public static void main(String[] args) {
        //int factor = 0;
        for (int i = 1; i <= 1000; i++) {
            int factor = 0;
            //for (int j = 1; j < i; j++) {
            for (int j = 1; j < i/2; j++) {

                if (i % j == 0){
                    factor += j;
                }
            }
            if (i == factor){
                System.out.println(i);
            }
            //重置factor
            //factor = 0;
        }
    }
}
