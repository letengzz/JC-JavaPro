package 基本语法.流程控制.循环结构.练习题.嵌套循环练习题.一百以内所有质数;

/**
 * 100以内的所有的质数
 * 质数：素数 只能被1和本身整除的自然数--》从2开始，到这个数-1结束为止 都不能被这个数本身整除
 * 最小的质数是 2
 *
 * */
public class 一百以内所有质数 {
    public static void main(String[] args) {

        //boolean isFlag = true;//标识i是否被j除尽 一旦除尽 修改其值
        for (int i = 2;i <= 100;i++){//遍历100以内的自然数
            boolean isFlag = true;//标识i是否被j除尽 一旦除尽 修改其值
            for (int j = 2;j < i;j++){//j:被i去除
                if (i % j == 0){
                    isFlag = false;
                }

            }
            if (isFlag == true){
                System.out.println(i);
            }
            //重置isFlag
            //isFlag = true;
        }
    }
}
