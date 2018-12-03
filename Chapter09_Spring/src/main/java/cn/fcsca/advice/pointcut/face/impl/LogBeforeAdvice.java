package cn.fcsca.advice.pointcut.face.impl;


import cn.fcsca.advice.pointcut.face.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * LogBeforeAdvice
 *
 * @author Fcscanf
 * @description
 * @date 下午 22:14 2018-11-29
 */
public class LogBeforeAdvice implements MethodBeforeAdvice {

    private Logger logger = Logger.getLogger(this.getClass().getName());

    @Override
    public void before(Method method, Object[] args, Object target) throws Exception {
        logger.log(Level.INFO, "method starting" + method);
    }
}
