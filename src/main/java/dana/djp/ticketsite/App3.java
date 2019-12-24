package dana.djp.ticketsite;

import java.sql.Date;
import java.util.Scanner;

public class App3 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
  

    
    for (int i = 0; i < SIZE; i++) {  
      Review review = new Review();
      count++;

      System.out.print("번호: ");
      review.no = keyboard.nextInt();
      keyboard.nextLine();

      System.out.print("공연명: ");
      review.name = keyboard.nextLine();

      System.out.print("관람일시: ");
      review.viewDate = Date.valueOf(keyboard.next());

      System.out.print("제목: ");
      review.title = keyboard.nextLine();

      System.out.print("내용: ");
      review.content = keyboard.nextLine();

      review.today = new Date(System.currentTimeMillis());
      review.viewCount = 0;
      
      reviews[i] = review;

      System.out.print("계속 입력하시겠습니까?(Y/n) ");
      String response = keyboard.nextLine();
      if (!response.equalsIgnoreCase("y"))
        break;

      System.out.println();
    }

    System.out.println("---------------------------------");
    for (int i = 0; i < count; i++) {
      Review review = reviews[i];
      System.out.printf("번호: %d\n작성일: %s\n공연명: %s\n관람일시: %s\n제목: %s\n내용: %s\n조회수: %d\n",
          review.no, review.today, review.name, review.viewDate, review.title, review.content, review.viewCount);
    }
    System.out.println();
    keyboard.close();





  }
}

