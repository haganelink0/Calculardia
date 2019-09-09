package calculate;

public class Utilities {
	
	public String dayOfTheWeek(int day) {
		if (day == 1) {
			return "Tuesday";
		} else if (day == 2) {
			return "Wednesday";
		} else if (day == 3) {
			return "Thursday";
		} else if (day == 4) {
			return "Friday";
		} else if (day == 5) {
			return "Saturday";
		} else if (day == 6) {
			return "Sunday";
		} else {
			return "Monday";
		}
	}
	
	public int daysinMonths(int month) {
		int totalMonth = (month - 1) * 30;
		if (month <= 2 || month == 5 || month == 6) {
			totalMonth += 1;
		} else if (month == 7) {
			totalMonth += 2;
		} else if (month == 8 || month == 9) {
			totalMonth += 3;
		} else if (month == 10 || month == 11) {
			totalMonth += 4;
		} else {
			totalMonth += 5;
		}
		return totalMonth;
	}


}
