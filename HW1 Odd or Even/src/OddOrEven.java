import java.util.Scanner;
public class OddOrEven {
	public static void main(String[] args) {
		System.out.printf("Enter an integer: ");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		if(x%2==0)
			System.out.printf("The integer %d is even.\n", x);
		else 
			System.out.printf("The integer %d is odd.\n", x);
	}

}
