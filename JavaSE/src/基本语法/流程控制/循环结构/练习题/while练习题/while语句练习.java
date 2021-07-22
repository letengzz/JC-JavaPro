package 基本语法.流程控制.循环结构.练习题.while练习题;

public class while语句练习 {
    public static void main(String[] args) {
        //遍历100以内的所有偶数
        int i = 1;
        while (i <= 100){
            if (i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
        System.out.println(i);
    }
}
