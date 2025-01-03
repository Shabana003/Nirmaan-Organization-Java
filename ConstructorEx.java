package Day10;

public class ConstructorEx {
	int id;
	String name;
	
	ConstructorEx(int id,String name ){
		this.id=id;
		this.name=name;
	}
	ConstructorEx(){
		
	}
	public static void main(String[] args) {
		ConstructorEx car1=new ConstructorEx(2000,"Suzuki");
		System.out.println(car1.id+"     "+car1.name);
		ConstructorEx car2=new ConstructorEx(2002,"Tata");
		System.out.println(car2.id+"     "+car2.name);
		
	}
	
	
	

}
