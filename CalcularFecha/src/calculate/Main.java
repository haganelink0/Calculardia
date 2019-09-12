package calculate;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Calculator calc = new Calculator();
		Menu one = new Menu(reader, calc);
		one.start();
		

	}

}
