import java.io.*;
public class p4 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//비트맵 파일 만들기...
		
		File file = new File("C:\\temp\\mybmp.bmp");
		
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		
		dos.writeByte('B');
		dos.writeByte('M');
		
		//dos.writInt(400*300*3 + 54);
		int bitmapSize = 400*300*3 + 54;
		dos.writeByte(bitmapSize);
		dos.writeByte(bitmapSize >> 8);
		dos.writeByte(bitmapSize >> 16);
		dos.writeByte(bitmapSize >> 24);
		
		dos.writeShort(0);
		dos.writeShort(0);
		
		int dataOffset = 54;
		dos.writeByte(dataOffset);
		dos.writeByte(dataOffset >> 8);
		dos.writeByte(dataOffset >> 16);
		dos.writeByte(dataOffset >> 24);
		
		dos.writeByte(40);
		dos.writeByte(40 >> 8);
		dos.writeByte(40 >> 16);
		dos.writeByte(40 >> 24);
		
		dos.writeByte(400);
		dos.writeByte(400 >> 8);
		dos.writeByte(400 >> 16);
		dos.writeByte(400 >> 24);
		
		dos.writeByte(300);
		dos.writeByte(300 >> 8);
		dos.writeByte(300 >> 16);
		dos.writeByte(300 >> 24);
		
		dos.writeByte(1);
		dos.writeByte(1 >> 8);
		
		dos.writeByte(24);
		dos.writeByte(24 >> 8);
		
		dos.writeInt(0);
		
		int dataSize = 400*300*3;
		dos.writeByte(dataSize);
		dos.writeByte(dataSize >> 8);
		dos.writeByte(dataSize >> 16);
		dos.writeByte(dataSize >> 24);
		
		dos.writeInt(0);
		dos.writeInt(0);
		
		dos.writeInt(0);
		
		dos.writeInt(0);

		
		for(int y = 0 ; y < 300 ; y++) {
			for(int x = 0 ; x < 400 ; x++) {
				
					dos.writeByte(x);
					dos.writeByte(y);
					dos.writeByte(y);
				
			}
		}
		
		dos.close();
		
	}

}
