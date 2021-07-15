### path环境变量: windows操作系统执行命令时所要搜寻的路径

### 为什么配置path环境变量?

**希望java的开发工具(javac.exe,java.exe)在任何的都可以执行成功.**

### 过程 :

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

