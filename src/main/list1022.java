package main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class list1022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArticleDao dao = new ArticleDao();

		LocalDate onlyDate = LocalDate.now();

		while (true) {
			System.out.print("명령어 입력 : ");
			String cmd = sc.next();

			if (cmd.equals("exit")) {
				System.out.println("종료");
				break;
			}

			if (cmd.equals("add")) {

				Article a = new Article();

				System.out.println("게시물 제목을 입력해주세요 : ");
				String title = sc.next();
				a.setTitle(title);

				System.out.println("게시물 내용을 입력해주세요 : ");
				String body = sc.next();
				a.setBody(body);

				dao.insertArticle(a);
				System.out.println("게시물이 등록되었습니다.");
			}

			if (cmd.equals("list")) {
				ArrayList<Article> articles = dao.getArticles();
				printAricles(searchedArticles);
			}

			if (cmd.equals("update")) {

				System.out.println("수정할 게시물 선택: ");
				int targetId = sc.nextInt();

				Article target = dao.getArticleById(targetId);

				if (target == null) {
					System.out.println("없는 게시물입니다.");
				} else {
					System.out.println("게시물 제목을 입력해주세요 : ");
					String newTitle = sc.next();
					System.out.println("게시물 내용을 입력해주세요: ");
					String newBody = sc.next();

					target.setTitle(newTitle);
					target.setBody(newBody);

					break;
				}
			}

			if (cmd.equals("delete")) {
				ArrayList<Article> articles = dao.getArticles();
				System.out.println("삭제할 게시물 선택 : ");
				int targetId = sc.nextInt();

				Article target = dao.getArticleById(targetId);

				if (target == null) {
					System.out.println("게시물이 존재하지 않습니다.");
				} else {
					dao.removeArticle(target);
				}

			}

			if (cmd.equals("read")) {
				System.out.println("상세보기 할 게시물 선택 : ");
				int targetId = sc.nextInt();

				Article target = dao.getArticleById(targetId);

				if (target == null) {
					System.out.println("게시물이 존재하지 않습니다.");
				} else {
					System.out.println("=====" + target.getId() + "=====");
					System.out.println("번호 : " + target.getId());
					System.out.println("제목 : " + target.getTitle());
					System.out.println("내용 : " + target.getBody());
					System.out.println("=========================");
					target.setViews(target.getViews() + 1);
				}
				if (cmd.equals("search")) {
					System.out.println("검색 항목을 선택해주세요 : 1. 제목, 2. 내용, 3. 제목 + 내용, 4. 작성자");
					System.out.println("검색키워드를 입력해주세요 : ");
					String keyword = sc.next();
					ArrayList<Article> searchedArticles = new ArrayList<>();

//					if (choice == 1) {
//						System.out.println("검색키워드를 입력해주세요 : ");
//						String targetTitle = sc.next();
//
//						Article target = dao.getSearchedArticleByTitle(targetTitle);
//
//						if (target == null) {
//							System.out.println("게시물이 존재하지 않습니다.");
//						} else {
//							System.out.println("번호 : " + target.getId());
//							System.out.println("제목 : " + target.getTitle());
//
//						}
//
//					} else if (choice == 2) {
//						System.out.println("검색키워드를 입력해주세요 : ");
//						String targetBody = sc.next();
//
//						Article target = dao.getSearchedArticleByBody(targetBody);
//
//						if (target == null) {
//							System.out.println("게시물이 존재하지 않습니다.");
//						} else {
//							System.out.println("번호 : " + target.getId());
//							System.out.println("제목 : " + target.getTitle());
//
//						}
//					} else if (choice == 3) {
//						System.out.println("검색키워드를 입력해주세요 : ");
//						String targetBody = sc.next();
//
//						if (target == null) {
//							System.out.println("게시물이 존재하지 않습니다.");
//						} else {
//							System.out.println("번호 : " + target.getId());
//							System.out.println("제목 : " + target.getTitle());
//
//						}
//					} else {
//						System.out.println("검색키워드를 입력해주세요 : ");
//					}

				}

			}

		}

	}

	private void printArticles(ArrayList<Article> articleList) {
		for (int i = 0; i < articleList.size(); i++) {
			Article article = articleList.get(i);

			System.out.println("번호 : " + article.getId());
			System.out.println("제목 : " + article.getTitle());
			System.out.println("작성자 : " + article.getNickname());
			System.out.println("등록날짜: " + onlyDate);
			System.out.println("조회수: " + article.getViews());
			System.out.println("==================");
		}
	}
}