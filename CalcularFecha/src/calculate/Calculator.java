package calculate;



public class Calculator {
	private Date initialPoint;
	private Utilities utilities;
	
	public Calculator() {
		this.initialPoint = new Date(1,1,1978);
		this.utilities = new Utilities();
	}

	public Date getInitialPoint() {
		return initialPoint;
	}
	
	public int anioBisiesto(int year) {
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
	
	public int calcularDias(int dia, int mes, int year) {
		int totalDays = yearDifferenceInDays(year);
		int totalMonth = this.utilities.daysinMonths(mes);
		return totalDays + totalMonth + dia;
	}
	
	public int yearDifferenceInDays( int year) {
		int yearDifference = year - this.initialPoint.getYear();
		int leapYears = 0;
		for (int i = 0; i < yearDifference; i++) {
			if (anioBisiesto(this.initialPoint.getYear() + i) == 1){
				leapYears++;
			}
		}
		
		return yearDifference * 365 + leapYears;
	}
	
	public int dayOfTheWeek(Date date) {
		int totalDays = calcularDias(date.getDay(), date.getMonth(), date.getYear());
		int dayOfTheWeek = totalDays % 7;
		return dayOfTheWeek;
				//this.utilities.dayOfTheWeek(dayOfTheWeek);
		
	}

}
