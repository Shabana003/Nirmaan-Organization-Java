package Day8;

public class Employee {
	String Ename;
	int Eid;
	long Enum;
	int Esalary;
	public static void main(String[] args) {
	  Employee emp1 = new Employee();
	  emp1.Ename="Shabana";
	  emp1.Eid=12345;
	  emp1.Enum=8976588900l;
	  emp1.Esalary=17000;
	  
	 System.out.println("Employee name : "+emp1.Ename+"\nEmployee id : "+emp1.Eid+"\nEmployee number : "+emp1.Enum+"\nEmployee salary : "
			 +emp1.Esalary);
	 
	 
	 Employee emp2 = new Employee();
	  emp2.Ename="Shabu";
	  emp2.Eid=12346;
	  emp2.Enum=897658980l;
	  emp2.Esalary=17500;
	
	  
	 System.out.println("Employee name : "+emp2.Ename+"\nEmployee id : "+emp2.Eid+"\nEmployee number : "+emp2.Enum+"\nEmployee salary : "
			 +emp2.Esalary);
	 
	 
	 Employee emp3 = new Employee();
	  emp3.Ename="Kalai";
	  emp3.Eid=12545;
	  emp3.Enum=897658890l;
	  emp3.Esalary=17050;
	  
	  
	 System.out.println("Employee name : "+emp3.Ename+"\nEmployee id : "+emp3.Eid+"\nEmployee number : "+emp3.Enum+"\nEmployee salary : "
			 +emp3.Esalary);
	 
	 
	 
	 Employee emp4 = new Employee();
	  emp4.Ename="Renu";
	  emp4.Eid=32345;
	  emp4.Enum=897658830l;
	  emp4.Esalary=27000;
	  
	  
	 System.out.println("Employee name : "+emp4.Ename+"\nEmployee id : "+emp4.Eid+"\nEmployee number : "+emp4.Enum+"\nEmployee salary : "
			 +emp4.Esalary);
	 
	 
	 Employee emp5 = new Employee();
	  emp5.Ename="Loki";
	  emp5.Eid=19345;
	  emp5.Enum=8976582300l;
	  emp5.Esalary=17800;
	  
	 System.out.println("Employee name : "+emp5.Ename+"\nEmployee id : "+emp5.Eid+"\nEmployee number : "+emp5.Enum+"\nEmployee salary : "
			 +emp5.Esalary);
	 
	 
	 
	}

}
