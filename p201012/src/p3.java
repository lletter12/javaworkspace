import java.io.*;
public class p3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\temp\\aaa.dat");
		
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		
		int a1 = dis.readInt();
		System.out.println(a1);
		int a2 = dis.readInt();
		System.out.println(a2);
		int a3 = dis.readInt();
		System.out.println(a3);
		int a4 = dis.readInt();
		System.out.println(a4);
		
		String value = dis.readUTF();
		System.out.println(value);
		int a5 = dis.readInt();
		System.out.println(a5);
		
		dis.close();
		
		
	}

}
