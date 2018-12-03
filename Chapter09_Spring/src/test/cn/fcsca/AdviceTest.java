package cn.fcsca;

import cn.fcsca.advice.face.IHello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * AdviceTest
 *
 * @author Fcscanf
 * @description
 * @date 下午 23:17 2018-12-03
 */
public class AdviceTest {

    ApplicationContext context = new
            FileSystemXmlApplicationContext
            ("src/main/resources/applicationContext.xml");

    /**
     * 测试AOP Advice
     *
     * @param
     * @return
     * @author Fcscanf
     * @date 下午 22:55 2018-11-29
     */
    @org.junit.Test
    public void AOPAdvice() {
        IHello ihello = (IHello) context.getBean("helloProxy");
        ihello.hello("TGR");
    }
}
