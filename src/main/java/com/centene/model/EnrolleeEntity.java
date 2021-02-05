package com.centene.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity(name = "enrollee")
public class EnrolleeEntity {

    @Id
    private Long id;

    private String name;

    private boolean activationStatus;

    private Date birthDate;

    @OneToMany(targetEntity = DependentEntity.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "enrlmnt_id", referencedColumnName = "id")
    private List<DependentEntity> dependentEntities;

    public EnrolleeEntity(Long id, String name, boolean activationStatus, Date birthDate,
                          List<DependentEntity> dependentEntities) {
        this.id = id;
        this.name = name;
        this.activationStatus = activationStatus;
        this.birthDate = birthDate;
        this.dependentEntities = dependentEntities;
    }

    public EnrolleeEntity(){}

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

    public boolean isActivationStatus() {
        return activationStatus;
    }

    public void setActivationStatus(boolean activationStatus) {
        this.activationStatus = activationStatus;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public List<DependentEntity> getDependentEntities() {
        return dependentEntities;
    }

    public void setDependentEntities(List<DependentEntity> dependentEntities) {
        this.dependentEntities = dependentEntities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnrolleeEntity enrolleeEntity = (EnrolleeEntity) o;
        return id == enrolleeEntity.id &&
                activationStatus == enrolleeEntity.activationStatus &&
                Objects.equals(name, enrolleeEntity.name) &&
                Objects.equals(birthDate, enrolleeEntity.birthDate) &&
                Objects.equals(dependentEntities, enrolleeEntity.dependentEntities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, activationStatus, birthDate, dependentEntities);
    }
}
