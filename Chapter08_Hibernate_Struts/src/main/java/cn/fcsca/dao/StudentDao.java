package cn.fcsca.dao;

import cn.fcsca.model.Student;

/**
 * StudentDao
 *
 * @author Fcscanf
 * @description
 * @date 下午 13:25 2018-11-19
 */
public interface StudentDao {

    /**
     * 根据学号查询学生信息
     *
     * @param studentNumber
     * @return student
     * @author Fcscanf
     * @date 下午 13:29 2018-11-19
     */
    public Student getStudentById(String studentNumber);

    /**
     * 修改学生信息
     *
     * @param student
     * @return null
     * @author Fcscanf
     * @date 下午 13:28 2018-11-19
     */
    public void updateStudent(Student student);
}
