package main;

import java.util.ArrayList;

public class ArticleDao {
	// Data Access Object.
	private static ArrayList<Article> articles;
	private int no = 4;

	public ArticleDao() {

		articles = new ArrayList<>();
		int views = 0; // 조회수
		Article a1 = new Article(1, "제목1", "내용1", "작성자", views);
		Article a2 = new Article(2, "안녕", "내용2", "작성자", views);
		Article a3 = new Article(3, "안녕3", "내용3", "작성자", views);

		articles.add(a1);
		articles.add(a2);
		articles.add(a3);
	}

	public void insertArticle(Article a) {
		articles.add(a);
		a.setId(no);
		no++;
	}

	public void removeArticle(Article a) {
		articles.remove(a);
	}

	// Article ver.
	public static Article getArticleById(int targetId) {
		for (int i = 0; i < articles.size(); i++) {
			int id = articles.get(i).getId();

			if (id == targetId) {
				return articles.get(i);
			}
		}

		return null;
	}

	public static Article getArticleByTitle(String targetTitle) {
		for (int i = 0; i < articles.size(); i++) {
			String body = articles.get(i).getTitle();
			
			if (body.indexOf(targetTitle) != -1) {
				return articles.get(i);
			}
		}

		return null;

	}

	public ArrayList<Article> getArticles() {
		return articles;
	}
}
