package Day15;

import java.util.Scanner;

public class Library {
	public static void main(String[] args) {
		Book book=new Book();
		boolean isWrk =true;
		
		while(true) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice ");
		System.out.println("1 for add");
		System.out.println("2 for update");
		System.out.println("3 for show");
		System.out.println("4 for exit");
		int key=sc.nextInt();
		
		if(key==1) {
			System.out.println("Enter your Bookid : ");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter your Bookname : ");
			String name=sc.nextLine();
			System.out.println("Enter your author : ");
			String author=sc.nextLine();
			System.out.println("Enter your price : ");
			float price=sc.nextFloat();
			
			book=new Book(id,name,author,price);
			
		}
		else if(key==2) {
			System.out.println("1 for modify id : ");
			System.out.println("2 for modify name : ");
			System.out.println("3 for modify author : ");
			System.out.println("4 for modify price : ");
			int key1=sc.nextInt();
			if(key1==1) {
				System.out.println("Enter your Bookid : ");
				int id=sc.nextInt();
				
			}
			else if(key1==2) {
				sc.nextLine();
				System.out.println("Enter your Bookname : ");
				String name=sc.nextLine();
				book.setName(name);
			}
			else if(key1==3) {
				System.out.println("Enter your author : ");
				String author=sc.nextLine();
				book.setAuthor(author);
			}
			else if(key1==4) {
				System.out.println("Enter your price : ");
				float price=sc.nextFloat();
			}
			else {
				System.out.println("Invalid input");
			}
			
		}
		else if(key==3) {
			System.out.println(book);
		}
		else if(key==4) {
			isWrk=false;
			System.out.println("Thank you");
		}
		else{
			System.out.println("Enter correct input");
		}
		
	}

}
}