import java.util.Scanner;
public class BMI {

	public static void main(String[] args) {
		System.out.printf("Enter your weight in Pounds: ");
		Scanner input = new Scanner(System.in);
		int weight = input.nextInt();
		System.out.printf("Enter your height in Inches: ");
		int height = input.nextInt();
		int bmi = (weight*703)/(height*height);
		System.out.printf("Your body mass index is %d", bmi);
	}

}
