package dana.djp.ticketsite.handler;

import java.sql.Date;
import java.util.Scanner;
import dana.djp.ticketsite.domain.Review;

public class ReviewHandler {
  
  Review[] reviews;
  int reviewCount = 0;

  Scanner input;
  
  static final int REVIEW_SIZE = 100;

  
  public ReviewHandler(Scanner input) {
    this.input = input;
    this.reviews = new Review[REVIEW_SIZE];
  }
  
  public ReviewHandler(Scanner input, int capacity) {
    this.input = input;
    if (capacity < REVIEW_SIZE || capacity < 10000) {
      this.reviews = new Review[REVIEW_SIZE];
    } else {
      this.reviews = new Review[capacity];
    }
  }
  
  
  public void addReview() {
    Review review = new Review();

    System.out.print("번호: ");
    review.setNo(input.nextInt());
    input.nextLine(); // 줄바꿈 기호 제거용

    System.out.print("공연명: ");
    review.setName(input.nextLine());

    System.out.print("관람일시: ");
    review.setViewDate(Date.valueOf(input.nextLine()));

    System.out.print("제목: ");
    review.setTitle(input.nextLine());

    System.out.print("내용: ");
    review.setContent(input.nextLine());

    review.setToday(new Date(System.currentTimeMillis()));
    review.setViewCount(0);

    reviews[reviewCount++] = review;
    System.out.println("저장되었습니다.");
  }

  public void listReview() {
    for (int i = 0; i < reviewCount; i++) {
      Review r = reviews[i];
      System.out.printf("%d, %s, %s, %s\n", 
          r.getNo(), r.getName(), r.getViewDate(), r.getTitle(), r.getContent(), r.getToday(), r.getViewCount());
    }
  }
  
  public void detailReview() {
    System.out.println("번호? ");
    int no = input.nextInt();
    input.nextLine();
    
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
        
    System.out.printf("번호: %d\n", review.getNo());
    System.out.printf("공연명: %s\n", review.getName());
    System.out.printf("관람일시: %s\n", review.getViewDate());
    System.out.printf("제목: %s\n", review.getTitle());
    System.out.printf("내용: %s\n", review.getContent());
    System.out.printf("등록일: %s\n", review.getToday());
    
  }
  
}
