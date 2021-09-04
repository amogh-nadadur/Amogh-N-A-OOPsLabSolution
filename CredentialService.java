package LAB1OOPSproject;

import java.util.*;

public class CredentialService{
    String firstname;
    String lastname;
    String deptname; 
    String emailID;
    String password;
    char num2;
    int num;
    String company = "greatlearning";
    Scanner sc = new Scanner(System. in);

    public void Department(){
        System.out.println("Choose one amongst-->");
        System.out.println("1. HR");
        System.out.println("2. Legal");
        System.out.println("3. Admin");
        System.out.println("4. Technical");
        deptname = sc.nextLine();        
    }


    public  void emailValues(){
        System.out.println("Enter your first name");

        firstname = sc.nextLine();
        System.out.println("Enter your last name");
        lastname = sc.nextLine();
    }
    public void generateEmailAddress(){
        emailID = firstname + "." + lastname + "." + deptname + "@" + company + ".com";
    }

    public void generatePassword(){
        for(int i=0; i<firstname.length(); i++)
        {
        num = num + firstname.charAt(i);
        }
        password = firstname + lastname.toUpperCase() + num ;
    }
    public void showCredentials(){
        System.out.println("Dear" + " " + firstname + " " + lastname + ", " + "your generated credentials are as follows:");
        System.out.println("email ID--> " + emailID);
        System.out.println("password--> " + password);
    }

    public static void main(String[] args){
        CredentialService  obj = new CredentialService ();

        obj.Department();
        obj.emailValues();
        obj.generateEmailAddress();
        obj.generatePassword();
        obj.showCredentials();
    }
}