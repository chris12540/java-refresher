package section7;

/**
 * YOU CAN SEE TWO CLASSES HERE: THE Exercise1 MAIN CLASS AND THE Calculator
 * EMBEDDED CLASS. WRITE TWO METHODS IN THE CALCULATOR CLASS CALLED add(int x,
 * int y) and multiply(int x, int y) THAT WILL RETURN THE RESULT OF THE
 * OPERATION THEY PERFORM. INSTANTIATE A CALCULATOR OBJECT IN THE MAIN() METHOD
 * AND CALL ITS TWO METHODS, PRINTING THE RESULTS TO THE CONSOLE
 */
public class Exercise1 {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		System.out.println(calc.add(4, 5));
		
		System.out.println(calc.multiply(4, 5));

	}

}

class Calculator {
	
	int add(int x, int y) {
		return x+y;
	}
	
	public int multiply(int x, int y) {
		return x*y;
	}

}