package com.j8;

import java.util.Objects;

public class HashCodeAndEquals {
    private int id;
    private String name;

    // 1. equals() checks the actual data (id and name)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashCodeAndEquals employee = (HashCodeAndEquals) o;
        return id == employee.id && Objects.equals(name, employee.name);
    }

    // 2. hashCode() generates a number based on the SAME data
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
