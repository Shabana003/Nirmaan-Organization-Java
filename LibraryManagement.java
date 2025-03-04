package FILEHANDLING;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

class Library implements Serializable{
	int id;
	String name;
	double price;
	String author;
public Library(int id, String name, double price, String author) {
			super();
			this.id = id;
			this.name = name;
			this.price = price;
			this.author = author;
		}
		@Override
		public String toString() {
			return "Library [id=" + id + ", name=" + name + ", price=" + price + ", author=" + author + "]";
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public Library() {
			super();
		}
		
	}

	public class LibraryManagement {
	public static void main(String[] args) {
		ArrayList<Library> arrl=new ArrayList<Library>();
		Scanner sc=new Scanner(System.in);
		Library lb=new Library();
		boolean isWrk=true;
		String path="C:\\Users\\SHABU\\OneDrive\\Desktop\\shabana\\shabu.txt";
		while(isWrk) {
			
		System.out.println("Enter your choice : ");
		System.out.println("Enter 1 for add book details");
		System.out.println("Enter 2 for show book details");
		System.out.println("Enter 3 for delete book details");
		System.out.println("Enter 4 for update book details");
		System.out.println("Enter 0 for exit");
		
		int key=sc.nextInt();
		sc.nextLine();
		
		if(key==1) {
			
			arrl=readFile(path);
			
			System.out.println("Enter the book id : ");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the book name : ");
			String name=sc.nextLine();
			System.out.println("Enter the book price : ");
			double price=sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter the author of book : ");
			String author=sc.nextLine();
			
			lb=new Library(id,name,price,author);
			arrl.add(lb);
			
			writeFile(path, arrl);
		}
		else if(key==2) {
			
			arrl=readFile(path);
			
			System.out.println(arrl);
		}
		else if(key==3) {
			
			arrl=readFile(path);
			
			System.out.println("Enter the book id : ");
			int id=sc.nextInt();
			
			for(Library lib : arrl) {
				if(lib.getId()==id) {
					arrl.remove(lib);
					System.out.println("Deleted");
					break;
				}
			}
			writeFile(path, arrl);
		}
		else if(key==4) {
			
			arrl=readFile(path);
			
			System.out.println("Enter the book id : ");
			int id=sc.nextInt();
		
			for(Library lib : arrl) {
				if(lib.getId()==id) {
					System.out.println("Enter the book id : ");
					int id1=sc.nextInt();
					sc.nextLine();
					System.out.println("Enter the book name : ");
					String name=sc.nextLine();
					System.out.println("Enter the book price : ");
					double price=sc.nextInt();
					System.out.println("Enter the author of book : ");
					String author=sc.nextLine();
					
					lib.setId(id);
					lib.setName(name);
					lib.setPrice(price);
					lib.setAuthor(author);
					
					break;
		}
			}
			writeFile(path, arrl);
		}
		else if(key==0) {
			isWrk=false;
			System.out.println("Thank You!");
		}
		else {
			System.out.println("Invalid input");
		}
		
			}
		}
		private static void writeFile(String path,ArrayList<Library>arrl) {
			try {
			FileOutputStream fos=new FileOutputStream(path);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(arrl);
			oos.close();
			fos.close();
			}catch(Exception e) {
				//TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public static ArrayList<Library> readFile(String path){
			ArrayList<Library> arrl=new ArrayList<Library>();
			try {
				FileInputStream fis=new FileInputStream(path);
				ObjectInputStream ois=new ObjectInputStream(fis);
				arrl=(ArrayList<Library>) ois.readObject();
				ois.close();
				fis.close();
			}catch(Exception e) {
				//TODO Auto-generated catch block
				System.out.println("File is empty...ready to store");
			}
			return arrl;
		}
		}

