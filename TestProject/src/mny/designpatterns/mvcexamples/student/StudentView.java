package mny.designpatterns.mvcexamples.student;

public class StudentView {
	public void printStudentDetails( String name, String rollNo ) {
		System.out.println( "Student: " );
		System.out.println( "Name: " + name );
		System.out.println( "Roll No: " + rollNo );
	}
}
