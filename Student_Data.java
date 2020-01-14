import java.io.*;
public class Student_Data {

	public static LinkedL<String> answers = new LinkedL<String>();
	public static LinkedL<Stu> allStudents = new LinkedL<Stu>();
	public static LinkedL<hostel> allHostels = new LinkedL<hostel>();
	public static LinkedL<department> allDepartments = new LinkedL<department>();
	public static LinkedL<course> allCourses = new LinkedL<course>();
	public static LinkedL<Coursegrade> courseDetails = new LinkedL<Coursegrade>();
	public static void   sort(String [] arr)
	  {
	     //String [] arr2;
	     int n = arr.length; 
	     for(int i = 0; i < n-1; i++) {
	              for (int j = i + 1; j < n; j++) {
	                  if (arr[i].compareTo(arr[j]) > 0) {
	                    
	                      String temp = arr[i];
	                      arr[i] = arr[j];
	                      arr[j] = temp;
	                  }
	              }
	          } 
	  }
	
	
	
	public static void getData(string f1, string f2) throws IOException{

				
				BufferedReader br1 = new BufferedReader(new FileReader(f1)); 
				int e=0;
				String line, line1;
				// reading file1 and completing student input
				while((line=br1.readLine())!= null) 
				{
					e++;
					BufferedReader br2 = new BufferedReader(new FileReader(f2)); 

					String [] arr = line.split(" ");
					Stu student = new Stu(arr[1], arr[0],arr[3],arr[2]);
					allStudents.add(student);
					while((line1=br2.readLine())!= null) 
					{
						String [] arr1 = line1.split(" ",4);
						GradeInfo_.LetterGrade lg = GradeInfo_.LetterGrade.valueOf(arr1[2]);
						Coursegrade obj = new Coursegrade(arr1[0],arr1[1],lg,arr1[3]);
						if(e==1) {
						courseDetails.add(obj);}
						if(arr1[0].equals(student.entryNo())) 
						{
							
							
							student.courlist.add(obj);
						}				
					}

					br2.close();
				}
				
				br1.close();
	
				
				iterator<Stu> itr2  = allStudents.positions();
				while (itr2.hasNext()) 
				{	
					Stu student = itr2.next();
					//System.out.println(student.name());
					iterator<Coursegrade> itr1 = student.courseList();
					float gra=0;
					float credits = 0;
					while(itr1.hasNext()) 
					{	GradeInfo_.LetterGrade  givenGrade = (itr1.next().grade());
						if(givenGrade != GradeInfo_.LetterGrade.I) 
						{
						gra += 3*(GradeInfo_.gradepoint(givenGrade));

						credits +=3;
						}
					}
					float cg = gra/credits;
					String Calcg = String.format("%.2f",cg);
					student.cgpa=Calcg;
					student.completedCredits = Float.toString(credits);

				}
				 
			    iterator<Stu> itr=allStudents.positions();
			    while(itr.hasNext()) {
			   	
			   	Stu student=itr.next();
			   //	System.out.println(student.name() + " " + student.hostel());
			   	//System.out.println();
			   	if (allHostels == null) {
			   		hostel h = new hostel(student.hostel() );
			   		allHostels.add(h);
			   		h.list.add(student);
			   	}
			   	else {
			   		iterator<hostel> itr1 = new iterator<hostel>(allHostels.head);
			   		int k=0;
			   		while(itr1.hasNext()) {
			   			hostel h = itr1.next();
			   			if(h.name().equals(student.hostel())) {
			   				h.list.add(student);
			   				k++;
			   				//break;
			   			}
			   			
			   		}
			   		if(k==0) {
		   				hostel h1 = new hostel(student.hostel() );
		   				allHostels.add(h1);
				   		h1.list.add(student);
		   			}
			   	}
			   	
			   	

			   	if (allDepartments == null) {
			   		department h = new department(student.department() );
			   		allDepartments.add(h);
			   		h.list.add(student);
			   	}
			   	else {
			   		iterator<department> itr1 = new iterator<department>(allDepartments.head);
			   		int k=0;
			   		while(itr1.hasNext()) {
			   			department h = itr1.next();
			   			if(h.name().equals(student.department())) {
			   				h.list.add(student);
			   				k++;
			   				//break;
			   			}
			   			}
			   			if(k==0) {
			   				department h1 = new department(student.department() );
			   				allDepartments.add(h1);
					   		h1.list.add(student);
			   			}
			   		
			   	}
			   	
		
			    }
			   	iterator<Coursegrade> itr8 = courseDetails.positions();
				   
			   	while(itr8.hasNext())
			   	{
			   		Coursegrade obj = itr8.next();
			   		
			   	if (allCourses == null) {
			   		course h = new course(obj.coursenum());
			   		allCourses.add(h);
			   		h.list.add(obj);
			   	}
			   	else {
			   		iterator<course> itr1 = new iterator<course>(allCourses.head);
			   		int k=0;
			   		while(itr1.hasNext()) {
			   			course h = itr1.next();
			   			String son = h.name();
			   			if(son.equals(obj.coursenum())) {
			   				h.list.add(obj);
			   				k++;
			   				break;
			   			}
			   			
			   		}
			   		if(k==0) {
		   				course h1 = new course(obj.coursenum());
		   				allCourses.add(h1);
				   		h1.list.add(obj);
		   			}
			   	}
			    }
			   
				
	}

			

	

	
	
	
	public static void answerQueries(String f3) throws IOException{ 
		BufferedReader br = new BufferedReader (new FileReader(f3));
	 
		//LinkedL<String> query=new LinkedL<>();
		
			String line;
		    //iterator<String> q=query.positions();
		    while((line=br.readLine())!=null)
		    {
		    	
		    	String words[]=line.split(" ");
		   		if(words[0].equals("INFO")) 
		   		{
		   			iterator<Stu> itr=allStudents.positions();
		   			while(itr.hasNext()) 
		   			{
		   				Stu student=itr.next();
		   				if(student.entryNo().equals(words[1])) 
		   				{	String Student_Detail = student.entryNo()+" " +student.name()+" "+student.department()+" "+student.hostel()+" "+student.cgpa()+" ";
		   					iterator<Coursegrade> stucourseitr= student.courseList();
		   					int c=student.courlist.count();
		   					
		   					String[] arr=new String[c];
		   					int i=0;
		   					while(stucourseitr.hasNext()) 
		   					{
		   						Coursegrade stucourse=stucourseitr.next();
		   	   	
		   						String k=stucourse.coursenum()+" "+stucourse.grade();
		   						arr[i]=k;
		   						i++;
		   						// System.out.print(stucourse.coursenum()+" ");
		   						// System.out.print(stucourse.grade()+" ");
		   					}
		   					
		   					sort(arr);
		   					
		   					
		   					String h="";
		   					for (int j=0;j<arr.length+1;j++) 
		   					{
		   						if(j==0)
		   							h+=Student_Detail+" ";
		   						else
		   						h=h+arr[j-1]+" ";
		   					}
		   					
		   					answers.add(h);
		   				}
		   			}
		   		}
		   	    
		   	
		   	 
					   	else if(words[0].equals("COURSETITLE")) 
					   	{
					   		iterator<Coursegrade> itr1=courseDetails.positions();
					   		while(itr1.hasNext()) 
					   		{
					   			Coursegrade cou=itr1.next();
					   			if(cou.coursenum().equals(words[1])) 
					   			{
					   				answers.add(cou.coursetitle());
					   				break;
					   			}
					   		}
					   	
					   	}
		   	 
					   	 if(words[0].equals("SHARE")) 
					   	{
					   	int x=0;
					   	iterator<hostel> hostelitr = allHostels.positions();
					   	   	while(hostelitr.hasNext()) 
					   	   	{
					   	   		hostel hos=hostelitr.next();
					   	   		//System.out.print(hos.name());
					   	   		if(hos.name().equals(words[2])) 
					   	   		{
					   	   			iterator<Stu> stuitr=hos.studentList();
					   	   			int i=0;
					   	   			String arrh[]=new String[hos.list.count()-1];
					   	   			while(stuitr.hasNext()) 
					   	   			{    Stu obj =  stuitr.next();
					   	   				String stu=obj.entryNo();
					   	   				if(!stu.equals(words[1])) 
					   	   				{
					   	   					arrh[i]=stu;
					   	   					i++;
					   	   				}
					   	   			}
					   	   			sort(arrh);
					   	   			String l="";
					   	   			for (int j=0;j<arrh.length;j++) 
					   	   			{
					   	   				l = l+arrh[j]+" ";
					   	   			}
					   	   			//System.out.println(l);
					   	   			answers.add(l);
					   	   			x++;
					   	   			break;
					   	   	
					   	   		}
					   	   	}
					   	
					   	   if(x==0) 
					   	   {
					   	   		iterator<department> deptitr=allDepartments.positions();
					   	   		while(deptitr.hasNext()) {
					   	   			department dept=deptitr.next();
					   	   			if(dept.name().equals(words[2])) 
					   	   			{
					   	   				iterator<Stu> stuitr=dept.studentList();
					   	   				int i=0;
					   	   				String arrd[]=new String[dept.list.count()-1];
					   	   				while(stuitr.hasNext()) {
					   	   					Stu obj = stuitr.next();
					   	   					String stu= obj.entryNo();
					   	   					if(!stu.equals(words[1])) {
					   	   						arrd[i]=stu;
					   	   						i++;
					   	   					}
					   	   				}
					   	   				sort(arrd);
					   	   				String k="";
					   	   				for (int j=0;j<arrd.length;j++) {
					   	   					k = k +arrd[j]+" ";
					   	   				}
					   	   				answers.add(k);
					   	   				x++;
					   	   				break;
					   	   	
					   	   			}
					   	   		}
					   	   	
					   	   	}
					   	   
					   	   if(x==0) {
						   	   	iterator<course> crsitr=allCourses.positions();
						     	while(crsitr.hasNext()) {
						     		course crs=crsitr.next();
						     		if(crs.name().equals(words[2])) {
						     			LinkedL <Coursegrade> mango = crs.list;
						     			iterator<Coursegrade> stuitr=new iterator<Coursegrade>(mango.head);
						     			//int i=0;
						     			
						     			LinkedL <String> mohan = new LinkedL <String>();
						     			//String [] arrc=new String[mango.count()-1];
						     			while(stuitr.hasNext()) {
						     				Coursegrade obj =stuitr.next(); 
						     				String stu=obj.entry();
						     				if(!stu.equals(words[1])) {
						     					mohan.add(stu);
						     				}
						     			}
						     			int q= mohan.count();
						     			//System.out.println(q);
						     			String []array = new String[q];
						     			int v=0;
						     			iterator<String> itr5 = new iterator<String> (mohan.head);
						     			while(itr5.hasNext()) {
						     				String s = itr5.next();
						     				array[v] = s;
						     				v++;
						     			}
						     			sort(array);
						     			String h="";
						     			for (int j=0;j<q;j++) {
						     				h= h + array[j]+" ";
						     			}
						     			
						     			answers.add(h);
						     			x++;
						     			break;
					     	
						     		}
						     	}

					   	}
					   	
					    }

		   		}
		   	br.close(); 
		   	int nokia = answers.count();
		   	String array[]= new String [nokia];
		   	iterator<String> ansitr = new iterator<String>(answers.head); 
		   	int i =0;
		   	while(ansitr.hasNext()) {
		   		array[i]= ansitr.next();
		   		i++;
		   	}
		   	for(int h =0;h<nokia;h++) {
		   		System.out.println(array[nokia-1-h]);
		    }
	}
	
	
	public static void main(String[] args)throws Exception {
		getData(args[0],args[1]);
		answerQueries(args[2]);
		//System.out.println(courseDetails.count());
	}

		   
}
		   
