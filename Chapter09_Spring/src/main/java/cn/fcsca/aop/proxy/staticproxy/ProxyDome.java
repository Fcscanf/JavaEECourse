package cn.fcsca.aop.proxy.staticproxy;

import cn.fcsca.aop.proxy.staticproxy.impl.HelloSpeaker;

/**
 * ProxyDome
 *
 * @author Fcscanf
 * @description
 * @date 下午 17:13 2018-11-28
 */
public class ProxyDome {
    public static void main(String[] args) {
        Ihello ihello = new HelloProxy(new HelloSpeaker());
        ihello.hello("Fcsa");
    }
}
