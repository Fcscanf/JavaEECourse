package cn.fcsca.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Course
 *
 * @author Fcscanf
 * @description
 * @date 下午 13:24 2018-11-18
 */
public class Course {
    private String courseNumber;
    private String courseName;
    private Integer schoolYear;
    private Integer courseTime;
    private Integer courseCredit;
    private Set student = new HashSet();

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(Integer schoolYear) {
        this.schoolYear = schoolYear;
    }

    public Integer getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(Integer courseTime) {
        this.courseTime = courseTime;
    }

    public Integer getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(Integer courseCredit) {
        this.courseCredit = courseCredit;
    }

    public Set getStudent() {
        return student;
    }

    public void setStudent(Set student) {
        this.student = student;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Course course = (Course) o;

        if (courseNumber != null ? !courseNumber.equals(course.courseNumber) : course.courseNumber != null)
            return false;
        if (courseName != null ? !courseName.equals(course.courseName) : course.courseName != null) return false;
        if (schoolYear != null ? !schoolYear.equals(course.schoolYear) : course.schoolYear != null) return false;
        if (courseTime != null ? !courseTime.equals(course.courseTime) : course.courseTime != null) return false;
        if (courseCredit != null ? !courseCredit.equals(course.courseCredit) : course.courseCredit != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = courseNumber != null ? courseNumber.hashCode() : 0;
        result = 31 * result + (courseName != null ? courseName.hashCode() : 0);
        result = 31 * result + (schoolYear != null ? schoolYear.hashCode() : 0);
        result = 31 * result + (courseTime != null ? courseTime.hashCode() : 0);
        result = 31 * result + (courseCredit != null ? courseCredit.hashCode() : 0);
        return result;
    }
}
