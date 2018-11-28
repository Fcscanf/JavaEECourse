package cn.fcsca.model;

/**
 * Login
 *
 * @author Fcscanf
 * @description
 * @date 上午 8:43 2018-11-16
 */
public class Login {
    private Integer id;
    private String username;
    private String password;
    private Detail detail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Detail getDetail() {
        return detail;
    }

    public void setDetail(Detail detail) {
        this.detail = detail;
    }

    public Login() {
    }

    public Login(Integer id, String username, String password, Detail detail) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.detail = detail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Login login = (Login) o;

        if (id != null ? !id.equals(login.id) : login.id != null) return false;
        if (username != null ? !username.equals(login.username) : login.username != null) return false;
        if (password != null ? !password.equals(login.password) : login.password != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}
