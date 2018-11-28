package cn.fcsca.aop.proxy.staticproxy;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * HelloProxy
 *
 * @author Fcscanf
 * @description
 * @date 下午 17:08 2018-11-28
 */
public class HelloProxy implements Ihello {
    private Logger logger = Logger.getLogger(this.getClass().getName());
    private Ihello ihello;

    public HelloProxy(Ihello ihello) {
        this.ihello = ihello;
    }

    @Override
    public void hello(String name) {
        log("hello method starting...");
        ihello.hello(name);
        log("hello method ends...");
    }

    private void log(String msg) {
        logger.log(Level.INFO, msg);
    }
}
