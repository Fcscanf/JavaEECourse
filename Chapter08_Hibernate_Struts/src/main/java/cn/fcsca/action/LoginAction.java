package cn.fcsca.action;

import cn.fcsca.dao.LoginDao;
import cn.fcsca.dao.impl.LoginDaoImpl;
import cn.fcsca.model.Login;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

/**
 * LoginAction
 *
 * @author Fcscanf
 * @description
 * @date 下午 21:30 2018-11-19
 */
public class LoginAction extends ActionSupport {
    private Login login;

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    @Override
    public String execute() throws Exception {
        LoginDao loginDao = new LoginDaoImpl();
        Login user = loginDao.validate(login.getStudentNumber(), login.getPassword());
        if (user != null) {
            Map session = ActionContext.getContext().getSession();
            session.put("user", user);
            return SUCCESS;
        } else {
            return ERROR;
        }
    }
}
