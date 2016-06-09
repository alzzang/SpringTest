package calculator;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		cal cal = new calImpl();
		
		System.out.println(cal.mul(2,3));
		cal c= new calImpl();
		System.out.println(c.mul(3, 2));

		
		System.out.println(cal.plus(1, 2));
	}

}
