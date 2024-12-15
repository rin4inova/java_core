package dz3;

public class Main {
    public static void main(String[] args) {
        demonstrateEmployeeOperations();
    }

    private static void demonstrateEmployeeOperations() {
        Employee employee1 = new Employee();
        int result = employee1.compareDates(2024, 10, 8, 2023, 10, 8);
        System.out.println("Результат сравнения дат: " + result + "\n");

        // Создание объектов сотрудников
        Employee emp1 = new Employee("Maksim employee", 50000);
        Employee emp2 = new Employee("Ivan employee", 55000);
        Manager manager = new Manager("Michael Manager", 100000);

        // Помещаем их в общий массив сотрудников
        Employee[] employees = {emp1, emp2, manager};

        System.out.println("До повышения зарплаты:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // Повысьте зарплату всем сотрудникам на 10%, кроме руководителей
        Manager.raiseSalaryForEmployees(employees, 10);

        System.out.println("\nПосле повышения зарплаты:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
