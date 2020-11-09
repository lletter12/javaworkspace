import java.io.*;
import java.nio.file.*;
import java.sql.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
				//연령 숫자 - 정제...
				//마체중 - 정제...
				//장비... 정제... 합치기...
				
				BufferedReader br = Files.newBufferedReader(Paths.get("C:\\data\\test.csv"));
				
				String line = "";
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
				Connection conn = DriverManager.getConnection(url,"scott","tiger");
				Statement stm = conn.createStatement();
				
				
				int exceptionCount = 0;
				
				System.out.println("진행중...");
				
				while((line = br.readLine()) != null){
		            //CSV 1행을 저장하는 리스트
		            List<String> tmpList = new ArrayList<String>();
		            //String array[] = line.split(",",19);
		            String array[] = line.split(",",-1);
		            //배열에서 리스트 반환
		            //System.out.println(array[16]);
		            //System.out.println(array.length);
		            
		            
		            if(array.length > 19) {
		            	array[17] = array[array.length - 2];
		            	array[18] = array[array.length - 1];
		            }
		            
		            //System.out.println(array[13]);
		            
		            //16 .. 장비
		            //17 .. 날짜..
		            //18 .. 경기 번호...
		            
		            
		            String query = String.format("INSERT INTO Matchresult VALUES(%s,%s,'%s','%s','%s',%s,%s,'%s','%s','%s','%s','%s',%s,%s,%s,'%s','%s',%s)",
		            		array[1],
		            		array[2],
		            		array[3],
		            		array[4],
		            		array[5],
		            		array[6].charAt(0),
		            		array[7],
		            		array[8],
		            		array[9],
		            		array[10],
		            		array[11],
		            		array[12],
		            		array[13].substring(0, 3),
		            		array[14],
		            		array[15],
		            		array[16],
		            		array[17],
		            		array[18]
		            		);
		            
		            //System.out.println(query);
		            
		    		//DB연동...
		            try {
		            	stm.executeUpdate(query);
		            }catch(Exception e) {
		        		exceptionCount++;
		        		//System.out.println(exceptionCount);
		            }
		        }
				
				stm.close();
				conn.close();

				
				System.out.println("예외 개수 : " + exceptionCount);
				System.out.println("종료....");

	}

}
