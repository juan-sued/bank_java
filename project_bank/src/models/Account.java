package models;

public class Account {
	
	float balance;
	String account;
	


	public  Account(String account) {
		balance = 0;
		
		this.account = account;  
	}
	
	public void DepositIn (float deposit) {
		//depositIn = post money 
		// deposit = depósito
		
		balance += deposit;
		
	}
	
	public void Withdraw (float withdraw) {
		// withdraw = get money
		
		if (withdraw > balance) {
			System.out.println("Erro! Sem saldo pro churras.");	
		}
		
		balance -=  withdraw;
	
	}
	
	public  String toString() {
		
		return  account + ", seu saldo é: R$" + balance ;
		
	}
	
	
	
	
	
}
