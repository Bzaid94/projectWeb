package com.miumg.project.model;

import javax.persistence.*;

@Entity
@Table(name = "empleado", schema = "dbo", catalog = "Universidad")
public class EmpleadoEntity {
    private int employeeId;
    private String name;
    private String lastName;
    private String codEmployee;

    @Id
    @Column(name = "employeeId")
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "lastName")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "codEmployee")
    public String getCodEmployee() {
        return codEmployee;
    }

    public void setCodEmployee(String codEmployee) {
        this.codEmployee = codEmployee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpleadoEntity that = (EmpleadoEntity) o;

        if (employeeId != that.employeeId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (codEmployee != null ? !codEmployee.equals(that.codEmployee) : that.codEmployee != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = employeeId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (codEmployee != null ? codEmployee.hashCode() : 0);
        return result;
    }
}
