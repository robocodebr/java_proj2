package proj2;
import java.time.Year;  
/** 
 * Student class with fields name, surname, studyYead and university
 * @autor Student
 * @version 1
*/

public class Student {
	/**
	 * name - student's name
	 * */
	protected String name;
	/**
	 * surname - student's surname
	 * */
	protected String surname;
	/**
	 * studyYear - student's current year of study
	 * */
	private int studyYear;
	/**
	 * university - current student's university
	 * */
	public static String university = "NaUKMA"; 
	
	/**
	 * method getUniversity return the current university 
	 * @return {@link Student#university}
	 * */
	public static String getUniversity() {
		return university;
	}
	/**
	 * method setUniversity set current university 
	 * @param {@link Student#university}
	 * */
	private static void setUniversity(String uni) {
		university = uni;
	}
	/**
	 * method changeUniversity output to console current university 
	 * @param {@link Student#university}
	 * */
	public static void changeUniversity(String uni) {
		setUniversity(uni);
		System.out.println("University is "+uni);
	}

	 /** 
     * constructor with parameters
     * @param name - student's name
     * @param surname -  student's surname
     */
	public Student(String name, String surname) {
		this.name = name;
		this.surname = surname;
		this.studyYear = 1;
	}
	
	/**
	 * method getFullName return student's full name
	 * @return {@link Student#name} and {@link Student#surname}
	 * */
	public String getFullName() {
		return name +" "+ surname;
	}
	/**
	 * method setFullName set student's full name
	 * @param name - {@link Student#name}
	 * @param surname - {@link Student#surname}
	 * @return nothing
	 * */
	public void setFullName(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	/**
	 * method printYearOfEnding output the year of ending study 
	 * */
	public void printYearOfEnding() {
		Year y = Year.now();
		System.out.println("Final year of studies is "+(y.getValue()+4-studyYear));
		
	}
	/**
	 * method toString return info about student
	 * @return full name({@link Student#name} and {@link Student#surname}) and current year of study{@link Student#studyYear}
	 * */
	@Override
    public String toString()
    {
        return "Student name: "+getFullName()+", "+studyYear+"th year of study";
	}
}
