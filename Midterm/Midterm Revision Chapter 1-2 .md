# **WIX1002 Fundamentals of Programming**



## **Chapter 1** - Problem Solving in Programming

****

### 1.1 **Introduction**

A programming language can be divided into **machine language, assembly language and high level language**. 

**Machine Language** consists of strings of number (**0 and 1**) that construct computers to perform their operations. lt is **machine dependent**: particular machine language can be used only for one type of computer.

**Assembly Language**'s examples are **MOV AL, 88h**. It requires **many statements** in order to perform a simple tasks.

Java is one of the High Level language. **Compiler** is used to convert high level language programs into machine language.



### 1.2 Java

Java is an **Object-Oriented Programming** language

Java programs normally go through five phases to be executed. These are: **edit(via Integrated Development Environment (IDE)**), compile(compiler translates the Java program into **byte codes**), load, verify and execute.

Java program file names end with **.java** extension. The file name must be same as the **Class name**.

Command use to compile java file

```
javac filename.java
```

Command use to execute jar file

```
java –jar filename.jar
```



### 1.3 **Problem Solving**

There are three commonly types of bugs or errors.

**Syntax Error**

A grammatical mistake in the program. A mistake in the arrangement of words and punctuations.

**Logic Error**

A mistake in the underlying algorithm or semantic error. 

**Run-time Error**

An error that happen when the program is executed



### 1.4 **Input Process Output** (IPO)

![image-20211126120756614](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20211126120756614.png)



### 1.5 Sample Java Program

```java
public class FirstProgram{
  public static void main(String[] args){
   System.out.println("Welcome to Java!");  
  }
}
```

<!--The void indicates that this method will perform a task and will not return any information when the task is completed.-->

Every **Java application** contains a **main method**. main method must always be **static**.

Java is **case sensitive**. 



## **Chapter 2** - **Java** **Fundamental**



### 2.1 Variable

A variable must be **declared**, specifying the variable's **name** and the **type**.

**Identifier** (标识符) is the name of the variable which contains **letters**, digits (**0 – 9**), and the **underscore** (**_**) 还有$

**However, identifier cannot begin with a digit, cannot contain spaces and cannot be reserved words(保留字).** 数字不能开头

保留字列表：

![image-20211126125446341](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20211126125446341.png)

![image-20211126125521730](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20211126125521730.png)

![image-20211126122237778](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20211126122237778.png)

Java has basic types for characters, integers and floating points number. These basic types are known as **primitive types**.(基本类型不包括字符串)

布尔值的true和false是全小写

```java
char letter = 'A'；//use single quote for character` char值必须加单引号


```

Constant is declared using the **final** keyword 常量大写

```java
final int MAX=100;
```

int a_; 正确 _

int a@;错误，@不能使用

int a3;正确

int 9_;错误，数字不能在前面 _

 int X$_;正确

int $*$;错误，符号只能是$/_ 

 int $1$;正确 

int _1 正确

int a#;错误，符号#不能使用  

_int $123b_;正确

### **2.2 Operator**

**%** (modulo or remainder) 

```java
answer = 20 % 6; // answer is 2
```

**++i** 先自增 再用值

**i++** 先用值 再自增

== 相等是两个等于号！！！！

+=    *=     %=

### 2.3 Type Casting 类型转换

```java
int a=8, b=3;

double answer;

answer = a / b; // Output is 2

answer = a / (double) b; // Output is 2.6666 
```

**精度高**的数据类型就像**容量大**的杯子，可以**放更大**的数据
**精度低**的数据类型就像**容量小**的杯子，只能**放更小**的数据
小杯子往大杯子里倒东西，大杯子**怎么都放得下**
大杯子往小杯子里倒东西，**有的时候放的下**，**有的时候就会有溢出**

### 2.4 **String**

```java
String topic = "Object-oriented Programming";
```

String类型的S大写 值要加双引号

```java
fullname = firstname + lastname;
```

+operator is used to connecting two strings.

性质：immutable （不可改变的）
比如创建了一个字符串对象
String garen ="盖伦";
**不可改变**的具体含义是指：
不能增加长度
不能减少长度
不能插入字符
不能删除字符
不能修改字符
一旦创建好这个字符串，里面的内容 **永远** 不能改变

String 的表现就像是一个**常量**



```java
    String voidString = "";
    
    //可以有长度为0的字符串,即空字符串
```



### 2.5 Console Input 控制台输入

```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);

int num;

System.out.println("Please enter a number"); 

num = sc.nextInt();

     System.out.println("The number is " + num); 
```

.nextLong()

Reads one long int from the keyboard

.nextDouble()

Reads one double from the keyboard

.next()

Reads **one word** into String class from the keyboard

.nextLine()

Reads an entire line into String class from the keyboard



### 2.6 Console Output

**System.out.printf**  格式化输出

| **Code** | **Output**                           | **Examples** |
| -------- | ------------------------------------ | ------------ |
| d        | decimal integer                      | %d %6d       |
| f        | fixed-point floating point           | %f  %6.2f    |
| e        | E-notation floating point 科学计数法 | %e %4.2e     |
| g        | general floating point               | %g %4.2g     |
| s        | string                               | %s %20s      |
| c        | character                            | %c %5c       |
| -        | left alignment                       | %-5d         |

```java
System.out.printf(“%-6.2f”, 22/7.0)

//Display 6 spaces with 2 decimal places as in 3.14_ _ 输出宽度为6 左对齐 保留两位小数 
```

**\n** is the **newline character**. 换行

**\t** is the **horizontal tab**  相当于按了一次tab键

\\\ display a backslash character

\\" display a double quote character



小技巧：用System.out.println()完成换行

### 2.7 Comment 

```java
//单行评论

/*

多行

评论

*/


```



### 2.8 Random Number

```java
import java.util.Random;

Random r = new Random();

int num;  

num = r.nextInt(); //any random value of integer 

final int MAX = 100;

num = r.nextInt(MAX); // random value from 0 to 99
```



不要忘记import

.nextInt(10) 是0-9 

随机数只能产生整数