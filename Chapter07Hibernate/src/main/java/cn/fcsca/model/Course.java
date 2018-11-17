package cn.fcsca.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Course
 *
 * @author Fcscanf
 * @description
 * @date 下午 21:08 2018-11-17
 */
public class Course {
    private Integer id;
    private String courseNumber;
    private String courseName;
    private Set student = new HashSet();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

        if (id != null ? !id.equals(course.id) : course.id != null) return false;
        if (courseNumber != null ? !courseNumber.equals(course.courseNumber) : course.courseNumber != null)
            return false;
        if (courseName != null ? !courseName.equals(course.courseName) : course.courseName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (courseNumber != null ? courseNumber.hashCode() : 0);
        result = 31 * result + (courseName != null ? courseName.hashCode() : 0);
        return result;
    }
}
