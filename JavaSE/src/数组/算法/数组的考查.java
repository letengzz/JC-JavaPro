package 数组.算法;
/**
 * 算法的考查 数组的复制、反转、查找（线性查找、二分法查找)
 * */
public class 数组的考查 {
    public static void main(String[] args) {
        String[] arr = new String[]{"d","dg","ds","gd"};
        //数组的复制(区别与数组变量的赋值 arr1 = arr
        String[] arr1 = new String[arr.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }

        //数组的反转
        //方式一
        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - i -1];
            arr[arr.length - i -1] = temp;
        }
        //方式二
        for (int i = 0,j = arr.length; i < j; i++,j--) {
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+"\t");
        }
        //查找(搜索)
        //线性查找
        String dest = "d";
        boolean isFlag = true;
        for (int i = 0; i < arr.length; i++) {
            if (dest.equals(arr[i])){
                System.out.println("位置为" + i);
                isFlag = false;
                break ;
            }
        }
        if (isFlag){
            System.out.println("没找到");
        }
        //二分法查找：
        //前提：所要查找的数组必须有序
        int[] arr2 = new int[]{-95,-33,45,355};
        int dest1 = -33;
        int head = 0;//初始的首索引
        int end = arr2.length - 1;
        boolean isFlag1 = false;
        while (head <= end){
            int middle = (head + end)/2;
            if(dest1 == arr2[middle]){
                System.out.println("找到了指定的元素 位置为" + middle);
                isFlag1 = false;
                break;
            }else if (arr2[middle] > dest1){
                end = middle -1;
            }else {
                //arr[middle] < dest1
                head = middle +1;
            }
        }
        if (isFlag1){
            System.out.println("没找到");
        }
    }
}
