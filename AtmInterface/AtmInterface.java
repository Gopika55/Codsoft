package com.atmpro;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AtmInterface {
	private Map<String, Account> accounts;
	private Account currentAccount;

	public AtmInterface() {
		accounts = new HashMap<>();
		accounts.put("123456", new Account("123456", "1234", 1000.00));
		accounts.put("994413", new Account("994413", "1235", 10000.00));
		accounts.put("984264", new Account("984264", "1236", 50000.00));
		accounts.put("987654", new Account("987654", "1237", 2000.00));
	}

	public boolean login(String accountNumber, String pin) {
		Account account = accounts.get(accountNumber);

		if (account != null && account.validatepin(pin)) {
			currentAccount = account;
			return true;
		}
		return false;
	}

	public void displaymenu() {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Welcome to GS ATM");
			System.out.println("1.Check Balance");
			System.out.println("2.Deposit");
			System.out.println("3.Withdraw");
			System.out.println("4.Transaction History");
			System.out.println("5.exit");

			System.out.println("Enter your choice");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				checkBalance();
				break;
			case 2:
				deposit();
				break;
			case 3:
				withdraw();
				break;
			case 4:
				viewTransactionHistory();
				break;
			case 5:
				System.out.println("Thank you for using GS Atm");
				sc.close();
				return;
			default:
				System.out.println("Invalid choice.Please TRY AGAIN...!");

			}

		}

	}

	private void withdraw() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount to Withdraw");
		double amount = sc.nextDouble();

		if (amount > 0 && amount <= currentAccount.getBalance()) {
			currentAccount.setBalance(currentAccount.getBalance() - amount);
			System.out.println("withdrew Amount is: Rs." + amount);

			checkBalance();
		} else {
			System.out.println("Invalid amount or Insufficient balance");

		}
	}

	private void deposit() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount to deposit");
		double amount = sc.nextDouble();

		if (amount > 0) {
			currentAccount.setBalance(currentAccount.getBalance() + amount);
			System.out.println("Deposited Amount is : Rs." + amount);
			checkBalance();

		}

		else {
			System.out.println("Invalid Amount");
		}
	}

	private void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("Your Balance is: Rs." + currentAccount.getBalance());

	}

	private void viewTransactionHistory() {
		System.out.println("Transaction histroy:");
		for (String transaction : currentAccount.getTransactionHistroy()) {
			System.out.println(transaction);
		}
	}
}
