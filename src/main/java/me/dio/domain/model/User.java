package me.dio.domain.model;

public class User {
	private Long id;
	private String name;
	private Account account;
	private Feature[] feature;
	private Card card;
	private News[] news;
	
	public User(Long id, String name, Account account, Feature[] feature, Card card, News[] news) {
		super();
		this.id = id;
		this.name = name;
		this.account = account;
		this.feature = feature;
		this.card = card;
		this.news = news;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Feature[] getFeature() {
		return feature;
	}
	public void setFeature(Feature[] feature) {
		this.feature = feature;
	}
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	public News[] getNews() {
		return news;
	}
	public void setNews(News[] news) {
		this.news = news;
	}
	public Long getId() {
		return id;
	}
	
	
	
}
