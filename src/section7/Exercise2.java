package section7;

/**
 * CREATE THREE SHAPE OBJECTS IN THE MAIN() METHOD; A SQUARE, A RECTANGLE, AND A
 * CIRCLE. CREATE TWO OVERLOADED METHODS IN THE MAIN CLASS LIKE
 * calculateArea(int a, int b) AND calculateArea(int c) THAT RETURN INT VALUES
 * FOR THE AREAS. CALL THE TWO ARGUMENT METHOD TO CALCULATE THE AREA OF THE
 * SQUARE AND RECTANGLE. CALL THE ONE ARGUMENT METHOD TO CALCULATE THE AREA OF
 * THE CIRCLE.
 */
public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape square = new Shape();
		System.out.println(square.area(10,20));
		
		Shape circle = new Shape();
		System.out.println(circle.area(5));
	}

}

class Shape {
	public int length;
	public int width;
	public int radius;
	
	public int area(int x, int y) {
		return x*y;
	}
	
	public int area(int r) {
		double area = Math.PI*(r^2);
		return (int)area;
	}
}
