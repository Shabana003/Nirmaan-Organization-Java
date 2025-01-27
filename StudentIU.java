package School;

import java.util.Scanner;

public class StudentIU {
	public static void main(String[] args) {
		Student stud = new Student();
		boolean isWrk=true;
		while(true) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your choice ");
		System.out.println("1 for add");
		System.out.println("2 for update");
		System.out.println("3 for show");
		System.out.println("4 for exit");
		int key=sc.nextInt();
		
		if(key==1) {
			System.out.println("Enter studentid : ");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter studentname : ");
			String name=sc.nextLine();
			System.out.println("Enter studentrollno : ");
			int rollno=sc.nextInt();
			System.out.println("Enter studentphno : ");
			long phno=sc.nextLong();
			
			stud = new Student(id,name,rollno,phno);
			}
		else if(key==2) {
			
			System.out.println("1 for modify id");
			System.out.println("2 for modify name");
			System.out.println("3 for modify rollno");
			System.out.println("4 for modify phno"); 
			int keyyy=sc.nextInt();
			if(keyyy==1) {
				System.out.println("Enter studentid : ");
				int id=sc.nextInt();
				stud.setId(id);
				}
			else if(keyyy==2) {
				sc.nextLine();
				System.out.println("Enter studentname : ");
				String name=sc.nextLine();
				stud.setName(name);
			}
			else if(keyyy==3) {
				System.out.println("Enter studentrollno : ");
				int rollno=sc.nextInt();
				stud.setRollno(rollno);
			}
			else if(keyyy==4) {
				System.out.println("Enter studentphno : ");
				long phno=sc.nextLong();
				stud.setPhno(phno);
			}
			else {
				System.out.println("Invalid input");
			}
		}	else if(key==3) {
			System.out.println(stud);
		}
		else if(key==4) {
			isWrk=false;
			System.out.println("Thank you");
		}
		else{
			System.out.println("Enter correct input");
		}
		
		
		}}}
