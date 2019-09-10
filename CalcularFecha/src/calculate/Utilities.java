package calculate;


public class Utilities {

	
	public static String dayOfTheWeek(int day) {
		if (day == 1) {
			return "Sunday";
		} else if (day == 2) {
			return "Monday";
		} else if (day == 3) {
			return "Tuesday";
		} else if (day == 4) {
			return "Wednesday";
		} else if (day == 5) {
			return "Thursday";
		} else if (day == 6) {
			return "Friday";
		} else {
			return "Saturday";
		}
	}
	
	public static int daysinMonths(int month) {
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
	 
	 public static int anioBisiesto(int year) {
			if (year % 4 == 0) {
				if (year % 100 == 0) {
					if (year % 400 == 0) {
						return 1;
					} else {
						return 0;
					}
				} else {
					return 1;
				}
			} else {
				return 0;
			}
		}


}
