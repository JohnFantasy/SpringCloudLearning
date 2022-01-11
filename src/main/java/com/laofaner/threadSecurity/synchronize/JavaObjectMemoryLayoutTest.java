package com.laofaner.threadSecurity.synchronize;


import org.openjdk.jol.info.ClassLayout;

public class JavaObjectMemoryLayoutTest {
    public static void main(String[] args) {

        JavaObjectMemoryLayout obj = new JavaObjectMemoryLayout();

        System.out.println(ClassLayout.parseInstance(obj).toPrintable());

    }
}


