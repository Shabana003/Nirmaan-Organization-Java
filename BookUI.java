package BookManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class BookUI {
public static void main(String[] args) {
	Book bk=new Book();
	ArrayList<Book> al=new ArrayList<Book>();
	Scanner sc=new Scanner(System.in);
	boolean isTrue=true;
	while(isTrue) {
		
		System.out.println("Enter your choice : ");
		System.out.println("Enter 1 for add");
		System.out.println("Enter 2 for show");
		System.out.println("Enter 3 for delete");
		System.out.println("Enter 4 for update");
		System.out.println("Enter 0 for exit");
		
		int key=sc.nextInt();
		sc.nextLine();
		
		if(key==1) {
			
			System.out.println("Enter book id : ");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the book name : ");
			String name=sc.nextLine();
			System.out.println("Enter the book price : ");
			double price=sc.nextInt();
			System.out.println("Enter the author of book : ");
			String author=sc.nextLine();
			sc.nextLine();
			
			bk=new Book(id,name,author,price);
			al.add(bk);
		}
		else if(key==2) {
			System.out.println(al);
		}
		else if(key==3) {
			System.out.println("Enter book id : ");
			int id=sc.nextInt();
			sc.nextLine();
			
			for(Book idr:al) {
				if(idr.getId()==id) {
					al.remove(idr);
					break;
				}
			}
		}else if(key==4) {
			System.out.println("Enter book id : ");
			int id=sc.nextInt();
			sc.nextLine();
			boolean isthere=false;
			
			for(Book idrr:al) {
				if(idrr.getId()==id) {
				
					System.out.println("Enter the book name : ");
					String name=sc.nextLine();
					idrr.setName(name);
					System.out.println("Enter the book price : ");
					double price=sc.nextInt();
					idrr.setPrice(price);
					System.out.println("Enter the author of book : ");
					String author=sc.nextLine();
					idrr.setAuthor(author);
					isthere=true;
					
				}
				
		}
			if(!isthere) {
				System.out.println("Not there");
			}
		}
		else if(key==0) {
			isTrue=false;
			System.out.println("Thank You!!!");
		}
		}
	}
}
