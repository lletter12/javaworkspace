import java.util.*;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new LinkedList<String>();
		
		list.add("안녕하세요...");
		list.add("안녕하세요...");
		list.add("안녕하세요...");
		
		new Some1().process(list);
	}

}

class Some1{
	void process(List<String> list) {
		
		//출력...
		new Some2().print(list);
		
	}
}

class Some2{
	void print(List<String> list) {
		for(String x : list) {
			System.out.println(x);
		}
	}
}