package com.demo.clone;

import org.junit.Test;

public class CloneTest {

    @Test
    public void test() {

        Shape circle = new Shape("Circle");

        // 克隆原型对象来创建新对象
        Shape clonedCircle = circle.clone();
        clonedCircle.setType("Cloned Circle");

        // 输出原型对象和克隆对象的类型
        System.out.println("Original Shape Type: " + circle.getType());
        System.out.println("Cloned Shape Type: " + clonedCircle.getType());
    }
}






