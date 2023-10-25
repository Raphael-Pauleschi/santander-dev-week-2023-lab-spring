package me.dio.domain.model.dto;

import me.dio.domain.model.News;

public class NewsDTO {
	private String icon;
	private String description;
	
	public News toModel() {
		News newsToModel = new News();
		
		newsToModel.setIcon(icon);
		newsToModel.setDescription(description);
		
		return newsToModel;
	}
	
	
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
