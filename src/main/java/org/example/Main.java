package org.example;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>(List.of(
                new Employee("Egor", "Veselov"),
                new Employee("Lord", "Farkuad"),
                new Employee("Only","Bmw"),
                new Employee("Berychc","Bernadotov"),
                new Employee("El","Programist"),
                new Employee("Ahmed","Bmw"),
                new Employee("Puffs","Ehkov")));

        boolean hasInvalidNameOrSurname = false;

        for (Employee employee : employeeList) {

            String firstCapitalLetterName = employee.formatName(employee.getName());
            String firstCapitalLetterSurname = employee.formatName(employee.getSurName());

            if (!StringUtils.isAlphaSpace(firstCapitalLetterName) ||
                    !StringUtils.isAlphaSpace(firstCapitalLetterSurname)) {
                System.out.println(employee);
                hasInvalidNameOrSurname = true;
            }
        }
        if (hasInvalidNameOrSurname){
            throw new BadRequestException("Bad Request");
        }
    }
}