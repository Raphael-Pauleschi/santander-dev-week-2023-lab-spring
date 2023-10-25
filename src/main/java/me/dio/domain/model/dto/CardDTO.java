package me.dio.domain.model.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;

import me.dio.domain.model.Card;

public class CardDTO {
	@JsonIgnore
	private Long id;
	private String number;
	private BigDecimal limit;
	
	public Card toModel() {
		Card cardToModel = new Card();
		
		if (id != null) {
			cardToModel.setId(id);
		}
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
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
