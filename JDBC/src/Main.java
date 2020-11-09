import java.util.*;
import java.sql.*;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("회원가입");
		System.out.print("이름> ");
		String name = scn.nextLine();
		
		System.out.print("주소> ");
		String address = scn.nextLine();
		
		System.out.print("전화번호> ");
		String phoneNumber = scn.nextLine();
		
		//INSERT INTO Customer VALUES(6, '트레이서', '서울', '010-');
		String query = "INSERT INTO customer VALUES(6, '"+name+"', '"+address+"', '"+phoneNumber+"')";
		System.out.println("실행될 쿼리: " +query);
		
		//DB연동
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";		
		Connection conn = DriverManager.getConnection(url,"scott","tiger");
		
		Statement stm = conn.createStatement();
		stm.executeUpdate(query);
		
		stm.close();
		
		System.out.println("종료");
		
	}

}
