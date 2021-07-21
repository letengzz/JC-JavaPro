package 面向对象.练习题.学生对象;
/**
 * 对象数组
 * 定义类Student 包含三个属性 学号 number(int) 年级state(int) 成绩 score(int)
 * 创建20个学生对象 学号为1到20 年纪和成绩都由随机数确定
 * 问题一 打印出三年级 state值为3 的学生信息
 * 问题二 使用冒泡排序 按学生成绩排序 并遍历所有学生信息
 *
 * 提示
 * 生成随机数 Math.random() 返回值类型为double
 * 四舍五入取整 Math.round(double d) 返回值为long
 *
 * */
public class 学生对象 {
    public static void main(String[] args) {
        //声明一个Students类型的数组
        Students[] s = new Students[20];
        for (int i = 0; i < s.length; i++) {
            //给数组元素赋值
            s[i] = new Students();
            //给student 对象的属性赋值
            s[i].number = (i + 1);
            //年纪[1,6]
            s[i].state = (int)(Math.random() * (6 - 1 + 1) + 1);
            //成绩 [0,100]
            s[i].score = (int)(Math.random() * (100 - 0 + 1));
        }
        //遍历学生数组
        for (int i = 0; i < s.length; i++) {
           // System.out.println(s[i].number + s[i].state + s[i].score);
            System.out.println(s[i].info());
        }
        System.out.println("---------------");
        //问题一打印出三年级 state为3 的学生信息
        for (int i = 0; i < s.length; i++) {
            if (s[i].state == 3){
                System.out.println(s[i].info());
            }
        }
        //问题二 使用冒泡排序按学生成绩排序 并遍历所有学生信息
        for (int i = 0; i < s.length - 1; i++) {
            for (int j = 0; j < s.length - 1 - i; j++) {
                //如果需要换序 交换的是数组的元素 Student对象
                if (s[j].score > s[j + 1].score){
                    Students temp = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = temp;
                }

            }
        }
        System.out.println("-----------");
        //遍历学生数组
        for (int i = 0; i < s.length; i++) {
            // System.out.println(s[i].number + s[i].state + s[i].score);
            System.out.println(s[i].info());
        }
    }
}
class Students{
    int number;//学号
    int state;//年纪
    int score;//成绩

    //显示学生信息的方法
    public String info(){
        return "学号" + number + "年纪" + state + "\t" + "成绩" +score ;
    }
}
