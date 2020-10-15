package commons;

import java.io.*;

import Vo.StudentVo;

public class FileSave {

	public static void saveFile(){
		
		try {
			File file = new File("./stm.dat");
			FileOutputStream fos = new FileOutputStream(file);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			DataOutputStream dos = new DataOutputStream(bos);
			
			dos.writeInt(CommansData.StudentList.size());
			
			for(StudentVo vo : CommansData.StudentList) {
				dos.writeUTF(vo.getName());
				dos.writeUTF(vo.getSex());
				dos.writeUTF(vo.getArea());
				dos.writeInt(vo.getScore());
			}
			
			dos.close();
						
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void loadFile() {
		
		try {
			File file = new File("./stm.dat");
			
			if(!file.exists()) {
				return;
			}
			
			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis);
			DataInputStream dis = new DataInputStream(bis);
			
			int size = dis.readInt();
			
			for(int i = 0 ; i < size ; i++) { 
				
				String name = dis.readUTF();
				String sex = dis.readUTF();
				String area = dis.readUTF();
				int score = dis.readInt();
				
				StudentVo vo = new StudentVo(name, sex, area, score);
				
				CommansData.StudentList.add(vo);
				
			}
			
			dis.close();
									
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
}
