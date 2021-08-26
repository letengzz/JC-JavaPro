package 面向对象.方法;
/**
 * 类中方法的声明和使用
 *
 * 方法：描述类应该具有的功能
 * 比如：Math类：sqrt()\random()..
 *      Scanner类：nextXxx()..
 *      Arrays类:sort()\binarySeach()\toString()\equals()
 *举例：
 *      public void eat(){}
 *      public void sleep(int hour){}
 *      public String getName(){}
 *      public String getNation(String nation){}
 *方法的声明：权限修饰符 返回值类型 方法名(形参列表){
 *              方法体;
 *          }
 *  注意：static final abstract 来修饰方法
 *
 *  说明：
 *      3.1 关于权限修饰符
 *          java 规定的四种权限修饰符 private public 缺省 protected
 *      3.2 返回值类型：有返回值 vs 没有返回值
 *          3.2.1 如果方法有返回值 则必须在方法声明时指定返回值的类型。同时方法中使用return
 *          关键字来返回指定类型的变量或常量
 *                如果方法没有返回值，则方法声明时 使用void来表示 通常没有返回值的方法中
 *                 就不需要return 关键字
 *                 但是 如果使用 就只能 return; 表示结束此方法的意思
 *          3.2.2 定义方法该不该有返回值
 *                 题目要求
 *                 凭经验
 *      3.3 方法名：属于标识符 遵循标识符的规则和规范 “见名知意”
 *      3.4 形参列表 方法可以声明0个 1个 或多个
 *      格式 数据类型1 形参1 , 数据类型2 形参2 ...
 *      3.5 方法体 ： 方法功能的体现
 * return关键字的使用
 *      1.适用范围，使用在方法体中
 *      2.作用：①结束方法
 *             ②针对有返回值的方法，使用”return 数据“ 方法返回所要的数据
 *      3.注意点 return后面不可以声明执行语句
 * 方法的使用中可以调用当前类的属性或方法
 *          特殊的 方法A中又调用的方法A ：递归方法
 * 方法中 不可以定义方法
 *
 * */
public class 类中方法的声明和使用 {
    public static void main(String[] args) {
        Customer cust = new Customer();
        cust.eat();
        int[] arr = new int[]{1,55,89};
        cust.sort(arr);
    }
}

//客户类
class Customer{
    //属性
    String name;
    int age;
    boolean isMale;

    //方法
    public void eat(){
        System.out.println("吃饭");
        //return; 后不可以声明表达式
//        System.out.println();

    }
    public void sleep(int hour){
        System.out.println("休息了" + hour);
        eat();
        //sleep(10);   栈溢出
    }
    public String getName(){
        return name;
    }
    public String getNation(String nation){
        String info = "我的是" + nation;
        return info;
    }
    public void sort(int[] arr){
    }
    /*public void info(){
        public void swim(){

        }
    }*/
}