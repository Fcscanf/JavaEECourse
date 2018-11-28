package cn.fcsca.aop.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * LogHandler
 *
 * @author Fcscanf
 * @description
 * @date 下午 17:17 2018-11-28
 */
public class LogHandler implements InvocationHandler {
    private Object sub;

    public LogHandler(Object sub) {
        this.sub = sub;
    }

    public LogHandler() {
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before you do thing");
        method.invoke(sub, args);
        System.out.println("after you do thing");
        return null;
    }
}
