package cn.fcsca.model;

import lombok.Data;

import java.sql.Date;

/**
 * Student
 *
 * @author Fcscanf
 * @description
 * @date 上午 9:34 2018-11-13
 */
@Data
public class Student {
    private int id;
    private String name;
    private int gender;
    private Date birthday;
    private String professional;
    private String note;
}
