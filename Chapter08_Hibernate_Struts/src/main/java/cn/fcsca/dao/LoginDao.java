package cn.fcsca.dao;

import cn.fcsca.model.Login;

/**
 * LoginDao
 *
 * @author Fcscanf
 * @description
 * @date 下午 13:02 2018-11-19
 */
public interface LoginDao {

    /**
     * 学生的登录验证
     *
     * @param studentNumber
     * @param password
     * @return
     * @author Fcscanf
     * @date 下午 13:03 2018-11-19
     */
    public Login validate(String studentNumber, String password);
}
