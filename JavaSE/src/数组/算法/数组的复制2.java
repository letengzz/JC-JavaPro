package JavaSE.数组.算法;
/**
 * 使用简单数组
 * (1)在main()方法中声明array1和array2两个变量,他们是int []类型的数组。
 * (2)使用大括号{},把array1初始化为8个素数, 2,3,5,7,11, 13, 17,19.
 * (3)显示array1的内容。
 * (4)赋值array2变量等于array1,修改array2中的偶索引元素,使其等于索引值(如array [e]=e, array [2]=2)。
 * 打印出array1.
 * *思考: array1和array2是什么关系?arr1和arr2地址值相同，都指向了堆空间的唯一的数组实体
 * 拓展:修改题目,实现array2对array1数组的复制
 *
 * */
public class 数组的复制2 {
    public static void main(String[] args) {
        int[] arr1,arr2;
        arr1 = new int[]{2,3,5,7,11, 13, 17,19};

        //显示arr内容
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }
        //赋值arr2中的偶索引元素
        arr2 = new int[arr1.length];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            if (i % 2 == 0){
                arr2[i] = i;
            }
        }
        System.out.println();
        //打印arr1
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i] + "\t");
        }
    }
}
