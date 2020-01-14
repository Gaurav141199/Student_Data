
public class Coursegrade implements CourseGrade_ {
	String  Coursenumber , coursetitle,entry ;
	GradeInfo_.LetterGrade grade;
	public Coursegrade(String entry, String Coursenumber ,GradeInfo_.LetterGrade grade,String coursetitle ) {
		this.entry = entry;
		this.Coursenumber = Coursenumber;
		this.grade = grade;
		this.coursetitle = coursetitle;
	}

	
	public String coursetitle() {
		
		return coursetitle;
	}
	
	public String coursenum() {
		return Coursenumber;
	}
	public String entry() {
		return entry;
	}
		public GradeInfo_.LetterGrade grade() {
		return grade;
	}
}
