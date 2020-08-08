
package topic7;

import java.util.List;
import java.util.ArrayList;

public class Student {

	private String name, lastName;
	private float grade;
	private static float noStudents;
	static float sumGrade;

	Student james, annie, davey;

	public Student() {
		createSteudent();
	}

	public Student(String name, String lastName, float grade) {
		this.name = name;
		this.lastName = lastName;
		this.grade = grade;
		noStudents++;
		sumGrade += grade;
	}


	List<Student> studentInArray = new ArrayList<>();

	private void createSteudent() {
		james = new Student("James", "Sobkow", 60.50f);
		davey = new Student("Davey", "Jones", 40.00f);
		annie = new Student("Annie", "Francis", 80.50f);

		studentInArray.add(james);
		studentInArray.add(annie);
		studentInArray.add(davey);
	}

	public static void main(String[] args) {
		System.out.println("List of students and grade :\n");
		new Student().printStudent();
		System.out.println("No of students: " + noStudents);
		System.out.printf("Average student grade is: %.2f", (sumGrade / noStudents));

	}

	public void printStudent() {
		for (Student s : studentInArray) {
			System.out.println(s);
		}
	}

	@Override
	public String toString() {
		System.out.println("First Name :" + name + "\nLast Name: " + lastName + "\nGrade: " + grade);
		return "";
	}
}
