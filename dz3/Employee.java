package dz3;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee() {

    }


    public double getSalary() {
        return salary;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }


    public int compareDates(int year1, int month1, int day1, int year2, int month2, int day2) {
        // Преобразуем даты в число, представляющее количество дней
        // Чем больше число, тем "более поздняя" дата
        int date1 = year1 * 10000 + month1 * 100 + day1;
        int date2 = year2 * 10000 + month2 * 100 + day2;

        return Integer.compare(date1, date2);
    }
}
