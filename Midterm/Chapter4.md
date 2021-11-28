

# **WIX1002 Fundamentals of Programming**

## **Chapter 4** - Flow of Control (**Repetition**)

```java
do {

statement1;

statement2;

} while (condition); //注意这里有分号
```



```java
for (initialization; condition; update)   //分号隔开

 statement;
```

#### ***break(结束内部循环)*** 

```java
for (count = 1; count <= 10; count++) {

  if ( count == 5 )

   break; // break the loop when count is equal to 5

  sum += count;

}
```

```java
    ``//打印单数  
    ``for` `(``int` `j = ``0``; j < ``10``; j++) {
      ``if``(``0``==j%``2``) 
        ``break``; ``//如果是双数，直接结束循环
      
      ``System.out.println(j);
    ``}
```



#### *continue*

```
    ``//打印单数  
    ``for` `(``int` `j = ``0``; j < ``10``; j++) {
      ``if``(``0``==j%``2``) 
        ``continue``; ``//如果是双数，后面的代码不执行，直接进行下一次循环
      
      ``System.out.println(j);
    ``}
```





```java
for (int count = 1; count <= 10; count++ ) {

  if ( count == 5 )

   continue; // skip remaining statement in the loop when count = 5

  sum+=count;

}
```

#### *label*

```java
stop: {  // label statement

for (int row = 1; row <= 10; row++) {

  for (int column = 1;column <= 5; column++) {

   if ( row == 5 )

​     break stop; // break the stop label statement

   counter++;

  }

}
```

在外部循环的前一行，加上标签
在break的时候使用该标签
即能达到结束外部循环的效果

```java
    ``//打印单数  
    ``outloop: ``{//outloop这个标示是可以自定义的比如outloop1,ol2,out5
    ``for` `(``int` `i = ``0``; i < ``10``; i++) {
      
      ``for` `(``int` `j = ``0``; j < ``10``; j++) {
        ``System.out.println(i+``":"``+j);
        ``if``(``0``==j%``2``) 
          ``break` `outloop; ``//如果是双数，结束外部循环
      ``}
      
    ``}
    }
```
