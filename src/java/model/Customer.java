package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
public class Customer 
{
public Connection getconnection() throws Exception{
		
Class.forName("com.mysql.jdbc.Driver");
Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Pharmacy_detail", "root", "root");
return con;
}
	
public int Addcustomer(String name,String address,String phone,String latitude,String lotitude) throws Exception{
Connection con = getconnection();
PreparedStatement ps= con.prepareStatement("insert into pharmacy(name,address,phone,latitude,longitude) values(?,?,?,?,?)");
ps.setString(1, name);
ps.setString(2, address);
ps.setString(3, phone);
ps.setString(4, latitude);
ps.setString(5, lotitude);
int i=ps.executeUpdate();
con.close();
return i;
}

public ArrayList<String> getPharmacy(String latitude,String longitude) throws Exception {
		
ArrayList<String> result= new ArrayList<>();
Connection con = getconnection();
PreparedStatement ps= con.prepareStatement("select * from pharmacy where latitude =? and longitude = ?");
ps.setString(1, latitude);
ps.setString(2, longitude);
ResultSet rs = ps.executeQuery();
while(rs.next()){
String name ="name:"+rs.getString("name")+"Phone:"+rs.getString("phone")+"Address:"+rs.getString("address");
result.add(name);
}		
con.close();
return result;
}
}
