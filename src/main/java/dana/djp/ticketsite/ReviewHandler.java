package dana.djp.ticketsite;

import java.sql.Date;
import java.util.Scanner;

public class ReviewHandler {

  static class Review {
    int no;
    String name;
    Date viewDate;
    String title;
    String content;
    Date today;
    int viewCount;
  }

  static final int REVIEW_SIZE = 100;
  static Review[] reviews = new Review[REVIEW_SIZE];
  static int reviewCount = 0;
  public static Scanner keyboard;

  public static void addReview() {
    Review review = new Review();

    System.out.print("번호: ");
    review.no = keyboard.nextInt();
    keyboard.nextLine(); // 줄바꿈 기호 제거용

    System.out.print("공연명: ");
    review.title = keyboard.nextLine();

    System.out.print("관람일시: ");
    review.viewDate = Date.valueOf(keyboard.nextLine());

    System.out.print("제목: ");
    review.title = keyboard.nextLine();

    System.out.print("내용: ");
    review.title = keyboard.nextLine();

    review.today = new Date(System.currentTimeMillis());
    review.viewCount = 0;

    reviews[reviewCount++] = review;
    System.out.println("저장되었습니다.");
  }

  public static void listReview() {
    for (int i = 0; i < reviewCount; i++) {
      Review r = reviews[i];
      System.out.printf("%d, %s, %s, %d\n", 
          r.no, r.name, r.viewDate, r.title, r.content, r.today, r.viewCount);
    }
  }

}
