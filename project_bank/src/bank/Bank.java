package bank;

import java.util.Scanner;

import models.Account;

public class Bank {

	public static void main(String[] args) {
		
		System.out.println("Digite seu nome para criar uma nova conta...");
		
		Scanner input = new Scanner(System.in);
		
		String name = input.next();
		
		Account user1 = new Account(name);
		
		float deposit = input.nextFloat();
		s
		System.out.println(user1.toString());
	
	 
	
	 
	}
}
