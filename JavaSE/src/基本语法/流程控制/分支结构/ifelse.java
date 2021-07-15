package 基本语法.流程控制.分支结构;
/**
 * 分支结构的if-else(条件判断)
 *
 * else 是可选的
 * 针对多个条件表达式之间是互斥关系(没有交集的关系 哪个判断和执行语句在上面 还是下面都无所谓
 * 如果多个条件表达式之间有交集关系，需要根据实际情况考虑清楚 哪个声明在上面
 * 如果多个条件表达式之间有包含关系，通常条件下 需要将范围小的声明在范围大的上面 否则范围小的没机会
 *
 *  if-else 结构是可以相互嵌套的
 *  如果if-else结构中的执行语句只有一行时 对应的{}可以省略 但是不建议
 *
 * 三种结构
 *  第一种
 *  if(条件表达式){
 *      执行表达式
 *  }
 *
 *  第二种 二选一
 *  if(条件表达式){
 *      执行表达式1
 *  }else{
 *      执行表达式2
 *  }
 *  第三种 n选一
 *  if(条件表达式){
 *  *      执行表达式1
 *  *  }else if(条件表达式){
 *  *      执行表达式2
 *  *  }...
 *     else{
 *         执行表达式n
 *     }
 *
 * */
public class ifelse {
    public static void main(String[] args) {
        //举例1
        int heartBeats = 78;
        if (heartBeats < 60 || heartBeats >100){
            System.out.println("需要进一步检查");
        }
        System.out.println("检查结束");

        //举例二
        int age = 23;
        if(age < 18){
            System.out.println("你可以看动画片");
        }else {
            System.out.println("可以看成人电影");
        }

        //举例3
        if (age < 0){
            System.out.println("输入非法");
        }else if (age < 18){
            System.out.println("青少年");
        }else if(age < 35){
            System.out.println("青壮年");
        }else if (age < 120){
            System.out.println("老年");
        }else {
            System.out.println("不行");
        }

    }
}
