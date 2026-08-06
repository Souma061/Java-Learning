/*
    Write a Java program that creates a class hierarchy for employees of a company. The base class should
be Employee, with subclasses Manager, Developer, and Programmer. Each subclass should have
properties such as name, address, salary, no_of_projects and job title. Implement methods for calculating
bonuses, generating performance reports, and managing projects.
 */

class Employee {
    protected String name;
    protected String addess;
    protected double salary;
    protected int project_number;
    protected String job_title;

    Employee(String name, String address, double salary, int project_number, String job_title) {
        this.name = name;
        this.addess = address;
        this.salary = salary;
        this.project_number = project_number;
        this.job_title = job_title;

    }

    double calculateBonus() {
        return salary * 0.10;
    }

    void performanceReports() {
        System.out.println("Project: " + project_number);
    }

    void managingProjects() {
        System.out.println(name + "Managing project: " + project_number);
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + addess);
        System.out.println("Job Title: " + job_title);
        System.out.println("Salary: " + salary);
    }
}

class Developer extends Employee {
    Developer(String name, String address, double salary, int project_number, String job_title) {
        super(name, address, salary, project_number, job_title);
    }
    @Override
    double calculateBonus() {
        return salary * 0.20;
    }
    @Override
    void managingProjects() {
        System.out.println("Developer Handled " + project_number + "projects");
    }
    @Override
    void performanceReports() {
        System.out.println("Good performaance.");
    }
}

public class twentyOne {
    public static void main(String[] args) {
        Employee e1 = new Developer("Soumabrata", "Howrah", 1000000, 10, "Backend Developer");
        e1.display();
        System.out.println("Bonus: " + e1.calculateBonus());
        e1.performanceReports();
        e1.managingProjects();
    }
}
