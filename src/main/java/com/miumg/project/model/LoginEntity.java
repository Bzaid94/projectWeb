package com.miumg.project.model;

import javax.persistence.*;

@Entity
@Table(name = "login", schema = "dbo", catalog = "Universidad")
public class LoginEntity {
    private int idUser;
    private String userName;
    private String passAsign;

    @Id
    @Column(name = "idUser")
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Basic
    @Column(name = "userName")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "passAsign")
    public String getPassAsign() {
        return passAsign;
    }

    public void setPassAsign(String passAsign) {
        this.passAsign = passAsign;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LoginEntity that = (LoginEntity) o;

        if (idUser != that.idUser) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (passAsign != null ? !passAsign.equals(that.passAsign) : that.passAsign != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUser;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (passAsign != null ? passAsign.hashCode() : 0);
        return result;
    }
}
