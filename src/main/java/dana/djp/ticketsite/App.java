package dana.djp.ticketsite;

import java.sql.Date;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("장르: ");
    String genre = keyboard.nextLine();
        
    System.out.print("공연명: ");
    String name = keyboard.nextLine();
    
    System.out.print("장소: ");
    String location = keyboard.nextLine();
    
    System.out.print("공연시작: ");
    Date startdate = Date.valueOf(keyboard.next());
    
    System.out.print("공연종료: ");
    Date enddate = Date.valueOf(keyboard.next());
    
    System.out.print("러닝타임: ");
    int runningtime = keyboard.nextInt();
    
    System.out.print("관람연령: ");
    int age = keyboard.nextInt();
    
    keyboard.nextLine();
    
    System.out.print("공연소개: ");
    String introduce = keyboard.nextLine();
    
    System.out.println();
    
    System.out.printf("장르: %s\n", genre);
    System.out.printf("공연명: %s\n", name);
    System.out.printf("장소: %s\n", location);
    System.out.printf("공연기간: %s ~ %s 분\n", startdate, enddate);
    System.out.printf("러닝타임: %d 시간\n ", runningtime);
    System.out.printf("관람연령: 만 %d세 이상\n", age);
    System.out.printf("공연소개: %s\n", introduce);
    
    keyboard.close();
    
    
    
    
    
  }
}
