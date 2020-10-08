
public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		list.add("한조");
		list.add("트레");
		list.add("메르시");
		list.add("브리기테");
		list.add("안녕");
		
		list.insert(2, "디바");
		
		for(int i = 0 ; i <list.size() ; i++) {
			System.out.println(list.get(i));
		}
	}

}

class Node<E>{
	E data;
	Node<E> next;
}


class LinkedList<E>{
	
	Node<E> first = null;
	int count = 0;
	
	//기능
	void add(E data) {
		
		count++;
		
		Node<E> creatNode = new Node<E>();
		creatNode.data = data;
		
		if(first == null) {
			first = creatNode;
			return;
		}
		
		Node<E> temp = first;
		
		while(true) {
			if(temp.next == null) {
				temp.next = creatNode;
				break;
			}
			
			temp = temp.next;
			
		}
		
		
	}
	
	E get(int i) {
		//링크드 리스트의 최대 단점 ... 접근...
		Node<E> temp = first;
		
		for(int index = 0 ; index < i ; index++) {
			temp = temp.next;
		}
						
		return temp.data;
	}
	
	void remove(int i) {
		
		count--;
		
		if(i == 0) {
			first = first.next;
			return;
		}
		
		Node<E> temp = first;
		
		for(int index = 0 ; index < i-1 ; index++) {
			temp = temp.next;
		}
		
		temp.next = temp.next.next;
		
	}
	
	void insert(int i, E data) {
		
		count++;
		
		Node<E> creatNode  = new Node<E>();
		creatNode.data = data;
		
		Node<E> temp = first;
		
		for(int index = 0 ; index < i-1 ; index++) {
			temp = temp.next;
		}
		
		creatNode.next = temp.next;
		temp.next = creatNode;
		
	}
	
	int size() {
		return count;
	}
		
}

