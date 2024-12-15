package dz3;

public class Manager extends Employee {

    public Manager(String name, double salary) {
        super(name, salary);
    }


    public static void raiseSalaryForEmployees(Employee[] employees, double raise) {
        for (Employee employee : employees) {
            // Проверяем, что сотрудник не является руководителем
            if (!(employee instanceof Manager)) {
                double newSalary = employee.getSalary() * (1 + raise / 100);

                newSalary = Math.round(newSalary * 100.0) / 100.0;

                employee.setSalary(newSalary);
            }
        }
    }
}
