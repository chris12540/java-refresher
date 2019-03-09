package section5;

/**
 * CREATE THREE SCHOOL OBJECTS FROM THE SCHOOL CLASS YOU WORKED IN THE PREVIOUS
 * EXERCISE AND ADD THEM TO THIS SCHOOL DISTRICT CLASS. SET THE numberOfStudents
 * VARIABLE OF EACH SHOOL CLASS TO AN ARBITRARY NUMBER. HINT: THE SCHOOL
 * DISTRICT CLASS WILL HAVE THREE REFERENCE VARIABLES, EACH POINTING TO A SCHOOL
 * OBJECT. YOU CAN USE ARRAYS AND GET CREATIVE IF YOU WANT :). FINALLY, PRINT
 * THE TOTAL NUMBER OF STUDENTS IN THE SCHOOL DISTRICT
 */
public class SchoolDistrict {

	public static void main(String[] args) {
		
		School s1 = new School(11);
		School s2 = new School(200);
		School s3 = new School(100);
		
		int total = s1.numberofStudents+s2.numberofStudents+s3.numberofStudents;

		System.out.println("This school district has "+total+" students");
	}

}
