package cn.fcsca.dependency.face.impl;

import cn.fcsca.dependency.face.Human;

/**
 * American
 *
 * @author Fcscanf
 * @description
 * @date 下午 23:26 2018-11-24
 */
public class American implements Human {
    @Override
    public void eat() {
        System.out.println("美国人吃西餐！");
    }

    @Override
    public void walk() {
        System.out.println("美国人经常坐车！");
    }

    @Override
    public void speak() {
        System.out.println("hello");;
    }
}
