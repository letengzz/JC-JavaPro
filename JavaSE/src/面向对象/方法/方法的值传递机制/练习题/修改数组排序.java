package 面向对象.方法.方法的值传递机制.练习题;

/**
 * @version 1.0
 * @ClassName 修改数组排序
 * @Description TODO
 * @Author letengzz
 * @Date 2021/8/18 18:10
 **/
public class 修改数组排序 {
    public static void main(String[] args) {
        int[] a = new int[]{2,5,66,11,22};
        Data data = new Data();
        data.print(a);
        System.out.println();
        data.sort(a);
        data.print(a);
        
    }

}
class Data{
    //遍历数组
    public void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    //数组的排序
    public void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1] ){
                    //错误的
                    swap(arr[j],arr[j + 1]);
                    //正确的
                    swap(arr,j,j+1);
                }
            }
        }
    }
    //交换数组中指定两个位置元素的值
    public void swap(int i,int j){
        int temp = i;
        i = j;
        j = temp;
    }
    public void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
