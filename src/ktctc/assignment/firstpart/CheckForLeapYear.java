package ktctc.assignment.firstpart;

public class CheckForLeapYear {

	public static void main(String[] args) {

		int year = 2024;
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("Selected Year Is Leap Year");
		} else {
			System.out.println("Selected Year Is Not Leap Year");
		}
	}

}