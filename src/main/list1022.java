package main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class list1022 {
	static ArrayList<Article> articles;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		articles = new ArrayList<>();
		int views = 0; //조회수
		Article a1 = new Article(1, "제목1", "내용1", views);
		Article a2 = new Article(2, "제목2", "내용2", views);
		Article a3 = new Article(3, "제목3", "내용3", views);

		articles.add(a1);
		articles.add(a2);
		articles.add(a3);

		int no = 4;
		
		
		LocalDateTime dateAndtime = LocalDateTime.now();
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
				a.setId(no);
				no++;

				System.out.println("게시물 제목을 입력해주세요 : ");
				String title = sc.next();
				a.setTitle(title);

				System.out.println("게시물 내용을 입력해주세요 : ");
				String body = sc.next();
				a.setBody(body);

				articles.add(a);
				System.out.println("게시물이 등록되었습니다.");
			}

			if (cmd.equals("list")) {
				for (int i = 0; i < articles.size(); i++) {
					Article article = articles.get(i);

					System.out.println("번호 : " + article.getId());
					System.out.println("제목 : " + article.getTitle());
					System.out.println("작성자 : 익명");
					System.out.println("등록날짜: " + onlyDate);
					System.out.println("조회수: " + article.getViews());
					System.out.println("==================");
				}
			}

			if (cmd.equals("update")) {

				System.out.println("수정할 게시물 선택: ");
				int targetId = sc.nextInt();

				Article target = getArticleById(targetId);

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
				System.out.println("삭제할 게시물 선택 : ");
				int targetId = sc.nextInt();

				Article target = getArticleById(targetId);

				if (target == null) {
					System.out.println("게시물이 존재하지 않습니다.");
				} else {
					articles.remove(target);
				}

			}

			if (cmd.equals("read")) {
				System.out.println("상세보기 할 게시물 선택 : ");
				int targetId = sc.nextInt();

				Article target = getArticleById(targetId);

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
			}

		}

	}


	// Article ver.
	private static Article getArticleById(int targetId) {	
			for(int i = 0; i < articles.size(); i++) {
				int id = articles.get(i).getId();
				
				if(id == targetId) {
					return articles.get(i);
				}
			}
			
			return null;
		}

}