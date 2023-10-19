package me.dio.domain.model;

import java.math.BigDecimal;

public class Card {
	private Long id;
	private String number;
	private BigDecimal limit;
	
	public Card(Long id, String number, BigDecimal limit) {
		super();
		this.id = id;
		this.number = number;
		this.limit = limit;
	}
	public BigDecimal getLimit() {
		return limit;
	}
	public void setLimit(BigDecimal limit) {
		this.limit = limit;
	}
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	} 
	
	
}
