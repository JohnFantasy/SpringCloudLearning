# Java8新特性

## Lambda表达式

允许我们将函数作为参数传递给某个方法；

或者把代码本身当作数据处理。

例如： 

` Arrays.asList( "a", "b", "d" ).forEach( e -> System.out.println( e ) );  `

`  Arrays.asList( "a", "b", "d" ).forEach( ( String e ) -> System.out.println( e ) );`

`  Arrays.asList( "a", "b", "d" ).forEach( e -> { `  

​        `        System.out.print( e ); `

​        `        System.out.print( e ); `        

`} );`

*** 函数式接口：函数从定义上来说就是某种对应的关系，假设其中的元素为x，对A中的元素x施加对应法则f，记作f（x），得到另一数集B，假设B中的元素为y，则y与x之间的等量关系可以用y=f（x）。函数式接口就是能帮我们完成某种功能的接口。通常用@FunctionalInterface来表明一个接口是函数式接口。java中有很多函数式接口。今天主要学习jdk1.8中内置的四大核心函数式接口。***

![img](https://img-blog.csdnimg.cn/20200513104021722.PNG?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzI4MDgyNzU3,size_16,color_FFFFFF,t_70)

![在这里插入图片描述](https://img-blog.csdnimg.cn/20200513103908719.PNG?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzI4MDgyNzU3,size_16,color_FFFFFF,t_70)

## Stream流式编程



## 新的时间日期API

## 函数式接口

## 方法引用与构造器引用

## 接口的默认方法与静态方法
