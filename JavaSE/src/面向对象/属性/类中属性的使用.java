package 面向对象.属性;
/**
 * 属性(成员变量) vs 局部变量
 *
 * 1.相同点
 *      1.1定义变量的格式:数据类型 变量名 = 变量值;
 *      1.2先声明 后使用
 *      1.3变量都有其对应的作用域
 * 2.不同点
 *      2.1在类中声明的位置的不同
 *      属性:直接定义在一对{}中
 *      局部变量:声明在方法内、方法形参、代码块、构造器内部的变量
 *      2.2关于权限修饰符的不同
 *      属性:可以在声明属性时，指明其权限 使用权限修饰符
 *          常用的权限修饰符 private public 缺省 protected  -->封装性
 *      局部变量 不可以使用权限修饰符
 *      2.3默认初始化值
 *      属性:类的属性，根据其类型 都有默认初始化值
 *          整数（byte、short、int、long）：0
 *          浮点数（float、double）：0.0
 *          字符型（char）：0（或'\u0000')
 *          布尔型（boolean）；false
 *
 *          引用数据类型（类，数组，接口）：null
 *      局部变量: 没有默认初始化值 意味着在调用局部变量之前一定要显式赋值
 *          特别的 形参在调用时 赋值即可
 *      2.4在内存中加载的位置
 *      属性：加载到堆空间中（非static）
 *      局部变量：加载到栈空间中
 *
 *
 * */
public class 类中属性的使用 {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.age);

    }
}
class User{
    //属性(成员变量)
    private String name;
    public int age;
    boolean isMale;

    public void talk(String language){//language:形参 也是局部变量
        System.out.println("使用" + language);
    }
    public void eat(){
        String food = "烙饼"; //局部变量
        System.out.println("喜欢吃" + food);
    }
}