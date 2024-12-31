package Day8;

public class calc {
	int firstnum;
	int secondnum;
	
	void add() {
		System.out.println("ADD : "+(firstnum+secondnum));
		
	}
	void sub() {
		System.out.println("SUB : "+(firstnum-secondnum));
		
	}
	void mul() {
		System.out.println("MUL : "+(firstnum*secondnum));
		
	}
	void div() {
		System.out.println("DIV : "+(firstnum/secondnum));
		
}
	void mod() {
		System.out.println("MOD : "+(firstnum%secondnum));
		
	}
	 
	public static void main(String[] args) {
		calc calcc = new calc();
		calcc.firstnum=50;
		calcc.secondnum=30;
		calcc.add();
		calcc.sub();
		calcc.mul();
		calcc.div();
		calcc.mod();
		
	}
}