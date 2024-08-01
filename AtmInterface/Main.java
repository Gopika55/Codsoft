package com.atmpro;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		AtmInterface atm = new AtmInterface();
		System.out.println("Enter your Account Number");
		String accountnumber = sc.nextLine();

		System.out.println("Enter your pin number");
		String pin = sc.nextLine();

		if (atm.login(accountnumber, pin)) {
			atm.displaymenu();
		} else {
			System.out.println("Invalid account number or pin");
		}

		sc.close();
	}
}
