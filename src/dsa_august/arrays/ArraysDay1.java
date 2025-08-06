package dsa_august.arrays;
import java.util.Scanner;

public class ArraysDay1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		Student stu1 = new Student(12,"Roshan");
//		Student stu2 = new Student(13,"Jassi");
//		Student stu3 = new Student(14,"Gill");
//		Student stu4 = new Student(15,"Baaje");
		
		
   Student[] arrStudent = new Student[4];
   
  
   System.out.println("Set name and rollNo for each Student element: \n");

   for(int i = 0;i<arrStudent.length;i++) {
	
	arrStudent[i] = new Student();
	
    System.out.print("Enter name for Student"+(i+1)+": ");
	arrStudent[i].name = sc.nextLine();
	 System.out.print("Enter rollNo for Student"+(i+1)+": ");
	arrStudent[i].rollNo = sc.nextInt()	;
	sc.nextLine();
}
   for(Student arrStudents:arrStudent)
   {
	   System.out.println(arrStudents.name+" "+arrStudents.rollNo);
   }
}
	
}

 