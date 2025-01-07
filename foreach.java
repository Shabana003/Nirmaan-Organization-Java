package Day11;

import java.util.Scanner;

public class foreach {
	 public String name="kalai";
	boolean Isvalid(int age) {
		if((age>=18)&&(age<=100)){
			return true;
		}
		return false;
		
	}
	
	
	public static void main(String[] args) {
		foreach fe=new foreach();
		int nums[]= {10,20,30,40,50};
	for(int num:nums) {
		System.out.println(num);
	}
	int num1[]=new int[6];
	num1[0]=10;
	num1[1]=20;
	num1[2]=30;
	num1[3]=40;
	num1[4]=50;
	num1[5]=60;
	for(int number:num1) {
	   System.out.println(number);
	}
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your age : ");
	int age=sc.nextInt();	
	
	if(fe.Isvalid(age)) {
		System.out.println("Your are eligible");
		
	}else {
		System.out.println("Your are not eligible");
		
	}
	}
	

}
