package infy_q4;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {
    private int employeeId;
    private String employeeName;
    private String employeeAddress;
    private double employeeSalary;
    private String joiningDate;

    public Employee(int employeeId, String employeeName, String employeeAddress, double employeeSalary, String joiningDate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeeSalary = employeeSalary;
        this.joiningDate = joiningDate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }
}
class Department{
    List<Employee> list = new ArrayList<>();
    void printEmployee(){


        for(Employee e : list){
            LocalDate d1 = LocalDate.parse(e.getJoiningDate(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            LocalDate c1 = LocalDate.now();
            Period p = Period.between(d1,c1);
            if(p.getYears()>=5){
                e.setEmployeeSalary(e.getEmployeeSalary()+5000);
                System.out.println("Employee has a experience of five years so salary incremented by 5000");
            }
            System.out.println("Employee ID : "+e.getEmployeeId());
            System.out.println("Employee Name : "+e.getEmployeeName());
            System.out.println("Employee Address : "+e.getEmployeeAddress());
            System.out.println("Employee Salary : "+e.getEmployeeSalary());
            System.out.println("Employee Joining date : "+e.getJoiningDate());
            System.out.println("---------------------------------------------");
        }
    }
}

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter the Number of employees you want to add:");
        int num = sc.nextInt();
        for(int i=1; i<=num; i++) {
            System.out.println("Enter Employee " + i + " ID:");
            int id = sc.nextInt();

            System.out.println("Enter Employee " + i + " name:");
            String name = sc.next();

            System.out.println("Enter Employee " + i + " Address:");
            String address = sc.next();

            System.out.println("Enter Employee " + i + " Salary:");
            double salary = sc.nextDouble();

            System.out.println("Enter Employee " + i + " joining date in dd-MM-yyyy format:");
            String date = sc.next();

            System.out.println("---------------------------------------------");
            System.out.println("Employee "+i+" Details");

            Department dp = new Department();
            dp.list.add(new Employee(id, name, address, salary, date));
            dp.printEmployee();

        }
    }
}
