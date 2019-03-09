package section3;

/**
 * CREATE A MAIN METHOD THAT WILL DECLARE AND INITIALIZE TWO VARIABLES
 * 'customerName' AND 'itemDescription'. CREATE A THIRD VARIABLE CALLED
 * 'message' WITHOUT INITIALIZING IT. CONCATENATE THE FIRST TWO VARIABLES AND
 * ASSIGN THE RESULT TO THE 'message' VARIABLE. PRINT THE 'message' VARIABLE TO
 * THE SCREEN.
 */
public class Exercise1 {

	public static void main(String[] args) {
		
		String customerName = "John";
		String itemDescription = "iPhone";
		String message;
		message = customerName+itemDescription;
		System.out.println(message);

	}

}
