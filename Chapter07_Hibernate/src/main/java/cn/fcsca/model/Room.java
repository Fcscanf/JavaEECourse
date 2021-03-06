package cn.fcsca.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Room
 *
 * @author Fcscanf
 * @description
 * @date 下午 22:52 2018-11-16
 */
public class Room {
    private Integer id;
    private String address;
    private Set person=new HashSet();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set getPerson() {
        return person;
    }

    public void setPerson(Set person) {
        this.person = person;
    }

    public Room() {
    }

    public Room(Integer id, String address) {
        this.id = id;
        this.address = address;
//        this.person = person;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Room room = (Room) o;

        if (id != null ? !id.equals(room.id) : room.id != null) return false;
        if (address != null ? !address.equals(room.address) : room.address != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }
}
