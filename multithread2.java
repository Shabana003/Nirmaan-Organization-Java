package Multithreading;
class ClassA{
	public void display() {
		for(int i=1;i<=100;i++) {
			System.out.println("Class A");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class ClassB{
	public void display() {
	for(int i=1;i<=100;i++) {
		System.out.println("Class B");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
public class multithread2 {
public static void main(String[] args) {
	ClassA c1=new ClassA();
	ClassB c2=new ClassB();
	Thread t1=new Thread() {
		public void run() {
			c1.display();
		}
	};
	Thread t2=new Thread() {
		public void run() {
			c2.display();
		}
	};
	t1.start();
	t2.start();
}
}
