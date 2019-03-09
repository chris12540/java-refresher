package section6;

/**
 * EXTRACT THE FIRST NAME Roger FROM THE name STRING DECLARD AND INITIALIZED IN
 * THE MAIN() METHOD. INITIALIZE A STRINGBUILDER OBJECT PASSING THIS FIRST NAME
 * IN IT'S CONSTRUCTOR. USE THE .append() METHOD OF THE STRINGBUILDER OBJECT TO
 * ADD THE LAST NAME Federer TO THE FIRST NAME PRINT THE MODIFIED STRING
 */
public class Exercise1 {

	public static void main(String[] args) {
		String name = "Roger Williams";
		
		String[] names = name.split(" ");
		
		StringBuilder builder = new StringBuilder(names[0]);
		
		builder.append(" Federer");
		
		System.out.println(builder.toString());
	}

}
