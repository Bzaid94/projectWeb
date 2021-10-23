package com.miumg.project.model.employee;

import javax.persistence.*;

@Entity
@Table(name = "jerarquia", schema = "dbo", catalog = "Universidad")
public class JerarquiaEntity {
    private int jeraId;
    private String role;
    private String description;

    @Id
    @Column(name = "jeraId")
    public int getJeraId() {
        return jeraId;
    }

    public void setJeraId(int jeraId) {
        this.jeraId = jeraId;
    }

    @Basic
    @Column(name = "role")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JerarquiaEntity that = (JerarquiaEntity) o;

        if (jeraId != that.jeraId) return false;
        if (role != null ? !role.equals(that.role) : that.role != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = jeraId;
        result = 31 * result + (role != null ? role.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
