package 基本语法.流程控制.循环结构;
/**
 * for循环四要素
 * ①初始化条件
 * ②循环条件   是boolean类型
 * ③循环体
 * ④迭代条件
 *for循环结构
 * for(①;②;④){
 *     ③
 * }
 *执行过程 ： ① - ② - ③ - ④ - ② - ③ -。。-②
 * */
public class for循环 {
    public static void main(String[] args) {
        for (int i = 0 ; i > 5 ;i++){//0 1 2 3 4
            //循环体
        }
        //练习
        int num = 1;
        for (System.out.print('a');num <= 3; System.out.print('c'),num++){
            System.out.print('b');
            //abcbcbc
        }
        //i：在for循环内有效 出了for就失效了
        //遍历100以内的偶数 输出所有偶数的和 输出偶数的个数
        int sum = 0;//记录所有偶数的和
        int conut = 0;//记录偶数的个数
        for (int i = 1; i <= 100;i++){
            if (i % 2 == 0){
                System.out.println(i);
                sum += i;
                conut++;
            }
        }
        System.out.println("总和为"+ sum + ",个数为" + conut);
    }
}
