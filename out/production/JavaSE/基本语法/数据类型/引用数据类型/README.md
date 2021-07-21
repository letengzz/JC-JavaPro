#### 引用数据类型的大小统一为4字节，记录的是其引用对象的地址

## 接口



## 数组



## class类

- #### String

  String不是基本数据类型，属于引用数据类型 

  使用方式与基本数据类型一致。例如：String str = “abcd”; 

   一个字符串可以串接另一个字符串，也可以直接串接其他类型的数据。

  String可以和8种基本数据类型变量做运算，且运算只能是连接运算：+

  运算结果仍然是String

  例如：

  

```java
          	   str = str + “xyz” ;  
               int n = 100;  
               str = str + n;          
```

​    

**String强转int**

​                

```java
				int num1 = Integer.parseInt(str1); 
				System.out.println(num1);   
```

​           