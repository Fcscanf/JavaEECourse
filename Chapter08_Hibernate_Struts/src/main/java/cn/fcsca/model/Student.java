package cn.fcsca.model;

import java.sql.Date;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Student
 *
 * @author Fcscanf
 * @description
 * @date 下午 13:24 2018-11-18
 */
public class Student {
    private String studentNumber;
    private String studentName;
    private Integer gender;
    private Date birthday;
    private Integer totalCredit;
    private String note;
    private byte[] photo;
    private Professional professional;
    private Set course = new HashSet();

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

//    public Integer getProfiessionalId() {
//        return profiessionalId;
//    }
//
//    public void setProfiessionalId(Integer profiessionalId) {
//        this.profiessionalId = profiessionalId;
//    }

    public Professional getProfessional() {
        return professional;
    }

    public void setProfessional(Professional professional) {
        this.professional = professional;
    }

    public Set getCourse() {
        return course;
    }

    public void setCourse(Set course) {
        this.course = course;
    }

    public Integer getTotalCredit() {
        return totalCredit;
    }

    public void setTotalCredit(Integer totalCredit) {
        this.totalCredit = totalCredit;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

}
