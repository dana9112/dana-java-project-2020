package dana.djp.ticketsite;

import java.sql.Date;
import java.util.Scanner;

public class App3 {
  public static void main(String[] args) {
    
    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("번호: ");
    int no = keyboard.nextInt();
    keyboard.nextLine();
    
    System.out.print("공연명: ");
    String name = keyboard.nextLine();
    
    System.out.print("관람일시: ");
    Date viewDate = Date.valueOf(keyboard.next());
    keyboard.nextLine();
    
    System.out.print("제목: ");
    String title = keyboard.nextLine();
    
    System.out.print("내용: ");
    String content = keyboard.nextLine();
    
    Date today = new Date(System.currentTimeMillis());
    int count = 0;
    
    keyboard.close();
    System.out.println();
    
    System.out.printf("번호: %d\n", no);
    System.out.printf("작성일: %s\n", today);
    System.out.printf("공연명: %s\n", name);
    System.out.printf("관람일시: %s\n", viewDate);
    System.out.printf("제목: %s\n", title);
    System.out.printf("내용: %s\n", content);
    System.out.printf("조회수: %d\n", count);
    

    
    
  }
}

