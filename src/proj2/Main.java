package proj2;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student("Vasya", "Pupkin");
		Student student2 = new Student("Ivan", "Ivanov");
		System.out.println(student1.getFullName());
		System.out.println(student1.toString());
		
		System.out.println(student2.getFullName());
		System.out.println(student2.toString());
		
		student1.setFullName("Petro", "Petrov");
		System.out.println(student1.toString());
		student1.printYearOfEnding();
		
		System.out.println(student1.getUniversity());
		student2.changeUniversity("NAUKMA");
		System.out.println(Student.getUniversity());
		
		BachelorStudent student3 = new BachelorStudent("Vasya", "Pupkin");
		System.out.println(student3.toString());
		student3.setSpecialty("Computer science");
		student3.setFaculty("Software engineering");
		
		MasterStudent student4 = new MasterStudent("Vasya", "Pupkin", "Computer science");
		System.out.println(student4.toString());
		System.out.println(student4.getPreviousСourse());
		student4.setPreviousСourse("computer science");
		System.out.println(student4.getPreviousСourse());
		student4.setFullName("Petro", "Petrov");
		System.out.println(student4.toString());
	}

}
