package cn.fcsca.test;

import cn.fcsca.dao.LoginDao;
import cn.fcsca.model.Login;
import javassist.ClassPath;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Test
 *
 * @author Fcscanf
 * @description
 * @date 下午 23:16 2018-12-04
 */
public class Test {

    @org.junit.Test
    public void springHiberanteTest() {
        Login login = new Login();
        login.setId(2);
        login.setStudentNumber("1610701107");
        login.setPassword("111111");
        ApplicationContext context =
                new FileSystemXmlApplicationContext
                        ("src/main/resources/applicationContext.xml");
        LoginDao loginDao = (LoginDao) context.getBean("loginDao");
        loginDao.save(login);
    }
}
