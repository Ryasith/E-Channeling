package com.user;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDBUtil {
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rslt = null;
	
	public static List<User> validate(String userName, String password){
		
		ArrayList<User> usr = new ArrayList<>();
		
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select *from user where username ='"+userName+"' and password = '"+password+ "'";
			rslt = stmt.executeQuery(sql);
			
			if(rslt.next()) {
				int id = rslt.getInt(1);
				String name = rslt.getString(2);
				String email = rslt.getString(3);
				String phone = rslt.getString(4);
				String gender = rslt.getString(5);
				String userU = rslt.getString(6);
				String passU = rslt.getString(7);
				String age = rslt.getString(8);
				
				User u = new User(id,name,email,phone,gender,userU,passU,age);
				usr.add(u);
				
			}
			
		}
		catch(Exception e){
			e.printStackTrace();	
			
		}
		
		return usr;
		
	}
	
	/*Insert part 
	 * 
	 * */
	public static boolean register(String name, String email, String phone, String gender, String username, String password, String age) {
		
		boolean isSuccess = false;
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "INSERT INTO user VALUES (0,'"+name+"', '"+email+"', '"+phone+"', '"+gender+"', '"+username+"', '"+password+"', '"+age+"' )";
			int rs = stmt.executeUpdate(sql);
			
			if(rs >0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;

}
}
