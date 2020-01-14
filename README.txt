COL106 Assignment 1
  Gaurav Chauhan 
   2018CS50406

In this assignment there are 7 interface's .
The following are the interfaces and the classes which implement them:-
1)Position_ implemented by Pos 
2)LinkedList_ implemented by LinkedL
3)Entity_ implemeted by hostel, department , course
4)CourseGrade_ implemented by Coursegrade
5)GradeInfo_ implemented by GradeInfo
6)Student_ implemented by Stu
7)Iterator_ implemented by iterator

Further explanation of 
1) Position_ had value() this gave the value of the node and after() this gave the value of the next one.

2)LinkedList_ had 
 a)add this function adds the element in the linkedlist ,it has two parts head and a tail the next element is added by changing the tail .
 b)positions() this function was of the type iterator this gave the iterator with head as the input .
 c)count() it gave the output as integer and gave the length of the linkedlist 

3)Entity_ was implemented by thrree classes and was used the name and the iterator of the list associated with that class
 the classes which implemented this were hostel, department , course

4)CoursegGrade_ was implemented by Coursegrade and it had 
 a)coursetitle() which gave the coursetitle which was taken in the constructor.
 b)coursenum() which gave the coursenumber which was taken in the constructor.
 c)grade() of type GradeInfo_.LetterGrade which gave the value corresponding to the grade .
 
5)GradeInfo_ which takes GradeInfo(LetterGrade action) as input and returns the integer value associated with the grade.

6)Student_ implemented by Stu contains all the associated with the student it is filled using the inputs from file1 and file2 .
 a)name() which returns the name of the student taken in through the constructor
 b)hostel() which returns the hostel of the student taken in through the constructor
 c)department() which returns the department of the student taken in through the constructor
 d)course() which returns the course of the student taken in through the constructor
 e)completedCredits() which gives the total number of credits .
 f)cgpa() returns the cgpa.

7)Iterator_ which contains
 a)hasNext() which returns true if there exists next node in the list 
 b)next() which returns the present nodes value and makes the node the next one.


What i did ....

i made three Linkedlists allHostels , allDepartments , and allCourses which contained all the objects(the hostel, department and the course respectively ) and each object had a linkedlist which had the Stu objects related to that object of the corresponding list.
then i also made a linkedlist of allStudents which had all the students as its elements .
i also made another linkedlist coursedetails which had all the file 2 data . which was used to answer query in of SHARE type.
i arranged all the outputs in lexicographic order by putting them into an array and then using the function sort to arrange the elements.
All the answers were then put into a linkedlist which later was printed in the opposite order
