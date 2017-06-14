package com.company;
import java.math.BigDecimal;

/**
 * Created by RENT on 2017-06-14.
 */
public class ExchangeRate {

	BigDecimal buyPrice;
	BigDecimal sellPrice;

	public ExchangeRate(BigDecimal buyPrice, BigDecimal sellPrice) {
		this.buyPrice = buyPrice;
		this.sellPrice = sellPrice;
	}

	public BigDecimal getBuyPrice() {
		return buyPrice;
	}

	public BigDecimal getSellPrice() {
		return sellPrice;
	}
}
