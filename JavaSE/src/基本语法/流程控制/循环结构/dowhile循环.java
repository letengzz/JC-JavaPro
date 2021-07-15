package 基本语法.流程控制.循环结构;
/**
 * do-while
 * 循环结构的四要素
 * ①初始化条件
 * ②循环条件 --》是boolean 类型
 * ③循环体
 * ④迭代条件
 *
 * do-while 循环结构
 *
 * ①
 * do{
 *     ③;
 *     ④;
 * }while(②);
 *
 * 执行过程 ①-③-④-②-③-④-。。。-②
 * 说明
 * do-while 循环至少执行一次循环体
 *
 * */
public class dowhile循环 {
    public static void main(String[] args) {
        //遍历100以内的偶数
        int num = 0;
        int sum = 0;//记录总和
        int count = 0;//记录个数
        do {
            if (num % 2 == 0){
                System.out.println(num);
                count++;
                sum += num;
            }
            num++;
        }while (num <= 10);
        System.out.println(count);
        System.out.println(sum);
    }
}
