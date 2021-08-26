package 数组.算法.冒泡排序;
/**
 * 数组的冒泡排序的实现
 *
 * */
public class 冒泡排序 {
    public static void main(String[] args) {
        int[] arr = new int[]{3,53,64,44,74,65};
        //冒泡排序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
    }
}
