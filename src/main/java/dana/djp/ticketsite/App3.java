package dana.djp.ticketsite;
import java.sql.Date;
import java.util.Scanner;

public class App3 {
  public static void main(String[] args) {
    
    Scanner keyScan = new Scanner(System.in);
    
    int[] number = new int[100];
    String[] name = new String[100];
    String[] day = new String[100];
    String[] title = new String[100];
    String[] memo = new String[100];
    Date[] date = new Date[100];
    int[] viewCount = new int[100];
    String response;
    
    int count = 0;
    for (int i = 0; i < 100; i++ ) {
      System.out.print("번호: ");
      number[i] = keyScan.nextInt();
      keyScan.nextLine();
      
      System.out.print("공연명: ");
      name[i] = keyScan.nextLine();
      
      System.out.print("관람일시: ");
      day[i] = keyScan.nextLine();
      
      System.out.print("제목: ");
      title[i] = keyScan.nextLine();
      
      System.out.print("내용: ");
      memo[i] = keyScan.nextLine();
      
      date[i] = new Date(System.currentTimeMillis());
      viewCount[i] = 0;
      
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
      System.out.printf("번호: %d\n공연명: %s\n관람일시: %s\n제목: %s\n내용: %s\n작성일: %s\n조회수: %d\n", 
          number[i], name[i], day[i], title[i], memo[i], date[i], viewCount[i]);
    
    }
    
    
  }
}
