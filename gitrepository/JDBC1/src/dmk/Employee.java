package dmk;

public class Employee {
private int employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    public int getEmployeeID() {
  return employeeId;
 }
public void setEmployeeID(int employeeId) {
  this.employeeId= employeeId;
 }
  public String getFirstName() {
  return firstName;
 }
  public void setFirstName(String firstName) {
  this.firstName = firstName;
 }
  public String getLastName() {
  return lastName;
 }
  public void setLastName(String lastName) {
  this.lastName = lastName;

 }
public String getEmail() {
  return email;
 }
  public void setEmail(String email) {
  this.email = email;

 }

  public void setPhoneNumber(String phoneNumber) {
  this.phoneNumber = phoneNumber;

 }
public String getPhoneNumber() {
  return phoneNumber;
 }

}