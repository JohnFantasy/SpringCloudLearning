package com.laofaner.DesignPatterns.principles.OpenClosedPrinciple;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_HARD_LIGHTPeer;

/**
 * @program: SpringBoot&SpringCloud
 * @description: 开闭原则demo
 * @author: fyz
 * @create: 2019-08-09 11:31
 **/
public class Ocp {

    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        Shape shape = new Triangle();
        graphicEditor.drawShape(shape);

    }

}

class GraphicEditor {
    public void drawShape(Shape shape) {

        if (shape.m_type == 1) {
            drawTriangle();
        }
        if (shape.m_type == 2) {
            drawCircle();
        }
        if (shape.m_type == 3) {
            drawRectangle();
        }
    }

    void drawTriangle() {
        System.out.println("三角形");
    }

    void drawCircle() {
        System.out.println("圆形");
    }

    void drawRectangle() {
        System.out.println("矩形");
    }
}

class Shape {
    int m_type;
}

class Triangle extends Shape {

    Triangle() {
        super.m_type = 1;
    }

}

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }
}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 2;
    }
}
