

public class department implements Entity_{
	String dep ;
	public LinkedL<Stu> list = new LinkedL<Stu>();
	public department(String dep) {
		this.dep = dep;
	}
	
	public String name() {
		return dep;
	}

	public iterator<Stu> studentList() {
		iterator<Stu> itr = new iterator<Stu>(list.head);
		return itr;
	}
	
}
