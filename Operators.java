package day1;

public class Operators {
	public static void main(String [] a) {
		int num1 = 19;
		int num2 = 21;
		int num3 = 10;
		
		int num50 = 50;
		int num100 = 100;
		int numa = 12;
		
		System.out.println("Enter the first number: "+num1);
		System.out.println("Enter the second number: "+num2);
		System.out.println("");
		System.out.println("Arithmetric operations: ");
		System.out.println("Addition: "+(num1+num2));
		System.out.println("Substraction: "+(num1-num2));
		System.out.println("Multiplication: "+(num1*num2));
		System.out.println("Division: "+(num1/num2));
		System.out.println("");
		System.out.println("Relational operations:");
		System.out.println(num1+" > "+num2+" : "+(num1>num2));
		System.out.println(num1+" < "+num2+" : "+(num1<num2));
		System.out.println(num1+" >= "+num2+" : "+(num1>=num2));
		System.out.println(num1+" <= "+num2+" : "+(num1<=num2));
		System.out.println(num1+" == "+num2+" : "+(num1==num2));
		System.out.println(num1+" != "+num2+" : "+(num1!=num2));
		System.out.println("");
		System.out.println("Logical operations:");
		System.out.println("("+num1+" > 10 AND"+num2+"< 50) :"+((num1>num50)&&(num2<num100)));
		System.out.println("("+num1+" > 10 AND"+num2+"< 50) :"+((num1>num50)||(num2<num100)));
		System.out.println("");
		System.out.println("Assignment operations: ");
		System.out.println("Initial value: "+num3);
		System.out.println("After += : "+((num3+=12)));
		System.out.println("After += : "+((num3-=12)));
		System.out.println("After += : "+((num3*=12)));
		System.out.println("After += : "+((num3/=10)));
		System.out.println("After += : "+((num3%=2)));
		System.out.println("");
		System.out.println("Unary operations: ");
		System.out.println("Initial value: "+numa);
		System.out.println("After increment: "+(++numa));
		System.out.println("After decrement: "+(--numa));
		System.out.println("");
		System.out.println("Conditional operators: ");
		String isTrue = (numa%2==0)?"Even":"Odd";
		System.out.println("12 is "+isTrue);	
	}

}
