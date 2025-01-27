package School;

import java.util.Scanner;

public class TeacherIU {
	public static void main(String[] args) {
	Teacher teacher=new Teacher();
	boolean isWrk=true;
	while(isWrk) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice ");
		System.out.println("1 for add");
		System.out.println("2 for update");
		System.out.println("3 for show");
		System.out.println("4 for exit");
		int key=sc.nextInt();
		switch(key) {
		case 1:{
			System.out.println("Enter teacherid : ");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter teachername : ");
			String name=sc.nextLine();
			System.out.println("Enter teacherphno : ");
			long phno=sc.nextLong();
			System.out.println("Enter teachersalary: ");
			double salary=sc.nextDouble();
			teacher=new Teacher(id,name,phno,salary);
			break;
			}
		case 2:{
			System.out.println("1 for modify id");
			System.out.println("2 for modify name");
			System.out.println("3 for modify phno");
			System.out.println("4 for modify salary"); 
			int keyyy=sc.nextInt();
			if(keyyy==1) {
				System.out.println("Enter teacherid : ");
				int id=sc.nextInt();
				teacher.setId(id);
				sc.nextLine();
				}
			else if(keyyy==2) {
				
				System.out.println("Enter teachername : ");
				String name=sc.nextLine();
				teacher.setName(name);
			}
			else if(keyyy==3) {
				System.out.println("Enter teacherphno : ");
				long phno=sc.nextLong();
				teacher.setPhno(phno);
			}
			else if(keyyy==4) {
				System.out.println("Enter teachersalary : ");
				double salary=sc.nextDouble();
				teacher.setSalary(salary);
			}
			else {
				System.out.println("Invalid input");
			}
			break;
		}
		case 3:{
			System.out.println(teacher);
			break;
		}
		case 4:{
			isWrk=false;
			System.out.println("Thank you");
			break;
		}
		default:{
			System.out.println("Invalid input");
		}

	
	}
	}
}
}
