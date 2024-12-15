package dz4;

import dz4.Customer;
import dz4.Employee;
import dz4.Holiday;


public class Customer {

    public enum Gender {
        MALE,  // Мужской пол
        FEMALE // Женский пол
    }

    private String name; // Имя покупателя
    private Gender gender; // Пол покупателя

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public Customer(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }
}
