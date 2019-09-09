package calculate;

public class Main {
	public static void main(String[] args) {
		Calculator calculadora = new Calculator();
		Date cumple = new Date(1, 1, 1987);
		System.out.println("lunes es: " +calculadora.dayOfTheWeek( new Date(5,1,1987)));
		System.out.println("martes es: " + calculadora.dayOfTheWeek(new Date(2,2,1988)));
		System.out.println("miércoles es: " + calculadora.dayOfTheWeek(new Date(1,3,1989)));
		System.out.println("jueves es: " + calculadora.dayOfTheWeek(new Date(5,8,1990)));
		System.out.println("viernes es: " + calculadora.dayOfTheWeek(new Date(12,4,1991)));
		System.out.println(calculadora.dayOfTheWeek(cumple));

	}

}
