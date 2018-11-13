package cn.fcsca.action;

import cn.fcsca.model.User;
import com.opensymphony.xwork2.ActionSupport;

/**
 * LoginAction
 *
 * @author Fcscanf
 * @description
 * @date 上午 7:56 2018-11-13
 */
public class LoginAction extends ActionSupport {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}
