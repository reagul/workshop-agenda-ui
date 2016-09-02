package io.spring.pivotal.workshop.ui.services;

public class Resource {

	private String title;
	private String url;

	public Resource(String title, String url) {
		this.title = title;
		this.url = url;
	}

	public Resource() {
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
