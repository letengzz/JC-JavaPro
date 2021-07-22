package 基本语法.流程控制.分支结构.练习题.switch练习题;
/**
 * int a = 3;
 * int x = 100;
 * if(a==1)
 *  x+=5;
 * else if(a==2)
 *  x+=10;
 * else if(a==3)
 *  x+=16;
 * else
 *  x+=34;
 *
 * */
public class if语句改switch {
    public static void main(String[] args) {
        int a = 3;
        int x = 100;
        switch (a){
            case 1:
                x+=5;
                break;
            case 2:
                x+=10;
                break;
            case 3:
                x+=16;
                break;
            default:
                x+=34;
        }
    }
}
