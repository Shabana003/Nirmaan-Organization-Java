package Multithreading;
class name1 implements Runnable{
	public void run() {
	for(int i=1;i<=100;i++) {
		System.out.println("Shabu");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
class name2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++) {
			System.out.println("Kalai");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
	
}

public class multithread1 {
public static void main(String[] args) {
	name1 n1=new name1();
	name2 n2=new name2();
	Thread t1=new Thread(n1);
	Thread t2=new Thread(n2);
	t1.start();
	t2.start();
}
}
