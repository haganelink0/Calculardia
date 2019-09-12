package calculate;

import java.util.Scanner;

public class Menu {
	private Scanner reader;
	private Calculator calculator;
	private Date date;

	
	public Menu(Scanner reader, Calculator calculator) {
		this.reader = reader;
		this.calculator = calculator;
	}
	
	public void start( ) {
		System.out.println("Welcome to the day of the week calculator.");
		pedirFecha();
		while(true) {
			if (validarFecha(this.date.getDay(), this.date.getMonth(), this.date.getYear()) == 0) {
				System.out.println("Invalid date. Please insert a valid one.");
				 pedirFecha();
			} else {
				break;
			}
		}
		 System.out.println(getDate() + " and was a " +this.calculator.dayOfTheWeek(this.date)); 
	}
	
	public void pedirFecha() {
			System.out.println("Insert day: ");
			int day = Integer.parseInt(reader.nextLine());
			System.out.println("Insert month: ");
			int month = Integer.parseInt(reader.nextLine());
			System.out.println("Insert year: ");
			int year = Integer.parseInt(reader.nextLine());
			this.date = new Date(day, month, year);
	}
	
	public int validarFecha  (int  dia, int  mes, int year) {
		 if (year > 1978) {
			 if (mes > 1 && mes < 12) {
				 if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
					 if (dia > 1 && dia < 30) {
						 return 1;
					 }
				 } else if (mes == 1 || mes == 3 || mes == 5 || mes ==7 || mes == 8 || mes == 10 || mes == 12) {
					 if (dia > 1 && dia < 31) {
						 return 1;
					 }
				 } else if (mes == 2) {
					 if (Utilities.anioBisiesto(year) == 1) {
						 if (dia > 1 || dia < 29) {
							 return 1;
						 } else if (dia > 1 && dia < 28) {
							 return 1;
						 }
					 }
				 }
			 }
		 }
		return 0;		
	 }
	

	public Date getDate() {
		return date;
	}
	
	
	

}
