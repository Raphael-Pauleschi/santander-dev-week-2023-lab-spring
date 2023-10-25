package me.dio.domain.model.dto;

import java.math.BigDecimal;

import me.dio.domain.model.Card;

public class CardDTO {
	private String number;
	private BigDecimal limit;
	
	public Card toModel() {
		Card cardToModel = new Card();
		 cardToModel.setLimit(limit);
		 cardToModel.setNumber(number);
		return cardToModel;		
				
	}

	public BigDecimal getLimit() {
		return limit;
	}
	public void setLimit(BigDecimal limit) {
		this.limit = limit;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	} 
}
