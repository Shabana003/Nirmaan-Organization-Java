package MultipleInterface;

public class UI implements Calculator2  {

	@Override
	public void add(int a, int b) {
		System.out.println("Addition : "+(a+b));
		
	}

	@Override
	public void sub(int a, int b) {
		System.out.println("Subtraction : "+(a-b));
		
	}

	@Override
	public void mul(int a, int b) {
		System.out.println("Multiplication : "+(a*b));
		
	}

	@Override
	public void div(int a, int b) {
		System.out.println("Division : "+(a/b));
		
	}
	public static void main(String[] args) {
		Calculator1.display();
		UI calc=new UI();
		calc.add(56, 78);
		calc.sub(47, 34);
		calc.mul(6, 10);
		calc.div(50, 5);
		calc.Addition();
		System.out.println(calc.NUM);
		
	}

}
