package insertdao;
import java.util.Scanner;

import dmk.Employee;
import mainservice.Passingdata;

public class Entry {
public static void main(String args[])

{
Scanner scan = new Scanner(System.in);
System.out.println("ID :");

    Employee bcobj = new Employee();

bcobj.setEmployeeID(scan.nextInt());
System.out.println("Fname :");
bcobj.setFirstName(scan.next());
System.out.println("Lname :");
bcobj.setLastName(scan.next());
System.out.println("Email :");
bcobj.setEmail(scan.next());
System.out.println("Phone :");
bcobj.setPhoneNumber(scan.next());

int ans = Passingdata.enterdata(bcobj);

System.out.println(ans);



}
}
