import java.util.*;
import java.io.*;
import java.net.*;

public class ClientMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.println("클라이언트 시작...");
		
		System.out.print("닉네임을 입력해 주세요 > ");
		String nickName = scn.nextLine();
		
		System.out.println("접속중...");
		
		Socket socket = null;
		
		try {
			socket = new Socket("172.30.1.31" , 7777);
			
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			
			dos.writeUTF(nickName);
			
			System.out.println("대화방에 입장하였습니다.");
			System.out.println("메시지를 입력하고 enter를 누르세요.");
			System.out.println("종료시 q를 입력하고 enter를 누르시면 됩니다.");
			
			ClientReceiveThread crt = new ClientReceiveThread();
			crt.socket = socket;
			crt.start();
			
			while(true) {
				String message =scn.nextLine();
				
				if(message.equals("q")) {
					break;
				}
				
				dos.writeUTF(message);
			}
						
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(socket != null) {
				try {
					socket.close();
				}catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			
		}
		
	}

}

class ClientReceiveThread extends Thread{
	
	Socket socket;
	
	public void run() {
		
		try {
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			
			while(true) {
				String message = dis.readUTF();
				
				System.out.println(message);
			}
			
		}catch (Exception e) {
			// ...
		}
	}
	
}

