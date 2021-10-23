package com.miumg.project.model.personData;

import javax.persistence.*;

@Entity
@Table(name = "bancarizado", schema = "dbo", catalog = "Universidad")
public class BancarizadoEntity {
    private int bankedId;
    private String typeAccount;
    private String accountNumber;
    private String typeCurrency;

    @Id
    @Column(name = "bankedId")
    public int getBankedId() {
        return bankedId;
    }

    public void setBankedId(int bankedId) {
        this.bankedId = bankedId;
    }

    @Basic
    @Column(name = "typeAccount")
    public String getTypeAccount() {
        return typeAccount;
    }

    public void setTypeAccount(String typeAccount) {
        this.typeAccount = typeAccount;
    }

    @Basic
    @Column(name = "accountNumber")
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Basic
    @Column(name = "typeCurrency")
    public String getTypeCurrency() {
        return typeCurrency;
    }

    public void setTypeCurrency(String typeCurrency) {
        this.typeCurrency = typeCurrency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BancarizadoEntity that = (BancarizadoEntity) o;

        if (bankedId != that.bankedId) return false;
        if (typeAccount != null ? !typeAccount.equals(that.typeAccount) : that.typeAccount != null) return false;
        if (accountNumber != null ? !accountNumber.equals(that.accountNumber) : that.accountNumber != null)
            return false;
        if (typeCurrency != null ? !typeCurrency.equals(that.typeCurrency) : that.typeCurrency != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bankedId;
        result = 31 * result + (typeAccount != null ? typeAccount.hashCode() : 0);
        result = 31 * result + (accountNumber != null ? accountNumber.hashCode() : 0);
        result = 31 * result + (typeCurrency != null ? typeCurrency.hashCode() : 0);
        return result;
    }
}
