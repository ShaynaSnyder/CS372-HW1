
public class IntChar {

	public static void main(String[] args) {
		char[] ch= {'A', 'B', 'C', 'a', 'b', 'c', '0', '1', '2', '$', '*', '+', '/', ' '};
		for(int i=0; i<14; i++) {
		System.out.printf("The character %c has the value %d.\n", ch[i], ((int) ch[i]));
		}
	}
}
