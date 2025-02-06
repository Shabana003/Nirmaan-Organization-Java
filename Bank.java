package BankManagement;

public class Bank {
	private int id=1234;
	private String name="Shabana";
	private double balance=5000;
	private int pin=9129;
	
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
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Bank [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	public Bank(int id, String name, double balance, int pin) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.pin = pin;
	}
	public Bank() {
		super();
	}

}
