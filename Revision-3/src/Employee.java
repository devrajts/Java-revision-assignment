import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Employee {
    private String name;
    private String employeeId;
    private Double salary;
    private String joiningDate;

    public Employee() {

    }

    public Employee(String name, String employeeId, Double salary, String joiningDate) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
        this.joiningDate = joiningDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }
}
class Main{
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        Employee e1 = new Employee("Dev","100",20000.0, "2016-01-01");
        Employee e2 = new Employee("Raj","101",30000.0, "2016-01-03");
        Employee e3 = new Employee("Kumar","102",25000.0, "2019-01-07");
        Employee e4 = new Employee("Manu","103",23000.0, "2020-01-04");
        Employee e5 = new Employee("Druv","104",32000.0, "2021-01-01");

        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);

        list.sort(new sortItem());

        List<Employee> sortedlist = list
                .stream().toList();

        for(Employee l1 : sortedlist){
            System.out.println("Employee name : "+l1.getName());
            System.out.println("Employee id : "+l1.getEmployeeId());
            System.out.println("Employee salary : "+l1.getSalary());
            System.out.println("Employee Joining date : "+l1.getJoiningDate());
            System.out.println("-----------------------------------------------");
        }
    }

    static class sortItem implements Comparator<Employee> {
        public int compare(Employee e1, Employee e2){
            return e1.getJoiningDate().compareTo(e2.getJoiningDate());
        }
    }
}
