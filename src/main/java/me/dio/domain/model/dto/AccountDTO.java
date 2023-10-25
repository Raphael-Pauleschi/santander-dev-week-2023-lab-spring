package me.dio.domain.model.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;

import me.dio.domain.model.Account;


public class AccountDTO {
	@JsonIgnore
	private Long id;
	
	private String number;
	private String agency;
	private BigDecimal balance;
	private BigDecimal limit;
	
	public Account toModel() {
		Account accountToModel = new Account();
		
		if (id != null) {
			accountToModel.setId(id);
		}
		accountToModel.setAgency(agency);
		accountToModel.setBalance(balance);
		accountToModel.setLimit(limit);
		accountToModel.setNumber(number);
		
		return accountToModel;
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAgency() {
		return agency;
	}
	public void setAgency(String agency) {
		this.agency = agency;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
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
	
	
}
