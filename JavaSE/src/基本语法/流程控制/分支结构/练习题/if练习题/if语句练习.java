package 基本语法.流程控制.分支结构.练习题.if练习题;

public class if语句练习 {
    public static void main(String[] args) {
        int x = 4;
        int y = 1;
        if (x > 2){
            if (y > 2)
                System.out.println(x + y);
                System.out.println("wuwuwu");
        }else {
            System.out.println("x is" + x);
        }

        boolean b = true;
        if (b == false)
            System.out.println("a");
        else if (b)
            System.out.println("b");
        else if (!b)
            System.out.println("c");
        else
            System.out.println("d");
    }
    //结果 wuwuwu



}
