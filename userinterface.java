package Day9;

import java.util.Scanner;

public class userinterface {
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int a=sc.nextInt();
		System.out.println("Enter the second number : ");
		int b=sc.nextInt();
		System.out.println("Addition :"+calc.add(a, b));
		System.out.println("Substraction :"+calc.sub(a, b));
		System.out.println("Multiplication :"+calc.mul(a, b));
		System.out.println("Divisin :"+calc.div(a, b));
		System.out.println("Modulus :"+calc.mod(a, b));
		
	}
	
	

}
