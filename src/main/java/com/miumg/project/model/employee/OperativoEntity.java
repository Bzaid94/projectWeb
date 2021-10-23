package com.miumg.project.model.employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "operativo", schema = "dbo", catalog = "Universidad")
public class OperativoEntity {
    private int opId;

    @Id
    @Column(name = "opId")
    public int getOpId() {
        return opId;
    }

    public void setOpId(int opId) {
        this.opId = opId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OperativoEntity that = (OperativoEntity) o;

        if (opId != that.opId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return opId;
    }
}
