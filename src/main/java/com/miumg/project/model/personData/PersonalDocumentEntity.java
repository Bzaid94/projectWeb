package com.miumg.project.model.personData;

import javax.persistence.*;

@Entity
@Table(name = "personalDocument", schema = "dbo", catalog = "Universidad")
public class PersonalDocumentEntity {
    private int profileId;
    private String firstName;
    private String secondName;
    private String firstLastName;
    private String secondLastName;
    private String dpi;

    public PersonalDocumentEntity(int profileId, String firstName, String secondName, String firstLastName, String secondLastName, String dpi) {
        this.profileId = profileId;
        this.firstName = firstName;
        this.secondName = secondName;
        this.firstLastName = firstLastName;
        this.secondLastName = secondLastName;
        this.dpi = dpi;
    }

    public PersonalDocumentEntity() {

    }

    @Id
    @Column(name = "profileId")
    public int getProfileId() {
        return profileId;
    }

    public void setProfileId(int profileId) {
        this.profileId = profileId;
    }

    @Basic
    @Column(name = "firstName")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "secondName")
    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Basic
    @Column(name = "firstLastName")
    public String getFirstLastName() {
        return firstLastName;
    }

    public void setFirstLastName(String firstLastName) {
        this.firstLastName = firstLastName;
    }

    @Basic
    @Column(name = "secondLastName")
    public String getSecondLastName() {
        return secondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    @Basic
    @Column(name = "dpi")
    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonalDocumentEntity that = (PersonalDocumentEntity) o;

        if (profileId != that.profileId) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (secondName != null ? !secondName.equals(that.secondName) : that.secondName != null) return false;
        if (firstLastName != null ? !firstLastName.equals(that.firstLastName) : that.firstLastName != null)
            return false;
        if (secondLastName != null ? !secondLastName.equals(that.secondLastName) : that.secondLastName != null)
            return false;
        if (dpi != null ? !dpi.equals(that.dpi) : that.dpi != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = profileId;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + (firstLastName != null ? firstLastName.hashCode() : 0);
        result = 31 * result + (secondLastName != null ? secondLastName.hashCode() : 0);
        result = 31 * result + (dpi != null ? dpi.hashCode() : 0);
        return result;
    }
}
