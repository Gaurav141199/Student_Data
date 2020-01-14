

public class LinkedL<T> implements LinkedList_<T> {
	int count =0;
	Pos<T> head,tail;
	public Position_<T> add(T e) {
		Pos<T> apple = new Pos<T>(e);
		if (head==null) {
			head = apple;
			tail = apple;
			count++;
		}
		else {
			while(tail.next != null) {
				tail = tail.next;
			}
			
			tail.next = apple;
			count++;
		} 
		return apple;
	}
	public iterator<T> positions() {
		iterator<T> obj = new iterator<T>(head);
		return obj;
	}

	
	public int count() {
		return count;
	}
	
	
}
