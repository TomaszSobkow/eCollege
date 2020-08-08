package topic7.assignment;

import java.util.List;
import java.util.ArrayList;

public class Student{
	
	private String name, surname;
	private  float grade;
	private static float sum;
	private static int noOfStudents;

	public Student(String name, String surname, float grade) {
		this.name = name;
		this.surname = surname;
		this.grade = grade;
		noOfStudents++;
	}

	private static List<Student> studensInArray = new ArrayList<>();
	static{
		studensInArray.add(new Student("James", "Dean", 60.50f));
		studensInArray.add(new Student("Annie", "Francis", 80.50f));
		studensInArray.add(new Student("Davey", "Jones", 40.00f));
		System.out.println("List of students and grades: \n");
	}


	public static void main(String[] args) {

		print();
		System.out.println("No of Students: " + noOfStudents);
		System.out.printf("Average student grade: %.2f", (sum / noOfStudents));
	}

	private static void print(){
		int no = 1;
			for(Student s : studensInArray){
				System.out.print(no++ +". ");
				System.out.println(s);
				sum += s.getGrade();
			}
	}

	public String toString(){
				System.out.println("\tName:" + name +"\n\tSurname: "+ surname+ "\n\tGrade: " + grade);
			return "";
			}

		public float getGrade(){return grade;}
}



