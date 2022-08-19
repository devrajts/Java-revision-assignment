import java.util.Scanner;
import java.util.regex.Pattern;

public class Customer {
    private String userName;
    private String password;
    private String mobileNumber;
    private String email;

    public Customer() {
    }

    public Customer(String userName, String password, String mobileNumber, String email) {
        this.userName = userName;
        this.password = password;
        this.mobileNumber = mobileNumber;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

class Demo{

    public void validate(String userName, String password, String mobileNumber, String email){

        System.out.println("User Name : "+userName);
        System.out.println("Password : "+password);
        System.out.println("Mobile Number : "+mobileNumber);
        System.out.println("Email : "+email);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Customer cr = new Customer();

        System.out.println("Enter User Name :");
        String name = sc.nextLine();
        cr.setUserName(name);

        System.out.println("Enter password :");
        String pass = sc.nextLine();
        cr.setPassword(pass);

        System.out.println("Enter Mobile Number :");
        String mobNum = sc.nextLine();
        cr.setMobileNumber(mobNum);

        System.out.println("Enter Email :");
        String email = sc.nextLine();
        cr.setEmail(email);
        System.out.println("--------------------------------------------------------");

        boolean x = Pattern.matches("[a-zA-Z]{3,8}",cr.getUserName());
        boolean y = Pattern.matches("[a-zA-Z0-9]{3,8}",cr.getPassword());
        boolean mobile = Pattern.matches("[6789]{1}[0-9]{9}",cr.getMobileNumber());

        if(x == true){
            if(y == true){
                if(mobile == true){
                    Demo dm = new Demo();
                    dm.validate(cr.getUserName(), cr.getPassword(),cr.getMobileNumber(), cr.getEmail());

                }else{
                    System.out.println("Enter valid mobile number");
                }
            }else{
                System.out.println("Enter valid password");
            }
        }else{
            System.out.println("Enter valid User Name");
        }


    }
}
