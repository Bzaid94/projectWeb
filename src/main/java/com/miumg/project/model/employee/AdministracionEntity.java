package com.miumg.project.model.employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "administracion", schema = "dbo", catalog = "Universidad")
public class AdministracionEntity {
    private int adminId;

    @Id
    @Column(name = "adminId")
    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdministracionEntity that = (AdministracionEntity) o;

        if (adminId != that.adminId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return adminId;
    }
}
