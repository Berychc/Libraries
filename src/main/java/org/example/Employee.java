package org.example;

public class Employee {

    private String fullName;
    private int departament;

    public Employee(String fullName, int departament) {
        this.fullName = fullName;
        this.departament = departament;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getDepartament() {
        return departament;
    }

    public void setDepartament(int departament) {
        this.departament = departament;
    }

    @Override
    public String toString() {
        return "Сотрудник { Ф.И.О - " + fullName + " | Отдел - " + departament + '}';
    }
}
