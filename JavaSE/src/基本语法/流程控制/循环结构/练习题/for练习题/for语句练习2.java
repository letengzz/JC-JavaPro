package 基本语法.流程控制.循环结构.练习题.for练习题;



/**
 * 打印1-100之间所有奇数的和
 * 打印1-100之间所有是7的倍数的整数的个数及总和
 * 输出所有的水仙花数 水仙花数是指一个三位数 其各个位数字立方和等于其本身
 *      153 = 1*1*1+3*3*3+5*5*5
 * */
public class for语句练习2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100;i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
        System.out.println("=====");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0){
                System.out.println(i);
                sum++;
            }
        }
        System.out.println("sum"+sum);


        for (int i = 100; i <= 999; i++) {
           int ins = i / 100;
           int tens = i /10 % 10;
           int ones = i % 10;
           int sums = ins * ins * ins + tens * tens *tens + ones * ones * ones;
           if (i == sums){
               System.out.println(i);
           }
        }
    }

}
