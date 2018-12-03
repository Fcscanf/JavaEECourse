package cn.fcsca.aop.proxy.dynamicproxy.impl;

import cn.fcsca.aop.proxy.dynamicproxy.IHello;

/**
 * HelloSpeaker
 *
 * @author Fcscanf
 * @description
 * @date 下午 16:59 2018-11-28
 */
public class HelloSpeaker implements IHello {

    @Override
    public void hello(String name) {
        System.out.println("hello" + name);
    }
}
