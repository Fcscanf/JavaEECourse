package cn.fcsca.advice.pointcut.face.impl;

import cn.fcsca.advice.pointcut.face.IHello;

/**
 * HelloSpeaker
 *
 * @author Fcscanf
 * @description
 * @date 下午 22:38 2018-12-03
 */
public class HelloSpeaker implements IHello {
    @Override
    public void helloNewbie(String name) {
        System.out.println("Hello," + name + ",newbie!");
    }

    @Override
    public void helloMaster(String name) {
        System.out.println("Hello," + name + ",master!");
    }
}
