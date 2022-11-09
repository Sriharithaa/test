package jdbc;
import java.util.Scanner;
import java.sql.*;
class DBInsert {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("enter the userid:");
			String userid=sc.nextLine();
			
			System.out.println("enter the name:");
			String name=sc.nextLine();
			
			System.out.println("enter the product:");
			String product=sc.nextLine();
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conne=DriverManager.getConnection("jdbc:mysql://localhost:3306/ticketbookingsystem","root","170998@Sriss");
			PreparedStatement ps=conne.prepareStatement("insert into user(user_ID,name,product)Values(?,?,?)");
			ps.setString(1,userid);
			ps.setString(2,name);
			ps.setString(3,product);
			int i=ps.executeUpdate();
			System.out.println("1 row affected");
			if(i!=0) {
				System.out.println("added");
			}
			else {
				System.out.println("failed");
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
