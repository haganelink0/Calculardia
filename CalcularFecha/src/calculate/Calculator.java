package calculate;



public class Calculator {
	private Date initialPoint;
	
	public Calculator() {
		this.initialPoint = new Date(1,1,1978);
	}

	public Date getInitialPoint() {
		return initialPoint;
	}
	
	public int calcularDias(int dia, int mes, int year) {
		int totalDays = yearDifferenceInDays(year);
		int totalMonth = Utilities.daysinMonths(mes);
		return totalDays + totalMonth + dia;
	}
	
	public int yearDifferenceInDays( int year) {
		int yearDifference = year - this.initialPoint.getYear();
		int leapYears = 0;
		for (int i = 0; i < yearDifference; i++) {
			if (Utilities.anioBisiesto(this.initialPoint.getYear() + i) == 1){
				leapYears++;
			}
		}
		
		return yearDifference * 365 + leapYears;
	}
	
	public String dayOfTheWeek(Date date) {
		int totalDays = calcularDias(date.getDay(), date.getMonth(), date.getYear());
		int dayOfTheWeek = totalDays % 7;
		return Utilities.dayOfTheWeek(dayOfTheWeek);
		
	}

}
