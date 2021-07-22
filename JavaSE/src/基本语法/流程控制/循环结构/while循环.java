package 基本语法.流程控制.循环结构;
/**
 * while 循环使用
 * 循环结构的四要素
 * ①初始化条件
 * ②循环条件 --》是boolean 类型
 * ③循环体
 * ④迭代条件
 *①
 * while(②){
 *  ③;
 *  ④;
 * }
 * 执行过程 ①-②-③-④-②-③-④。。。-②
 * 说明
 * 1千万小心丢了迭代条件 一旦丢了 可能导致死循环
 * 2要避免死循环
 * 3for循环和while可以相互转换
 *      区别 for 和while初始化条件的作用范围不同
 * 算法 : 有限性
 * */
public class while循环 {
    public static void main(String[] args) {
        //遍历100以内的所有偶数
        int i = 1;
        while (i <= 100){
            if (i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
        //出了while之后仍可以调用
        System.out.println();
        System.out.println(i);//101
    }
}
