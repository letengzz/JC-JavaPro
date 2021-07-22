# *<u>**基本语法**</u>*

## 变量 ---> [Here](https://github.com/letengzz/JC-JavaPro/tree/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E5%8F%98%E9%87%8F)

1. ### 变量的使用

`java`定义变量的格式：

```java
数据类型 变量名 = 变量值
```

**说明：**

  ①变量必须先声明，后使用

   ②变量都定义在其作用域内 在作用域有效 出了失效

  ③同一作用域内 不可以同时声明两个同名变量

------

2. ### 变量类型

#### 数据类型分类: 

####        **变量按照数据类型分**

#### var字符 ---> [Here](https://github.com/letengzz/JC-JavaPro/blob/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E6%95%B0%E6%8D%AE%E7%B1%BB%E5%9E%8B/var%E7%B1%BB%E5%9E%8B.java)

有些时候，类型的名字太长，写起来比较麻烦。例如：

```
StringBuilder sb = new StringBuilder();
```

这个时候，如果想省略变量类型，可以使用var关键字：

```
var sb = new StringBuilder();
```

编译器会根据赋值语句自动推断出变量`sb`的类型是`StringBuilder`。对编译器来说，语句：

```
var sb = new StringBuilder();
```

实际上会自动变成：

```
StringBuilder sb = new StringBuilder();
```

因此，使用var定义变量，仅仅是少写了变量类型而已。

------

#####   		基本数据类型 ---> [Here](https://github.com/letengzz/JC-JavaPro/tree/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E6%95%B0%E6%8D%AE%E7%B1%BB%E5%9E%8B/%E5%9F%BA%E6%9C%AC%E6%95%B0%E6%8D%AE%E7%B1%BB%E5%9E%8B)

```
  整型 byte、short、int、long

  浮点型 float、double
   
  字符型 char

  布尔型 boolean
```

#####   		引用数据类型 ---> [Here](https://github.com/letengzz/JC-JavaPro/tree/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E6%95%B0%E6%8D%AE%E7%B1%BB%E5%9E%8B/%E5%BC%95%E7%94%A8%E6%95%B0%E6%8D%AE%E7%B1%BB%E5%9E%8B)

```
  类(class)(包括 String关键字)

  接口(interface)

  数组(array)
```

------


####  变量按照声明的位置

#####   		成员变量 

 定义变量的格式:数据类型 变量名 = 变量值;

* 先声明 后使用

* 变量都有其对应的作用域
  在类中声明的位置：直接定义在一对{}中

* 权限修饰符可以在声明属性时，指明其权限 使用权限修饰符
  
  常用的权限修饰符 **private public 缺省 protected  -->封装性**
  
* 根据其类型，有默认初始化值
  
    * 整数（byte、short、int、long）：`0`
    * 浮点数（float、double）：`0.0`
    * 字符型（char）：`0（或'\u0000')`
    * 布尔型（boolean）:`false`
    
    * 引用数据类型（类，数组，接口）：`null`
  
* 在内存中加载到堆空间中（非static）

#####   		局部变量

 定义变量的格式:数据类型 变量名 = 变量值;
* 先声明 后使用

* 变量都有其对应的作用域
  在类中声明的位置：声明在方法内、方法形参、代码块、构造器内部的变量

* 不可以使用权限修饰符

* 没有默认初始化值 意味着在调用局部变量之前一定要显式赋值

  ​	特别的 形参在调用时 赋值即可
  
* 在内存中加载到栈空间中

------

## 类型转换 ---> [Here](https://github.com/letengzz/JC-JavaPro/tree/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E7%B1%BB%E5%9E%8B%E8%BD%AC%E6%8D%A2)

基本数据类型运算规则

**前提**:只是七种基本数据类型变量间的运算,不包含 boolean类型

------

* ### 1.自动类型提升

  当容量小的数据类型的变量与容量大的数据类型做运算 结果自动提升为容量大的数据类型

  ```
  byte、char、short-->int--->long-->float-->double
  ```

  当byte、char、short三种做运算时、结果为int型
  
------

* ### 2.强制类型转换:

  自动提升的逆运算

  需要使用**强转符()**

  强制类型转换可能导致精度损失

  ```java
  byte b = (byte)i2;
  ```

* **说明**: 此时的容量大小指的是，表示数的范围的大和小 比如 float 容量大于long

------

## 基础 ---> [Here](https://github.com/letengzz/JC-JavaPro/tree/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E5%9F%BA%E7%A1%80)

- ### String变量的使用 ---> [Here](https://github.com/letengzz/JC-JavaPro/blob/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E5%9F%BA%E7%A1%80/String%E5%8F%98%E9%87%8F%E4%BD%BF%E7%94%A8.java)

  - String属于引用类型

  - 声明String变量时，使用一对""

  - String可以跟八种数据类型做运算，且只能是连接运算:+

  - 运算结果仍然是String

------


- ### `HelloWorld` ---> [Here](https://github.com/letengzz/JC-JavaPro/blob/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E5%9F%BA%E7%A1%80/HelloWorld.java)

------

- ### Scanner获取 ---> [Here](https://github.com/letengzz/JC-JavaPro/blob/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E5%9F%BA%E7%A1%80/Scanner%E8%8E%B7%E5%8F%96.java)

从键盘获取不同类型的变量 使用Scanner 类

**步骤**

​	1、导包 

```
import java.util.Scanner;
```

​	2、`Scanner`实例化

```
Scanner scanner = new Scanner(System.in);
```

​	3、调用scanner类的相关方法 来获取指定类型的变量

​		`nextInt(); int`
​		`next(); String`
​		`nextDouble(); double`
​		`nextBoolean(); boolean`
​		`nextByte(); byte`

**对于char 的获取 Scanner 没有提供相关的方法 只能获取一个字符串**

```java
	String gender = scan.next();
​	char genderChar = gender.charAt(0) //获取索引值为0位置上的字符
```

**注意**

​	需要根据相应的方法 来输入制定类型的值 如果输入的数据类型与要求的不匹配 报异  导致程序终止

------

- ### 获取随机数 ---> [Here](https://github.com/letengzz/JC-JavaPro/blob/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E5%9F%BA%E7%A1%80/%E8%8E%B7%E5%8F%96%E9%9A%8F%E6%9C%BA%E6%95%B0.java)


   > ```java
   > 公式 [a,b]: (int)(Math.random() * (b-a+1) + a)
   > ```

------

- ### 进制---> [Here](https://github.com/letengzz/JC-JavaPro/blob/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E5%9F%BA%E7%A1%80/%E8%BF%9B%E5%88%B6.java)

    计算机中不同进制
    	对于整数有四种表现方式

    - 二进制(binary):0,1.满二进一，`以0b或0B开头`
    - 十进制(decimal):0-9.满十进一
    - 八进制(octal):0-7.满八进一，以0开头表示
    - 十六进制(hex):0-9及A-F.满十六进一，以`0x`或`0X`开头表示 此处的A-F不区分大小写
      			`如:0x21AF + 1 = 0X21B0`
    ------

* ### break和continue关键字的使用

  ```java
  				使用范围        循环中使用的作用        相同点
  
  break           switch-case    	结束当前循环        关键字后面不能声明执行语句
  
  				循环结构中
  
  
  continue         循环结构中       结束当次循环        关键字后面不能声明执行语句
  ```

  

## 运算符 ---> [Here](https://github.com/letengzz/JC-JavaPro/tree/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E8%BF%90%E7%AE%97%E7%AC%A6)

1. ### 三元运算符 ---> [Here](https://github.com/letengzz/JC-JavaPro/blob/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E8%BF%90%E7%AE%97%E7%AC%A6/%E4%B8%89%E5%85%83%E8%BF%90%E7%AE%97%E7%AC%A6.java)

   **结构 ：** 

   ```java
   (条件表达式)?表达式1:表达式2
   ```
   
   **说明：**
   
   ​	①条件表达式的结果为boolean类型
   ​	②根据条件表达式 决定执行表达式1 还是表达式2
   ​			如果表达式为true 则执行表达式1
   ​			如果表达式为false 则执行表达式2
   **表达式1 和表达式2要求是一致的**
   
   **三元运算符 可以嵌套**
   
   *凡是可以使用三元运算符 的地方 都可以改写成if-else*
   *用if-else 的地方不一定可以改写成三元运算符*
   
   **如果程序既可以使用三元运算符又可以使用if-else  那么优先选择三元运算符 原因： 简洁、执行效率高**

------

2. ### 比较运算符 ---> [Here](https://github.com/letengzz/JC-JavaPro/blob/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E8%BF%90%E7%AE%97%E7%AC%A6/%E6%AF%94%E8%BE%83%E8%BF%90%E7%AE%97%E7%AC%A6.java)

   ```
   == != > < >= <= instanceof
   ```

   **结论**

   ​	比较运算符结果是boolean类型
   *区分 **==** 和 =*

   > < >= <= 只能使用在数值类型的数据之间
   >
   > == 和 != 不仅可以使用在数据类型数据之间 还可以使用在其他引用数据类型之间

------

2. ### 算术运算符 ---> [Here](https://github.com/letengzz/JC-JavaPro/blob/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E8%BF%90%E7%AE%97%E7%AC%A6/%E7%AE%97%E6%9C%AF%E8%BF%90%E7%AE%97%E7%AC%A6.java)

   ```java
   + - * / % (前)++ (后)++ (前)-- (后)--   +
   ```
   
------

2. ### 赋值运算符 ---> [Here](https://github.com/letengzz/JC-JavaPro/blob/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E8%BF%90%E7%AE%97%E7%AC%A6/%E8%B5%8B%E5%80%BC%E8%BF%90%E7%AE%97%E7%AC%A6.java)

   ```java
   = += -= *= /= %=
   ```

------

2. ### 逻辑运算符 ---> [Here](https://github.com/letengzz/JC-JavaPro/blob/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E8%BF%90%E7%AE%97%E7%AC%A6/%E9%80%BB%E8%BE%91%E8%BF%90%E7%AE%97%E7%AC%A6.java)

   `&逻辑与 &&短路与 |逻辑或 ||短路或 !逻辑非 ^逻辑异或`
   逻辑运算符操作的都是boolean类型的变量 结果也是boolean类型的

------

2. ### 位运算符 ---> [Here](https://github.com/letengzz/JC-JavaPro/blob/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E8%BF%90%E7%AE%97%E7%AC%A6/%E4%BD%8D%E8%BF%90%E7%AE%97%E7%AC%A6.java)

   ```java
   <<左移 >>右移 >>>无符号右移  & 与 |或  ^异或 ~取反
   ```
   
   位运算符操作的都是整型的数据
   **<<在一定的范围内 每向左移1位 相当于 * 2**
   
   **在一定的范围内 每向右移1位 相当于 / 2**
   **最高效方式的计算 2*8    2 << 3  或 8 << 1**

------

## 流程控制 ---> [Here](https://github.com/letengzz/JC-JavaPro/tree/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6)

- ### 分支结构 ---> [Here](https://github.com/letengzz/JC-JavaPro/tree/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6/%E5%88%86%E6%94%AF%E7%BB%93%E6%9E%84)

------

1. #### if循环 ---> [Here](https://github.com/letengzz/JC-JavaPro/blob/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6/%E5%88%86%E6%94%AF%E7%BB%93%E6%9E%84/ifelse.java)
   
    ​	else 是可选的
    ​	针对多个条件表达式之间是**互斥关系**(没有交集的关系 哪个判断和执行语句在上面 还是下面都无所谓
    ​	如果多个条件表达式之间有**交集关系**，需要根据实际情况考虑清楚 哪个声明在上面
    ​	如果多个条件表达式之间有**包含关系**，通常条件下 需要将范围小的声明在范围大的上面 否则范围小的没机会
   
    if-else 结构是**可以相互嵌套**的
    	如果if-else结构中的执行语句只有一行时 **对应的{}可以省略 但是不建议**
   
    **三种结构**
   
    **第一种**
   
    ```java
    if(条件表达式){
    执行表达式
    }
    ```
   
    **第二种 二选一**
   
    ```java
    if(条件表达式){
    执行表达式1
    }else{
    执行表达式2
    }
    ```
   
    **第三种 n选一**
   
    ```java
    if(条件表达式){
     执行表达式1
    }else if(条件表达式){
     执行表达式2
    }...
    else{
      执行表达式n
    }
    ```
   
   ------
   
2. #### 	switch-case ---> [Here](https://github.com/letengzz/JC-JavaPro/blob/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6/%E5%88%86%E6%94%AF%E7%BB%93%E6%9E%84/switchcase.java)
   
   **格式**
   
   ```java
    switch(表达式){
     case 常量1;
     	执行语句1;
        //break;
     case 常量2;
        执行语句2
        //break;
     default:
        执行语句n;
        //break;
    }
   ```
   
   **说明**
   
   ​	①根据switch 表达式中的值 依次匹配各个case中的常量 一旦匹配成功 则进入相应的case结构中调用其执行语句
    当调用完执行语句以后 则仍然继续向下执行其他case结构中的执行语句 直到遇到break关键字或此switch-case机构末尾结束为止
   
   ​	*②break可以使用在  > switch-case结构中 表示一旦执行此关键字就跳出switch-case结构中*
   
   ​	③switch 结构中的表达式 只能是如下6种类型 **byte、short、char、int、枚举类型`(jdk5.0)`、String类型`(jdk7.0新增)`**
    ​	④case之后**只能声明常量，不能声明范围**
    ​	⑤break关键字**是可选的**
    ​	⑥default **相当于else**
    ​	 default 可选的，位置是灵活的如果switch case 结构中的多个case的执行语句相同 则可以考虑进行合并
    **说明 凡是使用switch-case的结构 都可以转换为if-else 反之不成立**
    当写分支结构时 既可以 又可以 （case不太多)优先选择switch-case
      **原因 switch-case 执行效率稍高


------

- ### 循环结构 ---> [Here](https://github.com/letengzz/JC-JavaPro/tree/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6/%E5%BE%AA%E7%8E%AF%E7%BB%93%E6%9E%84)

------

1. #### do-while循环 ---> [Here](https://github.com/letengzz/JC-JavaPro/blob/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6/%E5%BE%AA%E7%8E%AF%E7%BB%93%E6%9E%84/dowhile%E5%BE%AA%E7%8E%AF.java)

     **do-while循环四要素**
     	①初始化条件
     	②循环条件 --》是boolean 类型
     	③循环体
     	④迭代条件
   
     do-while 循环结构
   
     ```java
     ①
     do{
     	③;
     	④;
     }while(②);
     ```
   
     执行过程 ①-③-④-②-③-④-。。。-②
      **说明**
     **do-while 循环至少执行一次循环体**
   
   ------

2. #### for循环 ---> [Here](https://github.com/letengzz/JC-Java/blob/master/JavaSE/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6/%E5%BE%AA%E7%8E%AF%E7%BB%93%E6%9E%84/for%E5%BE%AA%E7%8E%AF.java)
   
   **for循环四要素**
   	①初始化条件
   	②循环条件   是boolean类型
   	③循环体
   	④迭代条件
   for循环结构  
   
   ```java
   for(①;②;④){
       ③
   }
   ```
   
   执行过程 ： ① - ② - ③ - ④ - ② - ③ -。。-② 
   
   ------
   
3. #### while循环 ---> [Here](https://github.com/letengzz/JC-JavaPro/blob/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6/%E5%BE%AA%E7%8E%AF%E7%BB%93%E6%9E%84/while%E5%BE%AA%E7%8E%AF.java)
   
   **while循环四要素**
   	①初始化条件
   	②循环条件 --》是boolean 类型
   	③循环体
   	④迭代条件
   
   while循环结构
   
   ```java
   ①
   while(②){
   	③;
   	④;
   }
   ```
   
   执行过程 ①-②-③-④-②-③-④。。。-②
   **说明**
   1、千万小心丢了迭代条件 一旦丢了 可能导致死循环
   2、要避免死循环
   3、for循环和while可以相互转换
   **区别 for 和while初始化条件的作用范围不同**
   **算法 : 有限性**
   
   ------
   
4. #### 嵌套循环 ---> [Here](https://github.com/letengzz/JC-JavaPro/blob/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6/%E5%BE%AA%E7%8E%AF%E7%BB%93%E6%9E%84/%E5%B5%8C%E5%A5%97%E5%BE%AA%E7%8E%AF%E7%9A%84%E4%BD%BF%E7%94%A8.java)
   
    嵌套循环 将一个循环结构A声明在另一个循环结构B的循环体中，就构成了嵌套循环
    
    ```
     	外层循环：循环结构B
        内层循环：循环结构A
    ```
    
   **说明**
    内层循环结构遍历一遍 只相当于外层循环体循环一次
     **技巧**
   **外层循环控制行数，内层循环控制列数**
   
- ### 顺序结构 ---> [Here](https://github.com/letengzz/JC-JavaPro/blob/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6/%E9%A1%BA%E5%BA%8F%E7%BB%93%E6%9E%84/%E9%A1%BA%E5%BA%8F%E7%BB%93%E6%9E%84.java)
  
  
    > 程序从上到下执行
   
   ------
   
- 
  ## 练习题

------


   - ### 分支结构 ---> [Here](https://github.com/letengzz/JC-JavaPro/tree/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6/%E5%88%86%E6%94%AF%E7%BB%93%E6%9E%84/%E7%BB%83%E4%B9%A0%E9%A2%98)

     #### if练习题 ---> [Here](https://github.com/letengzz/JC-JavaPro/tree/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6/%E5%88%86%E6%94%AF%E7%BB%93%E6%9E%84/%E7%BB%83%E4%B9%A0%E9%A2%98/if%E7%BB%83%E4%B9%A0%E9%A2%98)

     ##### if语句例题1 ---> [Here](https://github.com/letengzz/JC-JavaPro/blob/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6/%E5%88%86%E6%94%AF%E7%BB%93%E6%9E%84/%E7%BB%83%E4%B9%A0%E9%A2%98/if%E7%BB%83%E4%B9%A0%E9%A2%98/if%E8%AF%AD%E5%8F%A5%E4%BE%8B%E9%A2%981.java)

     ##### if语句例题2 ---> [Here](https://github.com/letengzz/JC-JavaPro/blob/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6/%E5%88%86%E6%94%AF%E7%BB%93%E6%9E%84/%E7%BB%83%E4%B9%A0%E9%A2%98/if%E7%BB%83%E4%B9%A0%E9%A2%98/if%E8%AF%AD%E5%8F%A5%E4%BE%8B%E9%A2%982.java)

     ##### if语句练习1 ---> [Here](https://github.com/letengzz/JC-JavaPro/blob/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6/%E5%88%86%E6%94%AF%E7%BB%93%E6%9E%84/%E7%BB%83%E4%B9%A0%E9%A2%98/if%E7%BB%83%E4%B9%A0%E9%A2%98/if%E8%AF%AD%E5%8F%A5%E7%BB%83%E4%B9%A0.java)

     ##### if语句练习2 ---> [Here](https://github.com/letengzz/JC-JavaPro/blob/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6/%E5%88%86%E6%94%AF%E7%BB%93%E6%9E%84/%E7%BB%83%E4%B9%A0%E9%A2%98/if%E7%BB%83%E4%B9%A0%E9%A2%98/if%E8%AF%AD%E5%8F%A5%E7%BB%83%E4%B9%A01.java)

     ##### if语句练习3 ---> [Here](https://github.com/letengzz/JC-JavaPro/blob/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6/%E5%88%86%E6%94%AF%E7%BB%93%E6%9E%84/%E7%BB%83%E4%B9%A0%E9%A2%98/if%E7%BB%83%E4%B9%A0%E9%A2%98/if%E8%AF%AD%E5%8F%A5%E7%BB%83%E4%B9%A02.java)

     ##### if语句练习4 ---> [Here](https://github.com/letengzz/JC-JavaPro/blob/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6/%E5%88%86%E6%94%AF%E7%BB%93%E6%9E%84/%E7%BB%83%E4%B9%A0%E9%A2%98/if%E7%BB%83%E4%B9%A0%E9%A2%98/if%E8%AF%AD%E5%8F%A5%E7%BB%83%E4%B9%A03.java)

     #### switch练习题 ---> [Here](https://github.com/letengzz/JC-JavaPro/tree/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6/%E5%88%86%E6%94%AF%E7%BB%93%E6%9E%84/%E7%BB%83%E4%B9%A0%E9%A2%98/switch%E7%BB%83%E4%B9%A0%E9%A2%98)

     ##### if语句改switch ---> [Here](https://github.com/letengzz/JC-JavaPro/blob/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6/%E5%88%86%E6%94%AF%E7%BB%93%E6%9E%84/%E7%BB%83%E4%B9%A0%E9%A2%98/switch%E7%BB%83%E4%B9%A0%E9%A2%98/if%E8%AF%AD%E5%8F%A5%E6%94%B9switch.java)

     ##### switch练习题1 ---> [Here](https://github.com/letengzz/JC-JavaPro/blob/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6/%E5%88%86%E6%94%AF%E7%BB%93%E6%9E%84/%E7%BB%83%E4%B9%A0%E9%A2%98/switch%E7%BB%83%E4%B9%A0%E9%A2%98/switch%E7%BB%83%E4%B9%A0%E9%A2%98.java)

     ##### switch练习题2 ---> [Here](https://github.com/letengzz/JC-JavaPro/blob/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6/%E5%88%86%E6%94%AF%E7%BB%93%E6%9E%84/%E7%BB%83%E4%B9%A0%E9%A2%98/switch%E7%BB%83%E4%B9%A0%E9%A2%98/switch%E7%BB%83%E4%B9%A0%E9%A2%981.java)

     ##### switch练习题3 ---> [Here](https://github.com/letengzz/JC-JavaPro/blob/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6/%E5%88%86%E6%94%AF%E7%BB%93%E6%9E%84/%E7%BB%83%E4%B9%A0%E9%A2%98/switch%E7%BB%83%E4%B9%A0%E9%A2%98/switch%E7%BB%83%E4%B9%A0%E9%A2%982.java)

     ##### switch练习题4 ---> [Here](https://github.com/letengzz/JC-JavaPro/blob/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6/%E5%88%86%E6%94%AF%E7%BB%93%E6%9E%84/%E7%BB%83%E4%B9%A0%E9%A2%98/switch%E7%BB%83%E4%B9%A0%E9%A2%98/switch%E7%BB%83%E4%B9%A0%E9%A2%983.java)

     ##### switch练习题5 ---> [Here](https://github.com/letengzz/JC-JavaPro/blob/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6/%E5%88%86%E6%94%AF%E7%BB%93%E6%9E%84/%E7%BB%83%E4%B9%A0%E9%A2%98/switch%E7%BB%83%E4%B9%A0%E9%A2%98/switch%E7%BB%83%E4%B9%A0%E9%A2%984.java)

     ##### switch练习题6 ---> [Here](https://github.com/letengzz/JC-JavaPro/blob/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6/%E5%88%86%E6%94%AF%E7%BB%93%E6%9E%84/%E7%BB%83%E4%B9%A0%E9%A2%98/switch%E7%BB%83%E4%B9%A0%E9%A2%98/switch%E7%BB%83%E4%B9%A0%E9%A2%985.java)

     ##### 中国生肖问题 ---> [Here](https://github.com/letengzz/JC-JavaPro/blob/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6/%E5%88%86%E6%94%AF%E7%BB%93%E6%9E%84/%E7%BB%83%E4%B9%A0%E9%A2%98/switch%E7%BB%83%E4%B9%A0%E9%A2%98/%E4%B8%AD%E5%9B%BD%E7%94%9F%E8%82%96%E9%97%AE%E9%A2%98.java)

   - ### 循环结构 ---> [Here](https://github.com/letengzz/JC-JavaPro/tree/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6/%E5%BE%AA%E7%8E%AF%E7%BB%93%E6%9E%84/%E7%BB%83%E4%B9%A0%E9%A2%98)

     #### for练习题 ---> [Here](https://github.com/letengzz/JC-JavaPro/tree/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6/%E5%BE%AA%E7%8E%AF%E7%BB%93%E6%9E%84/%E7%BB%83%E4%B9%A0%E9%A2%98/for%E7%BB%83%E4%B9%A0%E9%A2%98)

     ##### for练习题1 ---> [Here](https://github.com/letengzz/JC-JavaPro/blob/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6/%E5%BE%AA%E7%8E%AF%E7%BB%93%E6%9E%84/%E7%BB%83%E4%B9%A0%E9%A2%98/for%E7%BB%83%E4%B9%A0%E9%A2%98/for%E7%BB%83%E4%B9%A0%E9%A2%98.java)

     ##### for练习题2 ---> [Here](https://github.com/letengzz/JC-JavaPro/blob/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6/%E5%BE%AA%E7%8E%AF%E7%BB%93%E6%9E%84/%E7%BB%83%E4%B9%A0%E9%A2%98/for%E7%BB%83%E4%B9%A0%E9%A2%98/for%E7%BB%83%E4%B9%A0%E9%A2%981.java)

     ##### for练习题3 ---> [Here](https://github.com/letengzz/JC-JavaPro/blob/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6/%E5%BE%AA%E7%8E%AF%E7%BB%93%E6%9E%84/%E7%BB%83%E4%B9%A0%E9%A2%98/for%E7%BB%83%E4%B9%A0%E9%A2%98/for%E8%AF%AD%E5%8F%A5%E7%BB%83%E4%B9%A02.java)

     ##### 无限循环 ---> [Here](https://github.com/letengzz/JC-JavaPro/blob/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6/%E5%BE%AA%E7%8E%AF%E7%BB%93%E6%9E%84/%E7%BB%83%E4%B9%A0%E9%A2%98/for%E7%BB%83%E4%B9%A0%E9%A2%98/%E6%97%A0%E9%99%90%E5%BE%AA%E7%8E%AF.java)

     #### while练习题 ---> [Here](https://github.com/letengzz/JC-JavaPro/tree/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6/%E5%BE%AA%E7%8E%AF%E7%BB%93%E6%9E%84/%E7%BB%83%E4%B9%A0%E9%A2%98/while%E7%BB%83%E4%B9%A0%E9%A2%98)

     ##### while语句练习 ---> [Here](https://github.com/letengzz/JC-JavaPro/blob/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6/%E5%BE%AA%E7%8E%AF%E7%BB%93%E6%9E%84/%E7%BB%83%E4%B9%A0%E9%A2%98/while%E7%BB%83%E4%B9%A0%E9%A2%98/while%E8%AF%AD%E5%8F%A5%E7%BB%83%E4%B9%A0.java)

     ##### 无限循环 ---> [Here](https://github.com/letengzz/JC-JavaPro/blob/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6/%E5%BE%AA%E7%8E%AF%E7%BB%93%E6%9E%84/%E7%BB%83%E4%B9%A0%E9%A2%98/while%E7%BB%83%E4%B9%A0%E9%A2%98/%E6%97%A0%E9%99%90%E5%BE%AA%E7%8E%AF.java)

     #### 嵌套循环练习题 ---> [Here](https://github.com/letengzz/JC-JavaPro/tree/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6/%E5%BE%AA%E7%8E%AF%E7%BB%93%E6%9E%84/%E7%BB%83%E4%B9%A0%E9%A2%98/%E5%B5%8C%E5%A5%97%E5%BE%AA%E7%8E%AF%E7%BB%83%E4%B9%A0%E9%A2%98)

     ##### 一百以内所有质数 ---> [Here](https://github.com/letengzz/JC-JavaPro/tree/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6/%E5%BE%AA%E7%8E%AF%E7%BB%93%E6%9E%84/%E7%BB%83%E4%B9%A0%E9%A2%98/%E5%B5%8C%E5%A5%97%E5%BE%AA%E7%8E%AF%E7%BB%83%E4%B9%A0%E9%A2%98/%E4%B8%80%E7%99%BE%E4%BB%A5%E5%86%85%E6%89%80%E6%9C%89%E8%B4%A8%E6%95%B0)

     ##### 三角问题 ---> [Here](https://github.com/letengzz/JC-JavaPro/tree/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6/%E5%BE%AA%E7%8E%AF%E7%BB%93%E6%9E%84/%E7%BB%83%E4%B9%A0%E9%A2%98/%E5%B5%8C%E5%A5%97%E5%BE%AA%E7%8E%AF%E7%BB%83%E4%B9%A0%E9%A2%98/%E4%B8%89%E8%A7%92%E9%97%AE%E9%A2%98)

     ##### 九九乘法表 ---> [Here](https://github.com/letengzz/JC-JavaPro/blob/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6/%E5%BE%AA%E7%8E%AF%E7%BB%93%E6%9E%84/%E7%BB%83%E4%B9%A0%E9%A2%98/%E5%B5%8C%E5%A5%97%E5%BE%AA%E7%8E%AF%E7%BB%83%E4%B9%A0%E9%A2%98/%E4%B9%9D%E4%B9%9D%E4%B9%98%E6%B3%95%E8%A1%A8.java)

     ##### 完数 ---> [Here](https://github.com/letengzz/JC-JavaPro/blob/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6/%E5%BE%AA%E7%8E%AF%E7%BB%93%E6%9E%84/%E7%BB%83%E4%B9%A0%E9%A2%98/%E5%AE%8C%E6%95%B0.java)

   - ### 项目-家庭记账软件 ---> [Here](https://github.com/letengzz/JC-JavaPro/tree/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6/%E9%A1%B9%E7%9B%AE/%E5%AE%B6%E5%BA%AD%E8%AE%B0%E8%B4%A6%E8%BD%AF%E4%BB%B6)

   - ### 运算符 ---> [Here](https://github.com/letengzz/JC-JavaPro/tree/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E8%BF%90%E7%AE%97%E7%AC%A6/%E7%BB%83%E4%B9%A0%E9%A2%98)

     ##### 位运算符练习 ---> [Here](https://github.com/letengzz/JC-JavaPro/blob/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E8%BF%90%E7%AE%97%E7%AC%A6/%E7%BB%83%E4%B9%A0%E9%A2%98/%E4%BD%8D%E8%BF%90%E7%AE%97%E7%AC%A6%E7%BB%83%E4%B9%A0.java)

     ##### 求0到255十六进制值 ---> [Here](https://github.com/letengzz/JC-JavaPro/blob/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E8%BF%90%E7%AE%97%E7%AC%A6/%E7%BB%83%E4%B9%A0%E9%A2%98/%E6%B1%820%E5%88%B0255%E6%95%B4%E6%95%B0%E7%9A%84%E5%8D%81%E5%85%AD%E8%BF%9B%E5%88%B6%E5%80%BC.java)

     ##### 算术运算符练习题 ---> [Here](https://github.com/letengzz/JC-JavaPro/blob/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E8%BF%90%E7%AE%97%E7%AC%A6/%E7%BB%83%E4%B9%A0%E9%A2%98/%E7%AE%97%E6%9C%AF%E8%BF%90%E7%AE%97%E7%AC%A6%E7%BB%83%E4%B9%A0%E9%A2%98.java)

     ##### 自增自减练习题 ---> [Here](https://github.com/letengzz/JC-JavaPro/blob/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E8%BF%90%E7%AE%97%E7%AC%A6/%E7%BB%83%E4%B9%A0%E9%A2%98/%E8%87%AA%E5%A2%9E%E8%87%AA%E5%87%8F%E7%BB%83%E4%B9%A0%E9%A2%98.java)

     ##### 赋值运算符练习题 ---> [Here](https://github.com/letengzz/JC-JavaPro/blob/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E8%BF%90%E7%AE%97%E7%AC%A6/%E7%BB%83%E4%B9%A0%E9%A2%98/%E8%B5%8B%E5%80%BC%E8%BF%90%E7%AE%97%E7%AC%A6%E7%BB%83%E4%B9%A0%E9%A2%98.java)

     ##### 逻辑运算符练习题1 ---> [Here](https://github.com/letengzz/JC-JavaPro/blob/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E8%BF%90%E7%AE%97%E7%AC%A6/%E7%BB%83%E4%B9%A0%E9%A2%98/%E9%80%BB%E8%BE%91%E8%BF%90%E7%AE%97%E7%AC%A6%E7%BB%83%E4%B9%A0%E9%A2%98.java)

     ##### 逻辑运算符练习题2 ---> [Here](https://github.com/letengzz/JC-JavaPro/blob/master/JavaSE/src/%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95/%E8%BF%90%E7%AE%97%E7%AC%A6/%E7%BB%83%E4%B9%A0%E9%A2%98/%E9%80%BB%E8%BE%91%E8%BF%90%E7%AE%97%E7%AC%A6%E7%BB%83%E4%B9%A0%E9%A2%982.java)

     
