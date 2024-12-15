package dz4;
import dz4.Customer;
import dz4.Employee;
import dz4.Holiday;

public class Main {
    public static void main(String[] args) {
        EmployeesHoliday();
    }
    private static void EmployeesHoliday() {
        // Создание массива сотрудников
        Employee[] employees = {
                new Employee("Иван", Customer.Gender.MALE),
                new Employee("Анна", Customer.Gender.FEMALE)
        };

        // Поздравление сотрудников с праздниками
        Holiday.greetEmployees(employees);
    }
}
