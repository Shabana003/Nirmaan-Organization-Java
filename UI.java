package InterfaceTask;

import java.util.Scanner;

public class UI {
	public static void main(String[] args) {
		Bird bird=new Bird();
		bird.move();
		bird.speak();
		Dog dog=new Dog();
		dog.move();
		dog.speak();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name :");
		String name=sc.nextLine();
		System.out.println(Animal.isMammal(name));
		System.out.println(Animal.CATEGORY);
		
	}


}
