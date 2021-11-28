# **WIX1002 Fundamentals of Programming**

## **Chapter 3** - Flow of Control (Selection)

#### *if*

```java
if (number > 0)

	System.out.println("The number is positive");
//不加括号时if只作用于紧跟if后面的一行，同理else if 和 else


if (result < 50) {   

 	System.out.println("You did not pass");

 	System.out.println("Try harder next time");

}
```

#### *String* *Comparison 字符串比较*

不能用等于==来比较字符串，用**equals** 或 **equalsIgnoreCase**.

String.equals(other_string)  //区分大小写  equals的e不大写 驼峰式命名

String.equalsIgnoreCase(other_string)  //不管大小写

```java
String s1, s2;

if (s1.equals(s2))

  System.out.println("They are equal strings.");

else

  System.out.println("They are not equal strings.")
    
```

***比较ASCII顺序***

String.compareTo (other_string) //c不大写 驼峰式命名

String.compareToIgnoreCase(other_string)

```java
s1.compareTo(s2)

//Return **negative** value if **s1 comes before s2**.

//Return **positive** value if **s2 comes before s1**.

//Return zero if s1 is equal to s2.
```

#### *switch*

 switch statement can be used to represent multiway if-else statement. 相当于多路if-else

switch可以使用byte,short,int,char,String,

```java
switch ( variable ) {

case value1:

 statement 1;

 break;  //case 语句不必须要包含 break 语句。 如果没有 break 语句出现，程序会继续执行下一条 case 语句，直到出现 break 语句

case value2:

 statement 2;

 break;

default: //当什么case都不属于的时候 运行default 可以不写default

 statement 3;

 }
```

#### ***Ternary* *Operator*** 三元运算符

**condition1 ? statement1 : statement2**

If the condition1 is true, the statement1 will be executed.

If the condition1 is false, the statement2 will be executed.

```java
y = x >=0 ? x : -x;

//相当于

if (x>=0)
    y = x;
else
    y = -x;
```

#### *易错*

```java
if (0 <= mark <= 100)   //不能这样写 必须用&&

System.out.println("Invalid syntax");

if (choice = 'Q')

lSystem.out.println("Equal sign error");

if (age > 21 and mark > 80)

System.out.println("and should be &&");
```

```java
if(b); //相当于if(b == true)
     System.out.println("yes");
```

 

