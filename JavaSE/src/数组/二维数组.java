package 数组;

/**
 *
 * 二维数组的使用
 *  规定：二维数组分为外层数组的元素，内层数组的元素
 *      int[] arr = new int[4][3];
 *      外层元素 arr[0] arr[1]等
 *      内层元素 arr[0][0] arr[1][2]等
 * 理解
 *  对于二维数组的理解 可以看成一维数组array1又作为另一个一维数组array2的元素而存在
 *  数组元素的默认初始化
 *      针对初始化方式一 比如 int[][] arr = new int[4][3];
 *          外层元素的初始化值：地址值
 *          内层元素的初始化值 与一维数组初始化情况相同
 *      针对初始化方式二 比如 int[][] arr = new int[4][];
 *          外层元素的初始化值：null
 *          内层元素的初始化值 不能调用 否则报错
 *
 *  二维数组的使用
 *      二维数组的声明和初始化
 *      如何调用数组的指定位置的元素
 *   	如何获取数组的长度
 *      如何遍历数组
 *    	数组元素的默认初始化值
 *     	数组的内存解析
 * */
public class 二维数组 {
    public static void main(String[] args) {
        //二维数组的初始化
        int[] arr = new int[]{1,2,3};
        //静态初始化
        int[][] arr1 = new int[][]{{1,2,3},{4,5},{6,7,8}};
        //动态初始化1
        String[][] arr2 = new String[3][2];
        //动态初始化2
        String[][] arr3 = new String[3][];
        System.out.println(arr3[1]);//null
        arr3[1] = new String[4];
        //错误
        //String[][] arr4 = new String[][2];
        // int[4][4] arr4 = new int[][];
        // int[][] arr4 = new int[3][4]{{1,2,3},{4,5},{6,7,8}};
        //正确
        int[] arr4[] = new int[][]{{1,2,10},{2,5}};
        int[] arr5[] = {{1,2},{6,5}};

        // 如何调用数组的指定位置的元素
        System.out.println(arr1[0][1]); //2
        System.out.println(arr2[1][1]); //null

        arr3[1] = new String[4];
        System.out.println(arr3[1][0]);

        //获取数组的长度
        System.out.println(arr4.length);//2
        System.out.println(arr4[0].length);//3

        //遍历二维数组
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                System.out.print(arr4[i][j]+" ");
            }
            System.out.println();
        }
        //数组元素的默认初始化值
        int[][] arr6 = new int[4][3];
        System.out.println(arr6[0]);//[I@7699a589地址值
        System.out.println(arr6[0][1]);//0
        System.out.println(arr6);//[[I@58372a00

        float[][] arr7 = new float[4][3];
        System.out.println(arr7[0]);//[F@4dd8dc3地址值
        System.out.println(arr7[0][1]);//0.0
        System.out.println(arr7);//[[F@6d03e736

        String[][] arr8 = new String[4][3];
        System.out.println(arr8[1]);//地址值
        System.out.println(arr8[1][2]);//null

        double[][] arr9 = new double[4][];
        System.out.println(arr9[1]);//null
        //System.out.println(arr9[1][0]);//报错 空指针异常

    }
}
