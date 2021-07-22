package 基本语法.流程控制.分支结构;
/**
 *switch-case
 * 格式
 * switch(表达式){
 *     case 常量1;
 *      执行语句1;
 *      //break;
 *     case 常量2;
 *      执行语句2
 *      //break;
 *     default:
 *      执行语句n;
 *      //break;
 * }
 *
 * 说明
 * ①根据switch 表达式中的值 依次匹配各个case中的常量 一旦匹配成功 则进入相应的case结构中调用其执行语句
 * 当调用完执行语句以后 则仍然继续向下执行其他case结构中的执行语句 直到遇到break关键字或此switch-case机构末尾结束为止
 *②break可以使用在switch-case结构中 表示一旦执行此关键字就跳出switch-case结构中
 *③switch 结构中的表达式 只能是如下6种类型 byte、short、char、int、枚举类型(jdk5.0)、String类型(jdk7.0新增)
 * ④case之后只能声明常量，不能声明范围
 * ⑤break关键字是可选的
 * ⑥default 相当于else
 *      default 可选的，位置是灵活的
 *如果switch case 结构中的多个case的执行语句相同 则可以考虑进行合并
 *
 * 说明 凡是使用switch-case的结构 都可以转换为if-else 反之不成立
 * 当写分支结构时 既可以 又可以 （case不太多)优先选择switch-case
 *      原因 switch-case 执行效率稍高
 * */
public class switchcase {
        public static void main(String[] args) {
            int num = 1;
            switch (num){
                case 0:
                    System.out.println("0");
                    break;
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;

            }
        }
}

