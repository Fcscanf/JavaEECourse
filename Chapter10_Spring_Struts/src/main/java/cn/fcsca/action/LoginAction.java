package cn.fcsca.action;

import com.opensymphony.xwork2.ActionSupport;
import lombok.Data;

/**
 * LoginAction
 *
 * @author Fcscanf
 * @description
 * @date 下午 16:14 2018-11-27
 */
@Data
public class LoginAction extends ActionSupport {
    private String studentNumber;
    private String password;

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}
