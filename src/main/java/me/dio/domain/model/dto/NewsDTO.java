package me.dio.domain.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import me.dio.domain.model.News;

public class NewsDTO {
	@JsonIgnore
	private Long id;
	private String icon;
	private String description;
	
	public News toModel() {
		News newsToModel = new News();
		if (id != null) {
			newsToModel.setId(id);
		}
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
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
