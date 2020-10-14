import java.util.*;

import java.io.*;
import java.net.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("채팅서버 가동시작...");
		
		try {
			ServerSocket serverSocket = new ServerSocket(7777);
			
			while(true) {
				Socket socket = serverSocket.accept();
				
				DataInputStream dis = new DataInputStream(socket.getInputStream());
				
				String nickName = dis.readUTF();
				
				UserVo user = new UserVo();
				user.nickName =  nickName;
				user.socket = socket;
				
				UserModel.List.add(user);
				
				BroadCast.cast(nickName + "님이 입장하였습니다.");
				
				ReceiveThread rt = new ReceiveThread();
				rt.user = user;
				
				rt.start();
				
			}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}

class UserModel{
	static ArrayList<UserVo> List = new ArrayList<UserVo>();
}

class BroadCast{
	static void cast(String message) {
		
		for(UserVo user : UserModel.List) {
			try {
				DataOutputStream dos = new DataOutputStream(user.socket.getOutputStream());
				dos.writeUTF(message);
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}
}

class ReceiveThread extends Thread{
	
	UserVo user;
	
	public void run() {
		
		try {
		DataInputStream dis = new DataInputStream(user.socket.getInputStream());
		
		while(true) {
			String message = dis.readUTF();
			
			BroadCast.cast(user.nickName + ":" + message);
		}
		
		
		}catch(Exception e) {
			UserModel.List.remove(user);
			BroadCast.cast(user.nickName + "님이 퇴장하셨습니다.");
		}finally {
			try {
				user.socket.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}


class UserVo{
	
	String nickName;
	Socket socket;
	
}