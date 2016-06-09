package calculator;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("값: ");
		double d = Double.parseDouble(sc.nextLine());
		
		calImpl c = new calImpl();
		
		System.out.println("결과: " + c.sqrt(d));
		
	}

}
