package 基本语法.流程控制.循环结构.练习题.嵌套循环练习题.一百以内所有质数;
/*
*
* */
public class 质数实现用法2 {
    public static void main(String[] args) {
        //boolean isFlag = true;//标识i是否被j除尽 一旦除尽 修改其值
        //获取当前时间距离1970-01-01 00:00:00 的毫秒数
        long start = System.currentTimeMillis();

        for (int i = 2;i <= 100000;i++){//遍历100以内的自然数
            boolean isFlag = true;//标识i是否被j除尽 一旦除尽 修改其值
            //优化二:对本身是质数的自然数起到作用了

            for (int j = 2;j <= Math.sqrt(i);j++){//j:被i去除
                if (i % j == 0){
                    isFlag = false;
                    break; //优化一：只对本身非质数的自然数是有效的  100000前所花费的时间为13032 后 所花费的时间为61

                }

            }
            if (isFlag == true){
                System.out.println(i);
            }
            //重置isFlag
            //isFlag = true;
        }
        //获取当前时间距离1970-01-01 00:00:00 的毫秒数
        long end = System.currentTimeMillis();
        System.out.println("所花费的时间为"+(end-start));
    }
}
