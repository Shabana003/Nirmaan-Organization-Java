package BankManagement;

import java.util.Scanner;

public class BankUI {
	public static void main(String[] args) {
		Bank bank=new Bank();
		boolean isWrk=true;
		
		while(isWrk) {
			Scanner	sc=new Scanner(System.in);
			System.out.println("Enter 1 for add amount");
			System.out.println("Enter 2 for withdraw");
			System.out.println("Enter 3 for show");
			System.out.println("Enter 4 for exit");
			int key=sc.nextInt();
			System.out.println("Enter pin");
			int pin=sc.nextInt();
			
			if(pin==bank.getPin()) {
				if(key==1) {
					System.out.println("Enter amount to add");
					double amount = sc.nextInt();
					bank.setBalance(bank.getBalance()+amount);
					}
				else if(key==2) {
					System.out.println("Enter amount");
					double amount=sc.nextInt();
					if(bank.getBalance()>=amount) {
						bank.setBalance(bank.getBalance()-amount);
					}
					else {
						System.out.println("Invalid amount");
					}

				
			}else if(key==3) {
				System.out.println(bank);
			}else if(key==4) {
				isWrk=false;
				System.out.println("Thank you");
			}else {
				System.out.println("Enter corret choice");
			}
			}else {
				isWrk=false;
				System.out.println("Invalid pin");
			}
	}

}
	}

