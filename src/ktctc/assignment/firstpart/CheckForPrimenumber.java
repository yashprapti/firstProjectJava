package ktctc.assignment.firstpart;

public class CheckForPrimenumber {
	public static void main(String[] args) {
		int num = 13;
		int count = 0;

		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println("Selected Number Is Prime Number");
			} else {
				System.out.println("Selected Number Is Not Prime Number");
			}

		}

	}

}