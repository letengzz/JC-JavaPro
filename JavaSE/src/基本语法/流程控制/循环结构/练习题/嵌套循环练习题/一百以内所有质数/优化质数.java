package 基本语法.流程控制.循环结构.练习题.嵌套循环练习题.一百以内所有质数;

/**
 * 100以内的所有的质数
 * 质数：素数 只能被1和本身整除的自然数--》从2开始，到这个数-1结束为止 都不能被这个数本身整除
 * 最小的质数是 2
 *              对质数输出问题的优化 添加break
 * */
public class 优化质数 {
    public static void main(String[] args) {

        //boolean isFlag = true;//标识i是否被j除尽 一旦除尽 修改其值
        //获取当前时间距离1970-01-01 00:00:00 的毫秒数
        long start = System.currentTimeMillis();
        int count = 0;
        label:for (int i = 2;i <= 100000;i++){//遍历100以内的自然数
            //优化二:对本身是质数的自然数起到作用了

            for (int j = 2;j <= Math.sqrt(i);j++){//j:被i去除
                if (i % j == 0){
                    continue label;
                }

            }
                //能执行到此步骤 都是质数
                count++;


        }
        System.out.println(count);
        //获取当前时间距离1970-01-01 00:00:00 的毫秒数
        long end = System.currentTimeMillis();
        System.out.println("所花费的时间为"+(end-start));
    }
}
