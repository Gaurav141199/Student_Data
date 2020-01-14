

public class hostel implements Entity_{
	String hos ;
	LinkedL<Stu> list = new LinkedL<Stu>();
	public hostel(String hos) {
		this.hos = hos;
	}
	
	public String name() {
		return hos;
	}

	public iterator<Stu> studentList() {	
		iterator<Stu> itr = new iterator<Stu>(list.head);
		return itr;
	}
	
}
