package app.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "users")
public class User implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private int id;

    @Column(name = "user_name", nullable = false)
    private String name;

    @Column(name = "user_surname")
    private String surname;

    @Column(name = "user_birthday", nullable = false)
    private String birthday;

    @Column(name = "user_sex", nullable = false)
    private String sex;

    @OneToOne
    @JoinColumn(name = "user_address")
    private Address address;

    public User() {
    }

    public User(String name, String surname, String birthday, String sex, Address address) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.sex = sex;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String  getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday=" + birthday +
                ", sex=" + sex +
                ", address=" + address +
                '}';
    }
}
