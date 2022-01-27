package ktctc.assignment.firstpart;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		int a = 140;
		int b = 140;
		int c = 200;
		if (a >= b && a >= c) {
			System.out.println("Largest Number Is " + a);
		} else if (b > a && b > c) {
			System.out.println("Largest Number Is " + b);
		} else {
			System.out.println("Largest Number Is " + c);
		}
	}

}