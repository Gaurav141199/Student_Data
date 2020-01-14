
public class course implements Entity_{
	String name , coursenum ;
	LinkedL<Stu> list2;
	LinkedL<Coursegrade> list= new LinkedL<Coursegrade>();
	public course(String name) {
		this.name = name;
	}
	
	public String name() {
		return name;
	}
	public void addStudent(Stu s) {
		list2.add(s);
	}

	public iterator<Stu> studentList() {
		return list2.positions();
	}
}
