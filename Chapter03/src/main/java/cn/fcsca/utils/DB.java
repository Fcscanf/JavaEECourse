package cn.fcsca.utils;

import cn.fcsca.model.LyTable;
import cn.fcsca.model.User;

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
     * Check User
     *
     * @param username
     * @param password
     * @return null
     * @author Fcscanf
     * @date 下午 23:21 2018-11-09
     */
    public User checkUser(String username, String password) {
        try {
            preparedStatement = connection.prepareStatement("select * FROM userTable where username=? and password=?");
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            User user = new User();
            while (resultSet.next()) {
                user.setId(resultSet.getInt(1));
                user.setUsername(resultSet.getString(2));
                user.setPassword(resultSet.getString(3));
                return user;
            }
            return null;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public ArrayList findinfo() {
        try {
            ArrayList arrayList = new ArrayList();
            preparedStatement = connection.prepareStatement("select * from lyTable");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                LyTable lyTable = new LyTable();
                lyTable.setId(resultSet.getInt(1));
                lyTable.setUserId(resultSet.getInt(2));
                lyTable.setDate(resultSet.getDate(3));
                lyTable.setTitle(resultSet.getString(4));
                lyTable.setContent(resultSet.getString(5));
                arrayList.add(lyTable);
            }
            return arrayList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 获取用户名
     *
     * @param
     * @return
     * @author Fcscanf
     * @date 下午 13:20 2018-11-10
     */
    public String getUserName(int id) {
        String username = null;
        try {
            preparedStatement = connection.prepareStatement("select username from userTable where id=?");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                username = resultSet.getString(1);
            }
            return username;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean addInfo(LyTable lyTable) {
        try {
            preparedStatement = connection.prepareStatement("insert into lyTable (userId, date, title, content) values (?,?,?,?)");
            preparedStatement.setInt(1, lyTable.getUserId());
            preparedStatement.setDate(2, lyTable.getDate());
            preparedStatement.setString(3, lyTable.getTitle());
            preparedStatement.setString(4, lyTable.getContent());
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
