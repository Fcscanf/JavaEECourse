package cn.fcsca.interceptor;

import cn.fcsca.action.StrutsAction;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * AInterceptor
 *
 * @author Fcscanf
 * @description
 * @date 下午 23:02 2018-11-12
 */
public class AInterceptor extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        StrutsAction action = (StrutsAction) actionInvocation.getAction();
        if (action.getName().equals("hello")) {
            return Action.ERROR;
        }
        return actionInvocation.invoke();
    }
}
