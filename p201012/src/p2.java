import java.io.*;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//파일 입출력...
		int a = 43981; //0xABCD
		
		System.out.println(a);
		
		File file = new File("c:\\temp\\aaa.dat");
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		DataOutputStream dos = null;
		
		try {
			
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			dos = new DataOutputStream(bos);
			
			dos.writeInt(10);
			dos.writeInt(20);
			dos.writeInt(30);
			dos.writeInt(40);
			dos.writeUTF("안녕하세요");
			dos.writeInt(50);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			if(dos != null) {
				try {
					dos.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
						
		}
		
	}

}
