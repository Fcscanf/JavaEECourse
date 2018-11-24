package cn.fcsca.dao;

import cn.fcsca.model.Course;

import java.util.List;

/**
 * CourseDao
 *
 * @author Fcscanf
 * @description
 * @date 下午 13:26 2018-11-19
 */
public interface CourseDao {

    /**
     * 通过课程id获取专业信息
     *
     * @param courseId
     * @return course
     * @author Fcscanf
     * @date 下午 13:33 2018-11-19
     */
    public Course getCourseById(String courseId);

    /**
     * 获取所有的课程信息
     *
     * @param
     * @return list
     * @author Fcscanf
     * @date 下午 13:34 2018-11-19
     */
    public List getAllCourse();
}
