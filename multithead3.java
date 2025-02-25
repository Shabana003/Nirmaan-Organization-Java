package Multithreading;
class Class01{
	public void display() {
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
class Class02{
	public void display() {
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


public class multithead3 {
public static void main(String[] args) {
	Class01 c1=new Class01();
	Class02 c2=new Class02();
	Runnable r1=new Runnable() {
		public void run() {
			c1.display();
		}
	};
	Runnable r2=new Runnable() {
		public void run() {
			c2.display();
		}
	};
	Thread t1=new Thread(r1);
	Thread t2=new Thread(r2);
	t1.start();
	t2.start();
}
}
