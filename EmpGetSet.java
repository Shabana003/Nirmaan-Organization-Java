package Day13;
class Employee{
	private String name;
	private int id;
	private int salary;
	private long number;
	
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
	public void setid(int id) {
		this.id=id;
	}
	public int getid() {
		return id;
	}
	public void setsalary(int salary) {
		this.salary=salary;
	}
	public int getsalary() {
		return salary;
	}
	public void setnumber(long number) {
		this.number=number;
	}
	public long getnumber() {
		return number;
	}	
	public String toString() {
		return "Employee name : "+name+"\nEmployee id : "+id+"\nEmployee salary : "+salary+"\nEmployee number : "+number;
	
	}
}
public class EmpGetSet {
	
	public static void main(String[] args) {
		Employee em1=new Employee();
		em1.setname("Pavi");
		System.out.println(em1.getname());
		em1.setid(12345);
		System.out.println(em1.getid());
		em1.setsalary(20000);
		System.out.println(em1.getsalary());
		em1.setnumber(9876543217l);
		System.out.println(em1.getnumber());
		System.out.println(em1);
		System.out.println("");
		
		Employee em2=new Employee();
		em2.setname("kalai");
		System.out.println(em2.getname());
		em2.setid(12344);
		System.out.println(em2.getid());
		em2.setsalary(30000);
		System.out.println(em2.getsalary());
		em2.setnumber(9876543317l);
		System.out.println(em2.getnumber());
		System.out.println(em2);
		System.out.println("");
		
		Employee em3=new Employee();
		em3.setname("Renu");
		System.out.println(em3.getname());
		em3.setid(13345);
		System.out.println(em3.getid());
		em3.setsalary(25000);
		System.out.println(em3.getsalary());
		em3.setnumber(9876543237l);
		System.out.println(em3.getnumber());
		System.out.println(em3);
		System.out.println("");
		
		Employee em4=new Employee();
		em4.setname("Loki");
		System.out.println(em4.getname());
		em4.setid(12745);
		System.out.println(em4.getid());
		em4.setsalary(28000);
		System.out.println(em4.getsalary());
		em4.setnumber(9856553217l);
		System.out.println(em4.getnumber());
		System.out.println(em4);
	
		
		
		
	}

}
