public class Student {
    private int roll;
    private String name;
    private int marks;

    public Student(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public Student() {

    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

}

class Employee{
    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

class Main{
    public static void main(String[] args) {
        Student s1 = new Student(23,"Rakesh",450);
        Employee e1 = new Employee(12,"Lokesh",84000);
        Object[] arr = new Object[4];
        arr[0] = s1;
        arr[1] = e1;
        arr[2] = "String";
        arr[3] = 50;

        for(int i=0; i< arr.length;i++){
            if(i==0){
                System.out.println("Student [roll="+s1.getRoll()+", name="+s1.getName()+", marks="+(s1.getMarks()+10)+"]");
            }else if(i==1){
                System.out.println("Employee [employeeId="+e1.getId()+", name="+e1.getName()+", salary="+(e1.getSalary()+10000)+"]");
            }else if(i==2){
                System.out.println(arr[i]);
            }else if(i==3){
                System.out.println(arr[i]);
            }
        }

    }
}
