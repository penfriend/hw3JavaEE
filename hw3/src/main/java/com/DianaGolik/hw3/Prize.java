package com.DianaGolik.hw3;

import org.springframework.stereotype.Component;

@Component
public class Prize {
	private int amount;

	public Prize() {
		// TODO Auto-generated constructor stub
		amount=10000;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String toString() {
		return ""+amount;
	}

}
