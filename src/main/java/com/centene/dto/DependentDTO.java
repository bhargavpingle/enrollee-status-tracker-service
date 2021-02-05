package com.centene.dto;

import javax.persistence.Id;
import java.util.Date;
import java.util.Objects;

public class DependentDTO {

    private Long id;

    private String name;

    private Date birthDate;

    public DependentDTO(Long id, String name, Date birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DependentDTO)) return false;
        DependentDTO that = (DependentDTO) o;
        return getId().equals(that.getId()) &&
                getName().equals(that.getName()) &&
                getBirthDate().equals(that.getBirthDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getBirthDate());
    }
}
