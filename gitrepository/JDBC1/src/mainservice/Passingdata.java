package mainservice;
import java.sql.PreparedStatement;

import DBUtil1.DBUtil;
import dmk.Employee;
public class Passingdata {
public static int enterdata(Employee bcobj) {
int i=0;
try {
PreparedStatement pst=DBUtil.getDBConnection().prepareStatement("insert into dmkdetails values(?,?,?,?,?)");
pst.setInt(1,bcobj.getEmployeeID());
pst.setString(2, bcobj.getFirstName());
pst.setString(3, bcobj.getLastName());
pst.setString(4, bcobj.getEmail());
pst.setString(5, bcobj.getPhoneNumber());
i=pst.executeUpdate();
}
catch(Exception e) {
e.printStackTrace();
System.out.println("Exception is Passing Data");
}
if(i==1) {
return 1;
}
else return 0;
}


}

