package org.example;

import org.apache.commons.lang3.StringUtils;

public class Employee {

    private String name;
    private String surName;

    public Employee(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "Сотрудник - " + name + " " + surName;
    }

    public String formatName(String fullname) {
        return StringUtils.capitalize(StringUtils.trim(fullname));
    }
}
