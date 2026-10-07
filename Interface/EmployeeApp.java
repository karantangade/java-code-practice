abstract class Employee {

    String name;

    Employee(String name) {
        this.name = name;
    }

    // Abstract Method
    abstract double calculateSalary();

    // Normal Method
    void display() {
        System.out.println("Employee Name : " + name);
        System.out.println("Salary : " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {

    double monthlySalary;

    FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {

    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class EmployeeApp {

    public static void main(String[] args) {

        FullTimeEmployee emp1 = new FullTimeEmployee("Chief", 50000);

        PartTimeEmployee emp2 = new PartTimeEmployee("Rahul", 300, 80);

        emp1.display();

        System.out.println();

        emp2.display();
    }
}