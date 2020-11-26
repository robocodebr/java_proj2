package proj2;

public class BachelorStudent extends Student {

	/*
	 * specialty - current student's specialty
	 * */
	private String specialty;
	/*
	 * faculty - current student's faculty
	 * */
	private String faculty;
	/**
	 * method getSpecialty return the current specialty 
	 * @return {@link BachelorStudent#specialty}
	 * */
	public String getSpecialty() {
		return specialty;
	}
	/**
	 * method getFaculty return the current faculty 
	 * @return {@link BachelorStudent#faculty}
	 * */
	public String getFaculty() {
		return faculty;
	}
	/**
	 * method setSpecialty set the current specialty 
	 * @param {@link BachelorStudent#specialty}
	 * */
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	/**
	 * method setFaculty set the current faculty 
	 * @param {@link BachelorStudent#faculty}
	 * */
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	
	/** 
     * constructor with parameters
     * @see {Student#Student(String, String)}
     */
	public BachelorStudent(String name, String surname) {
		super(name, surname);
	}

}
