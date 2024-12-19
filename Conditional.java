package day3;

import java.util.Scanner;

public class Conditional {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*System.out.println("Enter the Mark");
		int stdMark = sc.nextInt();
		if ((stdMark >= 35) && (stdMark <= 100)) {
			if (stdMark >= 90) {
				System.out.println("Grade A");

			} else if (stdMark >= 80) {
				System.out.println("Grade B");
			} else {
				System.out.println("Grade C");

			}
		} else if (stdMark > 100) {
			System.out.println("Invalid mark");
		} else {
			System.out.println("Fail");
		}*/
        System.out.println("Enter your choice");
        System.out.println("1 for add");
		System.out.println("2 for sub");
		System.out.println("3 for mul");
		System.out.println("4 for div");
		System.out.println("5 for mod");
        
		int key = sc.nextInt();
		
		switch(key) {
		case 1:
		{
		System.out.println("Enter first num:");
		int fnum = sc.nextInt();
		System.out.println("Enter second num:");
		int snum = sc.nextInt();
		System.out.println("Addition : "+(fnum+snum));
		break;
		}
		case 2:
		{
			System.out.println("Enter first num:");
			int fnum = sc.nextInt();
			System.out.println("Enter second num:");
			int snum = sc.nextInt();
			System.out.println("Substraction : "+(fnum-snum));
			break;
		}
		case 3:
		{
			System.out.println("Enter first num:");
			int fnum = sc.nextInt();
			System.out.println("Enter second num:");
			int snum = sc.nextInt();
			System.out.println("Multiplication : "+(fnum*snum));
			break;
		}
		case 4:
		{
			System.out.println("Enter first num:");
			int fnum = sc.nextInt();
			System.out.println("Enter second num:");
			int snum = sc.nextInt();
			System.out.println("Division : "+(fnum/snum));
			break;
		}
		case 5:
		{
			System.out.println("Enter first num:");
			int fnum = sc.nextInt();
			System.out.println("Enter second num:");
			int snum = sc.nextInt();
			System.out.println("Modulus : "+(fnum%snum));
			break;
		}
		default:
			System.out.println("Invalid number");
		}
}
}
