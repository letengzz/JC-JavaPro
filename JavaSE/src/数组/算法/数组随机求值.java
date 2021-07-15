package JavaSE.数组.算法;
/**
 * 定义一个int型的一维数组 包含10个元素 分别赋予一些随机整数
 * 然后求出所有元素的最大值、最小值 和值 平均值 并输出出来
 * 要求随机数都是两位数
 * [10,99]
 * 公式：(int)(Math.random()*(99-10+1)+10)
 * */
public class 数组随机求值 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*(99-10+1)+10);
        }
        //遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+"\t");
        }
        //求最大值
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(maxValue < arr[i]){
                maxValue = arr[i];
            }
        }
        System.out.println("最大值"+maxValue);
        //求最小值
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(minValue > arr[i]){
                minValue = arr[i];
            }
        }
        System.out.println("最小值"+minValue);
        //求总和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("总和" + sum);
        //求平均数
        int avgValue = sum /arr.length;
        System.out.println("平均数为" + avgValue);
    }
}
