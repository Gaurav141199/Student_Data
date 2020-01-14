
public class Pos<T> implements Position_<T> {

	public T val;
	public Pos<T> next;
	Pos(T v){
		val = v;
		next=null;
	}
	public T value() {
		return val;
	}


	public Position_<T> after() {
		return next;
	}
 
}
