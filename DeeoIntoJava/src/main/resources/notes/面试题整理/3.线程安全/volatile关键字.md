# 第一章 volatile关键字概览

## 1.1 多线程下变量的不可见性问题

### 1.1.1 概述

​    在多线程并发执行的情况下，多个线程修改共享的成员变量，会出现一个线程修改了变量的值之后，另一个线程不能直接看到该线程修改后的变量的最新值。

### 1.1.2 演示

```java
/**
 * 目标：研究多线程环境下共享变量不可见的现象
 * <p>
 * 准备内容：
 * 1.准备两个线程
 * 2.定义一个成员变量
 * 3.开启两个线程，一个线程修改，另一个线程读取
 */

public class VisibilityDemo01 {

    // main方法，作为主线程
    public static void main(String[] args) {
        // a.开启一个子线程
        MyThread t1 = new MyThread();
        t1.start();
        // b.主线程执行
        while (true) {
            if (t1.isFlag()) {
                System.out.println("Main thread executes");
            }
        }
    }
}

class MyThread extends Thread {

    private boolean flag = false;

    @SneakyThrows
    @Override
    public void run() {

        Thread.sleep(1000);

        flag = true;
        System.out.println("flag == " + flag);
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
```

### 1.1.3 小结

子线程已经将flag的值修改为true，但是主线程并未执行输出语句，，即main方法中始终也没有读到flag变量被修改后的最新值，从而循环就没有能进入到if语句中去。

**结论：多线程环境下修改变量后会出现变量修改后的值不可见的问题**

## 1.2 变量不可见的内存语义

### 1.2.1 概述

**  JMM：Java Memory Model**
共享内存和私有内存

### 1.2.2

## 1.2 变量不可见性内存语义

## 1.3 变量不可见性解决方案

# 第二章 volatile关键字的其他特性

## 2.1 volatile关键字特性概述

## 2.2 volatile不保证原子性

## 2.3 禁止指令重排

# 第三章 volatile内存语义

## 3.1

# 第四章 volatile高频面试总结

## 4.1

## 4.2

## 4.3

## 4.4
