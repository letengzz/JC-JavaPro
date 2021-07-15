# *<u>**基础知识**</u>*

## Java介绍

![Java介绍](img/Java介绍.png)

![Java语言概述](img/Java语言概述.png)

## Java简史

![Java简史.png](img/Java简史.png)

## Java体系平台

![Java技术体系平台](img/Java技术体系平台.png)

## Java特点

![Java特性](img/Java特性.png)

![Java特征](img/Java特征.png)

## Java应用领域

![Java应用领域](img/Java应用领域.png)

## ***JDK配置:***

#### path环境变量: windows操作系统执行命令时所要搜寻的路径

#### 为什么配置path环境变量?

​	**希望java的开发工具(javac.exe,java.exe)在任何的都可以执行成功.**

### 配置过程 :

(1)新建->变量名"JAVA_HOME"，变量值

```
C:\Java\jdk1.8.0_05（即JDK的安装路径）
```

(2)编辑->变量名"Path"，在原变量值的最后面加上

```
%JAVA_HOME%\bin;%JAVA_HOME%\jre\bin
```

(3)新建->变量名“CLASSPATH”,变量值“

```
.;%JAVA_HOME%\lib;%JAVA_HOME%\lib\dt.jar;%JAVA_HOME%\lib\tools.jar
```

3、确认环境配置是否正确：
在控制台分别输入**java，javac，java -version** 命令，出现如下所示的JDK的编译器信息，包括修改命令的语法和参数选项等信息。

#### 添加jre：

```
bin\jlink.exe --module-path jmods --add-modules java.desktop --output jre
```

## Java两种核心机制

![Java两种核心机制](img/Java两种核心机制.png)

![Java虚拟机](img/Java虚拟机.png)



![垃圾回收](img/垃圾回收.png)

## Java优点

![Java主要特征](img/Java主要特征.png)

![Java主要特征2](img/Java主要特征2.png)

## JDK和JRE

![JDK](img/JDK.png)

![JRE](img/JRE.png)

![构成](img/构成.png)

## Java编译过程

![Java过程](img/Java过程.png)

## 运行Java程序

Java源码本质上是一个文本文件，我们需要先用javac把Hello.java编译成字节码文件Hello.class，然后，用java命令执行这个字节码文件：
![Java运行过程](img/Java运行过程.png)

因此，可执行文件javac是编译器，而可执行文件java就是虚拟机。
第一步，在保存Hello.java的目录下执行命令javac Hello.java：

```
$ javac Hello.java
```

如果源代码无误，上述命令不会有任何输出，而当前目录下会产生一个Hello.class文件：

```
$ ls
Hello.class	Hello.java
```

第二步，执行Hello.class，使用命令java Hello：

```
$ java Hello
Hello, world!
```

注意：给虚拟机传递的参数Hello是我们定义的类名，虚拟机自动查找对应的class文件并执行。
直接运行java Hello.java也是可以的：

```
$ java Hello.java
Hello, world!
```

这是Java 11新增的一个功能，它可以直接运行一个单文件源码！
需要注意的是，在实际项目中，单个不依赖第三方库的Java源码是非常罕见的，所以，绝大多数情况下，我们无法直接运行一个Java源码文件，原因是它需要依赖其他的库.

