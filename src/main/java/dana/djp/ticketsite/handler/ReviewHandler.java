package dana.djp.ticketsite.handler;

import java.sql.Date;
import java.util.Scanner;
import dana.djp.ticketsite.domain.Review;

public class ReviewHandler {
  
  Review[] reviews = new Review[REVIEW_SIZE];
  int reviewCount = 0;

  
  static final int REVIEW_SIZE = 100;
  public static Scanner keyboard;

  public void addReview() {
    Review review = new Review();

    System.out.print("번호: ");
    review.no = keyboard.nextInt();
    keyboard.nextLine(); // 줄바꿈 기호 제거용

    System.out.print("공연명: ");
    review.name = keyboard.nextLine();

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

  public void listReview() {
    for (int i = 0; i < reviewCount; i++) {
      Review r = reviews[i];
      System.out.printf("%d, %s, %s, %s\n", 
          r.no, r.name, r.viewDate, r.title, r.content, r.today, r.viewCount);
    }
  }
  
  public void detailReview() {
    System.out.println("번호? ");
    int no = keyboard.nextInt();
    keyboard.nextLine();
    
    Review review = null;
    for (int i = 0; i < reviewCount; i++) {
      if (reviews[i].no == no) {
        review = reviews[i];
        break;
      }
    }
    
    if(review == null) {
      System.out.println("게시물 번호가 유효하지 않습니다.");
      return;
    }
    
    System.out.printf("번호: %d\n", review.no);
    System.out.printf("공연명: %s\n", review.name);
    System.out.printf("관람일시: %s\n", review.viewDate);
    System.out.printf("제목: %s\n", review.title);
    System.out.printf("내용: %s\n", review.content);
    System.out.printf("등록일: %s\n", review.today);
    
  }
  
}
