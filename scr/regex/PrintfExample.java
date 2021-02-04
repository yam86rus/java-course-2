package regex;

public class PrintfExample {
    static void employeeInfo(Employee emp) {
        System.out.printf("%03d \t %-12s \t %-12S \t %,.1f \n", emp.id, emp.name, emp.surname, emp.salary * (1 + emp.bonusPct));
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Zaur", "Tregulov", 3100, 0.15);
        Employee emp2 = new Employee(2, "Maksim", "Yakushev", 3200, 0.15);
        Employee emp3 = new Employee(3, "Segey", "Ivanov", 3300, 0.15);
        employeeInfo(emp1);
        employeeInfo(emp2);
        employeeInfo(emp3);

    }
}

class Employee {
    int id;
    String name;
    String surname;
    int salary;
    double bonusPct;

    public Employee(int id, String name, String surname, int salary, double bonusPct) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.bonusPct = bonusPct;
    }
}
