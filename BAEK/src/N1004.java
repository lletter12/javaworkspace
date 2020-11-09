import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class N1004 {
	static int start[] = new int[2], end[] = new int[2], obstacle;
	public static void main(String args[]) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder res = new StringBuilder();
		
		int i, x, y, r, n, t = Integer.parseInt(in.readLine());
		boolean checkA, checkB;
		String line[];
		Circle circle[];
		
		while(t-->0){
			line = in.readLine().split(" ");
			start[0] = Integer.parseInt(line[0]); //출발점 x
			start[1] = Integer.parseInt(line[1]); //출발점 y
			end[0] = Integer.parseInt(line[2]); //도착점 x
			end[1] = Integer.parseInt(line[3]); //도착점 y
			obstacle = 0; //지나야 되는 행성계
			
			n = Integer.parseInt(in.readLine());
			circle = new Circle[n];
			
			for(i=0;i<n;i++){
				line = in.readLine().split(" ");
				x = Integer.parseInt(line[0]); //원의 중점 x
				y = Integer.parseInt(line[1]); //원의 중점 y
				r = Integer.parseInt(line[2]); //원의 반지름
				circle[i] = new Circle(x, y, r);
				
				checkA = isInside(start[0], start[1], circle[i]);
				checkB = isInside(end[0], end[1], circle[i]);
				
				/* 점 A만 원 내부에 있거나, 점 B만 원 내부에 있는 경우 */
				if((checkA&&(!checkB)) || (!checkA&&checkB)) obstacle++;
			}
			res.append(obstacle+"\n");
		}
		out.write(res.toString());
		out.close();
		in.close();
	}
	
	/* 점 (a, b)가 원 c 내부에 있는가? */
	private static boolean isInside(int a, int b, Circle c){
		return getEucDist(a, b, c.x, c.y) < c.r;
	}
	
	/* (a, b)와 (x, y) 사이의 유클리디언 거리 */
	private static double getEucDist(int a, int b, int x, int y){
		double dist = Math.pow((double)x-(double)a, 2) + Math.pow((double)y-(double)b, 2);
		return Math.sqrt(dist);
	}
}

class Circle{
	int x, y, r;
	public Circle(int x, int y, int r){
		this.x = x;
		this.y = y;
		this.r = r;
	}
}