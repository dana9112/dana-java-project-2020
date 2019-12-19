package dana.djp.ticketsite;

import java.sql.Date;
import java.util.Scanner;

public class App3 {
  public static void main(String[] args) {

    Scanner keyScan = new Scanner(System.in);

    class Booking {
      int number;
      String name;
      String day;
      String title;
      String memo;
      Date date;
      int viewCount;
    }

    final int Size = 100;
    Booking[] plays = new Booking[Size];

    String response;

    int count = 0;
    for (int i = 0; i < 100; i++ ) {
      Booking play = new Booking();

      System.out.print("번호: ");
      play.number = keyScan.nextInt();
      keyScan.nextLine();

      System.out.print("공연명: ");
      play.name = keyScan.nextLine();

      System.out.print("관람일시: ");
      play.day = keyScan.nextLine();

      System.out.print("제목: ");
      play.title = keyScan.nextLine();

      System.out.print("내용: ");
      play.memo = keyScan.nextLine();

      play.date = new Date(System.currentTimeMillis());
      play.viewCount = 0;

      plays[i] = play;
      count++;

      System.out.println();

      System.out.print("관람후기를 추가로 작성하시겠습니까?(y/n) ");
      response = keyScan.nextLine();
      if (!response.equalsIgnoreCase("y")) {
        break;
      }
    }

    keyScan.close();
    System.out.println();

    for (int i = 0; i < count; i++) {
      Booking play = plays[i];

      System.out.printf("번호: %d\n공연명: %s\n관람일시: %s\n제목: %s\n내용: %s\n작성일: %s\n조회수: %d\n", 
          play.number, play.name, play.day, play.title, play.memo, play.date, play.viewCount);

    }
  }
}

