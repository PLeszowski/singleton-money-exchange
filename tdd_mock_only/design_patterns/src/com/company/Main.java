package com.company;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        MoneyExchanger moneyExchanger = MoneyExchanger.getInstance();
		Money exchangedMoney;

        moneyExchanger.updateCurencyRate("USD", new ExchangeRate(new BigDecimal(3.72),new BigDecimal(3.75)));
		moneyExchanger.updateCurencyRate("EUR", new ExchangeRate(new BigDecimal(4.17),new BigDecimal(4.19)));
		moneyExchanger.updateCurencyRate("GBP", new ExchangeRate(new BigDecimal(4.74),new BigDecimal(4.78)));
		moneyExchanger.updateCurencyRate("CHF", new ExchangeRate(new BigDecimal(3.84),new BigDecimal(3.87)));

		System.out.println("BUY:");
		exchangedMoney = moneyExchanger.buy(new BigDecimal(100.00),"USD");
		System.out.println(exchangedMoney);
		exchangedMoney = moneyExchanger.buy(new BigDecimal(100.00),"EUR");
		System.out.println(exchangedMoney);
		exchangedMoney = moneyExchanger.buy(new BigDecimal(100.00),"GBP");
		System.out.println(exchangedMoney);
		exchangedMoney = moneyExchanger.buy(new BigDecimal(100.00),"CHF");
		System.out.println(exchangedMoney);


		Money usd = Money.of("100", "USD");

		System.out.println("SELL:");
		exchangedMoney = moneyExchanger.sell(usd);
		System.out.println(exchangedMoney);

    }
}
