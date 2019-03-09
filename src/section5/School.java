package section5;

/**
 * CREATE THE PUBLIC FIELDS name(String), address(String),
 * numberOfStudents(int), cityRating(float) FOR THE SCHOOL OBJECT. ALSO CREATE
 * THE PUBLIC METHOD enrollStudents() THAT JUST PRINTS THE STRING "There are a
 * 1000 students enrolled in this school".
 */
public class School {
	
	public String name;
	public String address;
	public int numberofStudents;
	public float cityRating;
	
	public School(int numberOfStudents) {
		this.numberofStudents= numberOfStudents;
	}
	
	public void enrollStudents() {
		System.out.println("There are a 1000 students enrolled in this school");
	}
	
}
