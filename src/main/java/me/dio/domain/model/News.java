package me.dio.domain.model;

public class News {
	private Long id;
	private String icon;
	private String description;
	
	public News(Long id, String icon, String description) {
		super();
		this.id = id;
		this.icon = icon;
		this.description = description;
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
