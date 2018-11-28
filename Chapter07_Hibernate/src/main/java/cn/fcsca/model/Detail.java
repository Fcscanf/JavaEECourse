package cn.fcsca.model;

/**
 * Detail
 *
 * @author Fcscanf
 * @description
 * @date 上午 8:43 2018-11-16
 */
public class Detail {
    private Integer id;
    private String truename;
    private String email;
    private Login login;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public Detail() {
    }

    public Detail(Integer id, String truename, String email, Login login) {
        this.id = id;
        this.truename = truename;
        this.email = email;
        this.login = login;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Detail detail = (Detail) o;

        if (id != null ? !id.equals(detail.id) : detail.id != null) return false;
        if (truename != null ? !truename.equals(detail.truename) : detail.truename != null) return false;
        if (email != null ? !email.equals(detail.email) : detail.email != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (truename != null ? truename.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }
}
