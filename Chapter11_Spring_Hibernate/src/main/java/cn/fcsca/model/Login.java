package cn.fcsca.model;

/**
 * Login
 *
 * @author Fcscanf
 * @description
 * @date 下午 22:51 2018-12-04
 */
public class Login {
    private Integer id;
    private String studentNumber;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Login login = (Login) o;

        if (id != null ? !id.equals(login.id) : login.id != null) return false;
        if (studentNumber != null ? !studentNumber.equals(login.studentNumber) : login.studentNumber != null)
            return false;
        if (password != null ? !password.equals(login.password) : login.password != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (studentNumber != null ? studentNumber.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}
