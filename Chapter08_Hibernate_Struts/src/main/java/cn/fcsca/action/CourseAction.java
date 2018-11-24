package cn.fcsca.action;

import cn.fcsca.dao.CourseDao;
import cn.fcsca.dao.impl.CourseDaoImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;
import java.util.Map;

/**
 * CourseAction
 *
 * @author Fcscanf
 * @description
 * @date 下午 18:35 2018-11-19
 */
public class CourseAction extends ActionSupport {
    @Override
    public String execute() throws Exception {
        CourseDao courseDao = new CourseDaoImpl();
        List list = courseDao.getAllCourse();
        Map request = (Map) ActionContext.getContext().get("request");
        request.put("list", list);
        return SUCCESS;
    }
}
