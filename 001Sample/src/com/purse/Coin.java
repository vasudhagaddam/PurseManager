package com.purse;

public class Coin {
	private int amount;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Coin() {
		this.amount=1;
		
	}

	public Coin(int amount) {
		
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Coin [amount=" + amount + "]";
	}
	
	

}
