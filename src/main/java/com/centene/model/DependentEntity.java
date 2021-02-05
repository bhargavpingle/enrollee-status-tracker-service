package com.centene.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.Objects;

@Entity(name = "dependent")
public class DependentEntity {
    @Id
    private Long id;

    private String name;

    private Date birthDate;

    public DependentEntity() {
    }

    public DependentEntity(Long id, String name, Date birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DependentEntity)) return false;
        DependentEntity dependentEntity = (DependentEntity) o;
        return getId() == dependentEntity.getId() &&
                Objects.equals(getName(), dependentEntity.getName()) &&
                Objects.equals(getBirthDate(), dependentEntity.getBirthDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getBirthDate());
    }
}
