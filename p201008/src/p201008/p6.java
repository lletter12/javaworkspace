package p201008;

import java.util.*;
public class p6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		ArrayList<Student> list1 = new ArrayList<Student>();
		//array에서는 값의 중복이아니라 다른 참조변수생성
		list1.add(new Student("한조1", 77));
		list1.add(new Student("한조1", 77));
		list1.add(new Student("한조1", 77));
		list1.add(new Student("한조1", 77));
		//...
		
		ArrayList<Student> list2 = new ArrayList<Student>();
		//array에서는 값의 중복이아니라 다른 참조변수생성
		list2.add(new Student("한조1", 77));
		list2.add(new Student("한조1", 77));
		list2.add(new Student("한조1", 77));
		list2.add(new Student("한조1", 77));
		//...
		
		HashMap<String, ArrayList<Student>> map = new HashMap<String, ArrayList<Student>>();
		
		map.put("A", list1);
		map.put("B", list2);
		
		for(Student xx : map.get("A")) {
			System.out.println(xx.name);
		}
		
		
	}

}

class Student{
	String name;
	int score;
	
	Student(String name, int score){
		this.name = name;
		this.score = score;
	}
}
