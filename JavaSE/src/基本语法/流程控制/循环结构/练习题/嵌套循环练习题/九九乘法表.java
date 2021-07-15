package 基本语法.流程控制.循环结构.练习题.嵌套循环练习题;
/**
* 九九乘法表
 * 1*1=1
 * 2*1=2 2*2=4
 * ---
 * 9*1=9
* */
public class 九九乘法表 {
    public static void main(String[] args) {
        for (int i = 1;i <= 9;i++){
            for (int j = 1;j <= i;j++){
                System.out.print(j + "*" + i + "=" + i*j +" ");
            }
            System.out.println();
        }
    }
}