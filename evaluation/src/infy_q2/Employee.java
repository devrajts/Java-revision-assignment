package infy_q2;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private int employeeId;
    private String employeeName;
    private String employeeAddress;
    private int employeeSalary;


    public Employee(int employeeId, String employeeName, String employeeAddress, int employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeeSalary = employeeSalary;
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

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
}
class Main{
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee(100,"Dev","Bangalore",45000));
        list.add(new Employee(103,"Raj","Davanagere",57000));
        list.add(new Employee(107,"Kumar","Delhi",33000));
        list.add(new Employee(102,"Gagan","Mumbai",80000));
        list.add((new Employee(104,"Adi","Kochi",50000)));

        list.sort((e1, e2) -> e1.getEmployeeSalary() > e2.getEmployeeSalary() ? +1 : -1);


        for(Employee e : list){
            System.out.println("Employee ID : "+e.getEmployeeId());
            System.out.println("Employee Name : "+e.getEmployeeName());
            System.out.println("Employee Address : "+e.getEmployeeAddress());
            System.out.println("Employee Salary : "+e.getEmployeeSalary());
            System.out.println("----------------------------------------------");
        }
    }
}
