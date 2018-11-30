package cn.fcsca.advice.face.impl;

import cn.fcsca.advice.face.IHello;

/**
 * HelloSpeaker
 *
 * @author Fcscanf
 * @description
 * @date 下午 22:13 2018-11-29
 */
public class HelloSpeaker implements IHello {
    @Override
    public void hello(String name) {
        System.out.println("hello," + name);
    }
}
