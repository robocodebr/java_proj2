package proj2;

public class MasterStudent extends Student {
	public String previousСourse;
	/**
	 * method getPreviousСourse return the previous course 
	 * @return {@link MasterStudent#previousСourse}
	 * */
	public String getPreviousСourse() {
		return previousСourse;
	}
	/**
	 * method setPreviousСourse set the previous course 
	 * @param {@link MasterStudent#previousСourse}
	 * */
	public void setPreviousСourse(String previousСourse) {
		this.previousСourse = previousСourse;
	}
	/** 
     * constructor with parameters
     * @param previousСourse - {{@link MasterStudent#previousСourse}}
     * @see {Student#Student(String, String)}
     */
	public MasterStudent(String name, String surname, String previousСourse) {
		super(name, surname);
		this.previousСourse = previousСourse;
	}
}
