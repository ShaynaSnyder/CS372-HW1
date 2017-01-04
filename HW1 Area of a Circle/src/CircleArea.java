import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		System.out.printf("Please enter a value for the radius of a circle: ");
		Scanner input = new Scanner(System.in);
		int r = input.nextInt();
		final double PI = 3.14;
		double area;
		area = r*r*PI;
		System.out.printf("The area of the circle is %d.", area);

	}

}
