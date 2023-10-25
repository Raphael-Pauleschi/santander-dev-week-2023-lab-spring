package me.dio.domain.model.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;

import me.dio.domain.model.Feature;
import me.dio.domain.model.News;
import me.dio.domain.model.User;

public class UserDTO {
	@JsonIgnore
	private Long id;
	private String name;
	private AccountDTO account;
	private CardDTO card;
	private List<FeatureDTO> features;
	private List<NewsDTO> news;
	

	public User toModel() {
	    User userToModel = new User();
	    if (id != null) {
			userToModel.setId(id);
		}
	    userToModel.setName(name);
	    userToModel.setCard(card.toModel());
	    userToModel.setAccount(account.toModel());
	    userToModel.setFeatures(convertFeaturesDTOToModel(features)); // Convert features list
	    userToModel.setNews(convertNewsDTOToModel(news)); // Convert news list
	    
	    return userToModel;
	}

	private List<Feature> convertFeaturesDTOToModel(List<FeatureDTO> featureDTOs) {
	    List<Feature> features = new ArrayList<>();
	    
	    for (FeatureDTO featureDTO : featureDTOs) {
	        features.add(featureDTO.toModel());
	    }
	    
	    return features;
	}

	private List<News> convertNewsDTOToModel(List<NewsDTO> newsDTOs) {
	    List<News> newsList = new ArrayList<>();
	    
	    for (NewsDTO newsDTO : newsDTOs) {
	        newsList.add(newsDTO.toModel());
	    }
	    
	    return newsList;
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
	public CardDTO getCard() {
		return card;
	}
	public void setCard(CardDTO card) {
		this.card = card;
	}
	public List<FeatureDTO> getFeatures() {
		return features;
	}
	public void setFeatures(List<FeatureDTO> features) {
		this.features = features;
	}
	public List<NewsDTO> getNews() {
		return news;
	}
	public void setNews(List<NewsDTO> news) {
		this.news = news;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
