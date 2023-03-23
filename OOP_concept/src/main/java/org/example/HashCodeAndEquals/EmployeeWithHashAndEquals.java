package org.example.HashCodeAndEquals;

import java.util.Objects;

public class EmployeeWithHashAndEquals {
    int id;
    String name;

    public EmployeeWithHashAndEquals(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public EmployeeWithHashAndEquals() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EmployeeWithoutHashAndEquals{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeWithHashAndEquals that = (EmployeeWithHashAndEquals) o;
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
