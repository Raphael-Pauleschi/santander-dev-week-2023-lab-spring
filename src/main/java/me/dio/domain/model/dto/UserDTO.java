package me.dio.domain.model.dto;

import java.util.List;


import me.dio.domain.model.Account;
import me.dio.domain.model.Card;
import me.dio.domain.model.Feature;
import me.dio.domain.model.News;
import me.dio.domain.model.User;

public class UserDTO {
	private String name;
	private AccountDTO account;
	private Card card;
	private List<Feature> features;
	private List<News> news;
	

	public User toModel() {
		User userToModel = new User();
		
		userToModel.setName(name);
	
		userToModel.setCard(card);
		userToModel.setAccount(account.toModel());
		userToModel.setFeatures(features);
		userToModel.setNews(news);
		
		return userToModel;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AccountDTO getAccount() {
		return account;
	}
	public void setAccount(AccountDTO account) {
		this.account = account;
	}
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	public List<Feature> getFeatures() {
		return features;
	}
	public void setFeatures(List<Feature> features) {
		this.features = features;
	}
	public List<News> getNews() {
		return news;
	}
	public void setNews(List<News> news) {
		this.news = news;
	}
	
}
