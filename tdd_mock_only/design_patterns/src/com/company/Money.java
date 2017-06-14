package com.company;

import java.math.BigDecimal;

/**
 * Created by RENT on 2017-06-14.
 */
public class Money {

	BigDecimal amount;
	String currency;

	public Money(BigDecimal amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public String getCurrency() {
		return currency;
	}

	public static Money of (String amount, String currency){
		return new Money (new BigDecimal(amount), currency);
	}

	@Override
	public String toString() {
		return amount + " " + currency;
	}
}
