package main;

public class Article {

	private int id;
	private String title;
	private String body;
	private int views;
	String nickname;

	public Article() {

	}

	public Article(int id, String title, String body, String nickname, int views) {
		this.id = id;
		this.title = title;
		this.body = body;
		this.views = views;
		this.nickname = nickname;

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

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
}