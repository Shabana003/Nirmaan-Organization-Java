package InterfaceTask;

import java.util.Scanner;

public class Dog implements Animal {

	@Override
	public void move() {
		System.out.println("The dog runs on four legs.");
	}
	public void speak() {
		System.out.println("The bird says chirp chirp!.");
	}
	
}
