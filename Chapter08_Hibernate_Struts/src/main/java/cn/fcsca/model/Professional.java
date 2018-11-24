package cn.fcsca.model;

/**
 * Professional
 *
 * @author Fcscanf
 * @description
 * @date 下午 13:24 2018-11-18
 */
public class Professional {
    private Integer id;
    private String professionalName;
    private Integer studnetNumber;
    private String counselor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProfessionalName() {
        return professionalName;
    }

    public void setProfessionalName(String professionalName) {
        this.professionalName = professionalName;
    }

    public Integer getStudnetNumber() {
        return studnetNumber;
    }

    public void setStudnetNumber(Integer studnetNumber) {
        this.studnetNumber = studnetNumber;
    }

    public String getCounselor() {
        return counselor;
    }

    public void setCounselor(String counselor) {
        this.counselor = counselor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Professional that = (Professional) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (professionalName != null ? !professionalName.equals(that.professionalName) : that.professionalName != null)
            return false;
        if (studnetNumber != null ? !studnetNumber.equals(that.studnetNumber) : that.studnetNumber != null)
            return false;
        if (counselor != null ? !counselor.equals(that.counselor) : that.counselor != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (professionalName != null ? professionalName.hashCode() : 0);
        result = 31 * result + (studnetNumber != null ? studnetNumber.hashCode() : 0);
        result = 31 * result + (counselor != null ? counselor.hashCode() : 0);
        return result;
    }
}
