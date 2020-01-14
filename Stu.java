

public class Stu implements Student_{ 
	private String name , department , entryNo , hostel ;
	String completedCredits;
	String cgpa;
	public LinkedL<Coursegrade> courlist = new LinkedL<Coursegrade>();
	
	public Stu(String name,String entryNo, String hostel, String department) {  
		this.name = name;
		this.entryNo = entryNo;
		this.hostel = hostel;
		this.department = department;
		
	}
	public String name() {
		
		return name;
	}

	public String entryNo() {
		// TODO Auto-generated method stub
		return entryNo;
	}

	public String hostel() {
		// TODO Aut-generated method stub
		return hostel;
	}

	public String department() {
		// TODO Auto-generated method stub
		return department;
	}

	public String completedCredits() {
		
		return completedCredits;
	}

	public String cgpa() {
		return cgpa;
	}
	
	public iterator<Coursegrade> courseList(){
		return courlist.positions();
	}



}
