package cn.fcsca.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

/**
 * StrutsAction
 *
 * @author Fcscanf
 * @description
 * @date 下午 13:17 2018-11-11
 */
public class StrutsAction extends ActionSupport {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String execute() {
        if (!name.equals("HelloWorld")) {
            Map request = (Map) ActionContext.getContext().get("request");
            request.put("name", getName());
            return "success";
        } else {
            return "error";
        }
    }

    /**
     * vaildate
     * 如果不满足验证条件将错误信息添加到Action类的fieldErrors
     * TODO:当前的验证类未起作用
     *
     * @param
     * @return
     * @author Fcscanf
     * @date 下午 21:54 2018-11-11
     */
    public void vaildate() {
        if (this.getName() == null || this.getName().trim().equals("")) {
            addFieldError("name","姓名是必须的！");
        }
    }
}
