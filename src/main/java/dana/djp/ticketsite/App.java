package dana.djp.ticketsite;

import java.sql.Date;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    
    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("번호: ");
    int no = keyboard.nextInt();
    keyboard.nextLine();
    
    System.out.print("장르: ");
    String genre = keyboard.nextLine();
    
    System.out.print("공연명: ");
    String name = keyboard.nextLine();
    
    System.out.print("장소: ");
    String location = keyboard.nextLine();
    
    System.out.print("공연시작: ");
    Date startDate = Date.valueOf(keyboard.next());
    
    System.out.print("공연종료: ");
    Date endDate = Date.valueOf(keyboard.next());
    
    System.out.print("러닝타임: ");
    int runningTime = keyboard.nextInt();
    
    System.out.print("관람연령: ");
    int age = keyboard.nextInt();
    
    System.out.println();
    keyboard.nextLine();
    
    System.out.printf("번호: %d\n", no);
    System.out.printf("장르: %s\n", genre);
    System.out.printf("공연명: %s\n", name);
    System.out.printf("장소: %s\n", location);
    System.out.printf("공연기간: %s ~ %s\n", startDate, endDate);
    System.out.printf("러닝타임: %d 시간\n", runningTime);
    System.out.printf("관람연령: 만 %d 이상\n", age);
    
    keyboard.close();
    

  } // main() end
} // class() end

