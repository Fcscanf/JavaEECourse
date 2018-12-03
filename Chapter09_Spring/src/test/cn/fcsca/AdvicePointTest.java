package cn.fcsca;

import cn.fcsca.advice.pointcut.face.IHello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * AdvicePointTest
 *
 * @author Fcscanf
 * @description
 * @date 下午 23:19 2018-12-03
 */
public class AdvicePointTest {
    ApplicationContext context = new
            FileSystemXmlApplicationContext
            ("src/main/resources/applicationContext.xml");

    /**
     * 测试AOP Advice PointCut
     * @author Fcscanf
     * @date 下午 22:55 2018-11-29
     */
    @org.junit.Test
    public void AOPAdvicePointCut() {
        IHello ihello = (IHello) context.getBean("helloProxy");
        ihello.helloNewbie("Justin");
        ihello.helloNewbie("Tom");
    }
}
