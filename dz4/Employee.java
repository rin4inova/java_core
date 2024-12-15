package dz4;

import dz4.Customer;
import dz4.Employee;
import dz4.Holiday;

public class Employee {
    private String name;
    private Customer.Gender gender;

    public Employee(String name, Customer.Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Customer.Gender getGender() {
        return gender;
    }
}