package School;

public class Teacher {
	int id;
	String name;
	long phno;
	double salary;
	public Teacher() {

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
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", phno=" + phno + ", salary=" + salary + "]";
	}
	public Teacher(int id, String name, long phno, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.phno = phno;
		this.salary = salary;
	}
}
