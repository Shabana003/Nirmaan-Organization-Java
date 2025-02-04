package MultipleInterface;

public interface Calculator1 {
	int NUM=67;
	void add(int a,int b);
	void sub(int a,int b);
	
	static void display() {
		System.out.println("Calculator ");
	}
	default void Addition() {
		System.out.println(456+789);
	}

}
