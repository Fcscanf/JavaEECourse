package cn.fcsca.advice.face;

import java.lang.ref.*;
import java.lang.reflect.Method;

/**
 * MethodBeforeAdvice
 *
 * @author Fcscanf
 * @description
 * @date 下午 22:09 2018-11-29
 */
public interface MethodBeforeAdvice {
    void before(Method method, Object[] args, Object target)throws Exception;
}
