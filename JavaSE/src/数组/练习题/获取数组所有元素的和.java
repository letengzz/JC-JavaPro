package 数组.练习题;
/**
 * 获取arr数组所有元素的和
 *     j=0 j=1 j=2 j=3
 * i=0  3   5   8   -
 * i=1  12  9   -   -
 * i=2  7   0   6   4
 * */
public class 获取数组所有元素的和 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{3,5,8},{12,9},{7,0,6,4}};
        int sum = 0;//记录总和
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("总和"+sum);
    }
}
