package cn.fcsca.model;

import lombok.Data;

import java.sql.Date;

/**
 * LyTable
 *
 * @author Fcscanf
 * @description
 * @date 下午 22:32 2018-11-09
 */
@Data
public class LyTable {
    private int id;
    private int userId;
    private Date date;
    private String title;
    private String content;
}
