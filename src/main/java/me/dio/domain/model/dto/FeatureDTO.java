package me.dio.domain.model.dto;

import me.dio.domain.model.Feature;

public class FeatureDTO {
	private String icon;
	private String description;
	
	public Feature toModel() {
		Feature featureToModel = new Feature();
		
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
	
	
}
