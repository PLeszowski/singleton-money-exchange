package com.company;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by RENT on 2017-06-14.
 */
public class MoneyExchanger {

	private Map<String,ExchangeRate> rates;

	private static MoneyExchanger instance = null;

	private MoneyExchanger(){
		rates = new HashMap<>();
	}

	public static MoneyExchanger getInstance() {
		if (instance == null) {
			instance = new MoneyExchanger();
		}
		return instance;
	}

	public Money buy(BigDecimal amount, String targetCurrency){
		ExchangeRate exchangeRate = rates.get(targetCurrency);
		BigDecimal result = amount.divide(exchangeRate.getBuyPrice(),new MathContext(3));
		return new Money(result, targetCurrency);
	}

	public Money sell(Money money){
		String currency = money.getCurrency();
		BigDecimal amount = money.getAmount();
		ExchangeRate exchangeRate = rates.get(currency);
		BigDecimal result = amount.multiply(exchangeRate.getSellPrice(),new MathContext(3));
		return new Money(result, "PLN");
	}


	public void updateCurencyRate(String currency, ExchangeRate exchangeRate){
		rates.put(currency,exchangeRate);
	}
}
