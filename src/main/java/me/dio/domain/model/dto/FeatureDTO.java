package me.dio.domain.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import me.dio.domain.model.Feature;

public class FeatureDTO {
	@JsonIgnore
	private Long id;
	private String icon;
	private String description;
	
	public Feature toModel() {
		Feature featureToModel = new Feature();
		if (id != null) {
			featureToModel.setId(id);
		}
		featureToModel.setIcon(icon);
		featureToModel.setDescription(description);
		
		return featureToModel;
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
