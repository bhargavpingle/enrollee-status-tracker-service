package com.centene.dto;

import com.centene.model.DependentEntity;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class EnrolleeDTO {
    private Long id;

    private String name;

    private boolean activationStatus;

    private Date birthDate;

    private List<DependentEntity> dependentEntities;

    public EnrolleeDTO(Long id, String name, boolean activationStatus, Date birthDate, List<DependentEntity> dependentEntities) {
        this.id = id;
        this.name = name;
        this.activationStatus = activationStatus;
        this.birthDate = birthDate;
        this.dependentEntities = dependentEntities;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
        if (!(o instanceof EnrolleeDTO)) return false;
        EnrolleeDTO that = (EnrolleeDTO) o;
        return isActivationStatus() == that.isActivationStatus() &&
                Objects.equals(getId(), that.getId()) &&
                Objects.equals(getName(), that.getName()) &&
                Objects.equals(getBirthDate(), that.getBirthDate()) &&
                Objects.equals(getDependentEntities(), that.getDependentEntities());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), isActivationStatus(), getBirthDate(), getDependentEntities());
    }
}
