package cn.fcsca.aop.proxy;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * HelloSpeaker
 *
 * @author Fcscanf
 * @description
 * @date 下午 16:52 2018-11-28
 */
public class HelloSpeaker {
    private Logger logger = Logger.getLogger(this.getClass().getName());

    public void hello(String name) {
        logger.log(Level.INFO, "hello method starting...");
        System.out.println("hello" + name);
        logger.log(Level.INFO,"hello method ends...");
    }
}
