package com.miumg.project.model.personData;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "noBancarizado", schema = "dbo", catalog = "Universidad")
public class NoBancarizadoEntity {
    private int unBankedId;

    @Id
    @Column(name = "unBankedId")
    public int getUnBankedId() {
        return unBankedId;
    }

    public void setUnBankedId(int unBankedId) {
        this.unBankedId = unBankedId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NoBancarizadoEntity that = (NoBancarizadoEntity) o;

        if (unBankedId != that.unBankedId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return unBankedId;
    }
}
