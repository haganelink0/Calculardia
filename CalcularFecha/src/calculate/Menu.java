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
		System.out.println("");
	}
	
	public void pedirFecha() {
		int day = 0;
		int month = 0;
		int year = 0;
		while (validarFecha(day, month, year) != 1) {
			System.out.println("Insert day: ");
			day = Integer.parseInt(reader.nextLine());
			System.out.println("Insert month: ");
			month = Integer.parseInt(reader.nextLine());
			System.out.println("Insert year: ");
			year = Integer.parseInt(reader.nextLine());	
		}
	}
	
	public int validarFecha  (int  dia, int  mes, int year) {
		 if (year > 1978) {
			 if (mes > 1 || mes < 12) {
				 if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
					 if (dia > 1 || dia < 30) {
						 return 1;
					 }
				 } else if (mes == 1 || mes == 3 || mes == 5 || mes ==7 || mes == 8 || mes == 10 || mes == 12) {
					 if (dia > 1 || dia < 31) {
						 return 1;
					 }
				 } else if (mes == 2) {
					 if (Utilities.anioBisiesto(year) == 1) {
						 if (dia > 1 || dia < 29) {
							 return 1;
						 } else if (dia > 1 || dia < 28) {
							 return 1;
						 }
					 }
				 }
			 }
		 }
		return 0;		
	 }
	
	
	

}
