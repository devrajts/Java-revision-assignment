import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Person {
    String name;
    String dateOfBirth;

    public Person(){
    }

    public Person(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }
    public void PersonDetails(String name, String dateOfBirth) throws InvalidAgeException {
        LocalDate d1 = LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        LocalDate c1 = LocalDate.now();
        Period p = Period.between(d1,c1);
        if(d1.isBefore(c1)){
            if(p.getYears()>=18 && p.getYears()<60){
                System.out.println("Age of a person is between 18 and 60");
            }else if(p.getYears()<18){
                System.out.println("Age is less than 18");
            }else{
                InvalidAgeException ae = new InvalidAgeException("Please enter a date in a valid format");
                throw ae;
            }
        }else{
            System.out.println("Date should not be in the future");
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter name of the person.");
        String name = sc.nextLine();
        p1.name=name;

        System.out.println("Please enter Date of birth of a person in dd-MM-yyyy format.");
        String dateOfBirth = sc.nextLine();
        p1.dateOfBirth=dateOfBirth;

        try{
            p1.PersonDetails(name, dateOfBirth );
        }catch(Exception e){
            System.out.println("Please enter a date in a valid format");
        }
    }
}

class InvalidAgeException extends Exception{
    InvalidAgeException(String error){
        super(error);
    }
}
