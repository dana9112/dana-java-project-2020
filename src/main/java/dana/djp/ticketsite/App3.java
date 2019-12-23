package dana.djp.ticketsite;

import java.sql.Date;
import java.util.Scanner;

public class App3 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    final int SIZE = 100;

    int[] no = new int[SIZE];
    String[] name = new String[SIZE];
    Date[] viewDate = new Date[SIZE];
    String[] title = new String[SIZE];
    String[] content = new String[SIZE];
    Date[] today = new Date[SIZE];
    int[] viewCount = new int[SIZE];

    int count = 0;
    for (int i = 0; i < SIZE; i++) {
      count++;

      System.out.print("번호: ");
      no[i] = keyboard.nextInt();
      keyboard.nextLine();

      System.out.print("공연명: ");
      name[i] = keyboard.nextLine();

      System.out.print("관람일시: ");
      viewDate[i] = Date.valueOf(keyboard.next());
      keyboard.nextLine();

      System.out.print("제목: ");
      title[i] = keyboard.nextLine();

      System.out.print("내용: ");
      content[i] = keyboard.nextLine();

      today[i] = new Date(System.currentTimeMillis());
      viewCount[i] = 0;

      System.out.print("계속 입력하시겠습니까?(Y/n) ");
      String response = keyboard.nextLine();
      if (!response.equalsIgnoreCase("y"))
        break;

      System.out.println();
    }

    System.out.println("---------------------------------");
    for (int i = 0; i < count; i++) {
      System.out.printf("번호: %d\n작성일: %s\n공연명: %s\n관람일시: %s\n제목: %s\n내용: %s\n조회수: %d\n",
          no[i], today[i], name[i], name[i], title[i], content[i], viewCount[i]);
    }
    System.out.println();
    keyboard.close();





  }
}

