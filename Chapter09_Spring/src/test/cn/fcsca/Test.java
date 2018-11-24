package cn.fcsca;

import cn.fcsca.dependency.face.Human;
import cn.fcsca.dependency.factory.Factory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Test
 *
 * @author Fcscanf
 * @description
 * @date 下午 23:58 2018-11-24
 */
public class Test {

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
     * 设置注入测试
     *
     * @param
     * @return
     * @author Fcscanf
     * @date 上午 0:26 2018-11-25
     */
    @org.junit.Test
    public void SetDependency() {
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/applicationContext.xml");
        Human human = null;
        human = (Human) context.getBean("chinese");
        human.speak();
    }
}
