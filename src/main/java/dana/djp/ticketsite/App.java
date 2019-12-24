package dana.djp.ticketsite;

import java.sql.Date;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    
    Scanner keyboard = new Scanner(System.in);
    
    class Information {
      int no;
      String genre;
      String name;
      String location;
      Date startDate;
      Date endDate;
      int runningTime;
      int age;
    }
    
    final int INFORMATION_SIZE= 100;
    Information[] informations = new Information[INFORMATION_SIZE];
    int informationCount = 0;
    
    class Member {
      int playNumber;
      String reservationNumber;
      String ticketSort;
      Date viewDate;
      String name;
      String email;
      String phone;
    }
    
    final int MEMBER_SIZE = 100;
    Member[] members = new Member[MEMBER_SIZE];
    int memberCount = 0;
    
    
    class Review {
      int no;
      String name;
      Date viewDate;
      String title;
      String content;
      Date today;
      int viewCount;
    }
    
    final int REVIEW_SIZE = 100;
    Review[] reviews = new Review[REVIEW_SIZE];
    int reviewCount = 0;
    
    
    
    for (int i = 0; i < INFORMATION_SIZE; i++) {
      informationCount++;
      
      Information information = new Information();
      
      System.out.print("번호: ");
      information.no = keyboard.nextInt();
      keyboard.nextLine();
      
      System.out.print("장르: ");
      information.genre = keyboard.nextLine();
      
      System.out.print("공연명: ");
      information.name = keyboard.nextLine();
      
      System.out.print("장소: ");
      information.location = keyboard.nextLine();
      
      System.out.print("공연시작: ");
      information.startDate = Date.valueOf(keyboard.next());
      
      System.out.print("공연종료: ");
      information.endDate = Date.valueOf(keyboard.next());
      
      System.out.print("러닝타임: ");
      information.runningTime = keyboard.nextInt();
      
      System.out.print("관람연령: ");
      information.age = keyboard.nextInt();
      keyboard.nextLine();
      
      informations[i] = information;
      
      
      System.out.print("계속 입력하시겠습니까?(Y/n) ");
      String response = keyboard.nextLine();
      if (!response.equalsIgnoreCase("y")) 
        break;
    
      System.out.println();
      
    }
    System.out.println();

    
    for (int i = 0; i < count; i++) {
      Information information = informations[i];
      System.out.printf("번호: %d\n장르: %s\n공연명: %s\n장소: %s\n공연기간: %s ~ %s\n%d 시간\n만 %d 이상\n",
          information.no, information.genre, information.name, information.location, information.startDate, information.endDate, information.runningTime, information.age);
      System.out.println();
    }
    
    keyboard.close();
    

  } // main() end
} // class() end

