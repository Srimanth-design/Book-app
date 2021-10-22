package com.training.AssignmentsDay2;

public class Current extends Account {

	public Current(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withdraw(int amount) {
		// TODO Auto-generated method stub
		try {
			if (amount > balance) {
				System.out.println("Low balance");
			} else {
				balance = balance - amount;
				System.out.println("Amount withdrawn: " + amount);
				System.out.println("The balance amount: " + balance);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	void deposit(int amount) {
		// TODO Auto-generated method stub

		System.out.println("Amount deposited: " + amount);
		System.out.println("Updated balance: " + (amount + balance));
	}

}
