package Abstract;

public class Calc implements Calculator{

	@Override
	public void add(int a, int b) {
		System.out.println("Addition : "+(a+b));
		
	}

	@Override
	public void sub(int a, int b) {
		System.out.println("Substraction : "+(a-b));
		
	}

	@Override
	public void mul(int a, int b) {
		System.out.println("Multiplicatin  : "+(a*b));
		
	}

	@Override
	public void div(int a, int b) {
		System.out.println("Division : "+(a/b));
		
	}
public static void main(String[] args) {
	Calc calc=new Calc();
	calc.add(50,30);
	calc.sub(50,30);
	calc.mul(50,30);
	calc.div(50,30);
}
}
