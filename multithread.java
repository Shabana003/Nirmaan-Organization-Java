package Multithreading;
class Class1 extends Thread{
	public void run() {
		for(int i=1;i<=100;i++) {
		System.out.println("Class 1");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	}
	

}
class Class2 extends Thread{
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println("Class 2");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

public class multithread {
public static void main(String[] args) {
	Class1 c1=new Class1();
	Class2 c2=new Class2();
	
	c1.start();
	c2.start();
	
}
}
