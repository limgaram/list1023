package main;

public class Article {

	private int id;
	private String title;
	private String body;
	private int views;
	

	public Article() {

	}

	public Article(int id, String title, String body, int views) {
		this.id = id;
		this.title = title;
		this.body = body;
		this.views = views;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	public int getViews() {
		return views;
	}
	
	public void setViews(int views) {
		this.views = views;
	}
}