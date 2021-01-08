import java.util.*;
public class checkpassword{
public static void main(String[]args){

//String badcharacters = '!@#$%^&*()_-+={}[]|\:;<,>.?/';

Scanner input = new Scanner(System.in);

System.out.println("Please enter a new password as follows:");
System.out.println("\t" + "A password mnust have at least eight characters");
System.out.println("\t" + "A password consists of only letters and digits");
System.out.println("\t" + "A password must contain at least two digits");
String password = input.nextLine();

int length = password.length();


if(length < 8)
{System.out.println("NaN - not enough characters in your password");


}
}}