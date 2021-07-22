package 基本语法.流程控制.分支结构.练习题.switch练习题;

import java.util.Scanner;

/**
 * 使用switch 把小写类型的char转为大写 只转换abcde 其他的输入"other"
 * */
public class switch练习题 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        char c = word.charAt(0);
        switch (c){
            case 'a':
                System.out.println((char)('a'-32));
                break;
            case 'b':
                System.out.println((char)('b'-32));
                break;
            case 'c':
                System.out.println((char)('c'-32));
                break;
            case 'd':
                System.out.println((char)('d'-32));
                break;
            case 'e':
                System.out.println((char)('e'-32));
                break;
            default:
                System.out.println("other");
        }
    }
}
