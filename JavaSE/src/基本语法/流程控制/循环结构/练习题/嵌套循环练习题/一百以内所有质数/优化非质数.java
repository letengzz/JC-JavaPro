package 基本语法.流程控制.循环结构.练习题.嵌套循环练习题.一百以内所有质数;

/**
 * 100以内的所有的质数
 * 质数：素数 只能被1和本身整除的自然数--》从2开始，到这个数-1结束为止 都不能被这个数本身整除
 * 最小的质数是 2
 *              对质数输出问题的优化 添加break
 * */
public class 优化非质数 {
    public static void main(String[] args) {

        //boolean isFlag = true;//标识i是否被j除尽 一旦除尽 修改其值
        //获取当前时间距离1970-01-01 00:00:00 的毫秒数
        long start = System.currentTimeMillis();
        int count = 0;  //记录质数的个数
        for (int i = 2;i <= 100000;i++){//遍历100以内的自然数
            boolean isFlag = true;//标识i是否被j除尽 一旦除尽 修改其值
            for (int j = 2;j < i;j++){//j:被i去除
                if (i % j == 0){
                    isFlag = false;
                    break; //优化一：只对本身非质数的自然数是有效的  100000前所花费的时间为13032 后 所花费的时间为1423

                }

            }
            if (isFlag == true){
//                System.out.println(i);
                count++;

            }
            //重置isFlag
            //isFlag = true;
        }
        //获取当前时间距离1970-01-01 00:00:00 的毫秒数
        long end = System.currentTimeMillis();
        System.out.println(count);
        System.out.println("所花费的时间为"+(end-start));
    }
}
