package cn.fcsca.db;

import cn.fcsca.model.Student;

import java.sql.*;
import java.util.ArrayList;

/**
 * DB
 *
 * @author Fcscanf
 * @description
 * @date 下午 23:08 2018-11-09
 */
public class DB {
    Connection connection;
    PreparedStatement preparedStatement;

    /**
     * Config
     *
     * @param
     * @return
     * @author Fcscanf
     * @date 下午 23:29 2018-11-09
     */
    public DB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql:///javaee?serverTimezone=UTC", "root", "509165");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 保存学生信息
     *
     * @param student
     * @return
     * @author Fcscanf
     * @date 下午 23:49 2018-11-13
     */
    public boolean save(Student student) {
        try {
            preparedStatement = connection.prepareStatement("insert into student values (?,?,?,?,?,?)");
            preparedStatement.setInt(1, student.getId());
            preparedStatement.setString(2,student.getName());
            preparedStatement.setInt(3,student.getGender());
            preparedStatement.setDate(4, student.getBirthday());
            preparedStatement.setString(5, student.getProfessional());
            preparedStatement.setString(6,student.getNote());
            preparedStatement.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 测试连接
     *
     * @param args
     * @return null
     * @author Fcscanf
     * @date 下午 13:19 2018-11-10
     */
    public static void main(String[] args) {
        DB db = new DB();
        System.out.println("连接成功!");
    }
}
