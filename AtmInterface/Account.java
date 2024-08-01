package com.atmpro;

import java.util.ArrayList;
import java.util.List;

public class Account {

	private String AccountNumber;
	private String Pin;
	private double balance;
	private List<String> transactionHistory;

	public Account(String accountNumber, String pin, double balance) {

		this.AccountNumber = accountNumber;
		this.Pin = pin;
		this.balance = balance;
		this.transactionHistory = new ArrayList<>();
		addTransaction("Account Balance is: Rs." + balance);
	}

	private void addTransaction(String transaction) {
		// TODO Auto-generated method stub
		transactionHistory.add(transaction);
	}

	public List<String> getTransactionHistroy() {
		return transactionHistory;
	}

	public String getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		AccountNumber = accountNumber;
	}

	public String getPin() {
		return Pin;
	}

	public void setPin(String pin) {
		Pin = pin;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
		addTransaction("Balance updateed to:Rs." + balance);
	}

	public boolean validatepin(String Pin) {
		return this.Pin.equals(Pin);
	}

}
