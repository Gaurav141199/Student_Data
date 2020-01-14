
public class iterator<T> implements java.util.Iterator<T> {
	Pos<T> cursor ;
	public iterator(Pos<T> h) {
		cursor = h;
	}
	public boolean hasNext() {
		if (cursor!= null)
		return true;
		else 
			return false;
	}

	public T next() {
		
			T data = cursor.value();
			cursor = cursor.next;
			return data;
		 
			//return cursor.val;
	}

}
