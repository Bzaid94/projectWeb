package com.miumg.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "banco", schema = "dbo", catalog = "Universidad")
public class BancoEntity {
    private int bankId;

    @Id
    @Column(name = "bankId")
    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BancoEntity that = (BancoEntity) o;

        if (bankId != that.bankId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return bankId;
    }
}
