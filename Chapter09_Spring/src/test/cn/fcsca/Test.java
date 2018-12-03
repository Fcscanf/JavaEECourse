package cn.fcsca;

import cn.fcsca.aop.proxy.dynamicproxy.IHello;
import cn.fcsca.aop.proxy.dynamicproxy.LogHandler;
import cn.fcsca.aop.proxy.dynamicproxy.impl.HelloSpeaker;
import cn.fcsca.dependency.face.Human;
import cn.fcsca.dependency.factory.Factory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.lang.reflect.Proxy;

/**
 * Test
 *
 * @author Fcscanf
 * @description
 * @date 下午 23:58 2018-11-24
 */
public class Test {
    ApplicationContext context = new
            FileSystemXmlApplicationContext
            ("src/main/resources/applicationContext.xml");

    /**
     * 测试工厂模式
     *
     * @param
     * @return
     * @author Fcscanf
     * @date 上午 0:00 2018-11-25
     */
    @org.junit.Test
    public void DIFactory() throws IllegalAccessException {
        Human human = null;
        human = new Factory().getHuman("Chinese");
        human.eat();
        human.walk();
        human = new Factory().getHuman("American");
        human.eat();
        human.walk();
    }

    /**
     * 设置注入和构造注入的测试
     *
     * @param
     * @return
     * @author Fcscanf
     * @date 上午 0:26 2018-11-25
     */
    @org.junit.Test
    public void SetAndConStructDependency() {
        Human human = null;
        human = (Human) context.getBean("chinese");
        human.speak();
    }

    /**
     * 测试动态代理
     *
     * @param
     * @return
     * @author Fcscanf
     * @date 下午 22:23 2018-11-28
     */
    @org.junit.Test
    public void ProxyTest() {
        HelloSpeaker helloSpeaker = new HelloSpeaker();
        LogHandler logHandler = new LogHandler(helloSpeaker);
        Class cls = helloSpeaker.getClass();
        IHello ihello = (IHello) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), logHandler);
        ihello.hello("Fcs");
    }

}
