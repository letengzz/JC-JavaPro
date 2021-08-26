package 数组;
/*
 * 一 数组的概述
 * 	1.数组(Array)，是多个相同类型数据按一定顺序排序的集合，并使用一个名字命名
 * 并通过编号的方式对这些数据进行统一管理
 *  2.数组的概念
 *  》数组名
 *  》元素
 *  》角标、索引、下标
 *  》数组的长度：元素的个数
 *
 *  3.数组的特点 ：
 *  	数组是有序排列的
 *  	数组属于引用数据类型的变量，数组的元素 既可以是基本数据类型 也可以是引用数据类型
 *  	创建数组对象会在内存中开辟一整块连续的空间
 *  	数组的长度一旦确定就不能修改
 *  4.数组的分类
 *  	按照维数 一维数组 二维数组
 *  	按照数组元素的类型 基本数据类型元素的数组 引用数据类型元素的数组
 *
 *  5.一维数组的使用
 *  	一维数组的声明和初始化
 *  	如何调用数组的指定位置的元素
 *  	如何获取数组的长度
 *  	如何遍历数组
 *  	数组元素的默认初始化值
 *  	数组的内存解析
 *
 */
public class 一维数组 {
    public static void main(String[] args) {
        //一维数组
        //一维数组的声明和初始化
        int[] ids;//声明
        //静态初始化:数组的初始化和数组元素的赋值操作同时进行
        ids = new int[] {1001,1002,1003,1004};

        //动态初始化:数组的初始化和数组元素的赋值操作分开进行
        String[] names = new String[3];

        //错误写法
//		int[] arr1 = new int[];
//		int[5] arr2 = new int[5];
//		int[] arr3 = new int[3] {21,55,55};
        //正确的
        int[] arr9 = {1,2,3,5,6};   //类型推断
        //总结 数组一旦初始化完成，其长度就确定了

        //如何调用数组的指定位置的元素:通过角标的方式调用
        //数组的角标（索引）从0开始的 到数组的长度-1结束
        names[0] = "网民";
        names[1] = "libai";
        names[2] = "libi";//chatAt(0)

        //如何获取数组的长度 属性 length
        System.out.println(names.length);

        //如何遍历数组
        for(int i = 0;i < names.length;i++) {
            System.out.println(names[i]);
        }

        //数组元素的默认初始化值
        //数组元素是整型 0
        //数组元素是浮点型 0.0
        //数组元素是char '0'或 '\u0000' 而非0
        //数组元素是boolean型 false
        //数组元素是引用数据类型:null

        int[] csh1 = new int[4];
        System.out.println(csh1[1]);

        short[] csh2 = new short[4];
        System.out.println(csh2[1]);

        char[] cs = new char[1];
        System.out.println(cs[0]);
        if(cs[0] == 0) {
            System.out.println("0");
        }
        System.out.println("---");
        boolean[] arr4 = new boolean[2];
        System.out.println(arr4[0]);
        System.out.println("---");
        String[] arr5 = new String[5];
        System.out.println(arr5[1]);
        if(arr5[0] == null) {
            System.out.println("ll");
        }

        //数组的内存解析


    }
}
