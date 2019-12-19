package dana.djp.ticketsite;

import java.sql.Date;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    
    class Infor {
      String genre;
      String name;
      String location;
      Date startDate;
      Date endDate;
      int runnigTime;
      int age;
      String introduce;
    }
    
    String response;
    
    final int Size = 100;
    Infor[] infos = new Infor[Size];
    
    
    int count = 0;
    for(int i = 0; i < Size; i++) {
      Infor info = new Infor();
      
      count++;

      System.out.print("장르: ");
      info.genre = keyboard.nextLine();
          
      System.out.print("공연명: ");
      info.name = keyboard.nextLine();
      
      System.out.print("장소: ");
      info.location = keyboard.nextLine();
      
      System.out.print("공연시작: ");
      info.startDate = Date.valueOf(keyboard.next());
      
      System.out.print("공연종료: ");
      info.endDate = Date.valueOf(keyboard.next());
      
      System.out.print("러닝타임: ");
      info.runnigTime = keyboard.nextInt();
      
      System.out.print("관람연령: ");
      info.age = keyboard.nextInt();
      
      keyboard.nextLine();
      
      System.out.print("공연소개: ");
      info.introduce = keyboard.nextLine();
      
      infos[i] = info;
      
      System.out.print("계속 작성하시겠습니까? (Y/n)");
      response = keyboard.nextLine();
      if (!response.equalsIgnoreCase("y")) {
        break;
      }
      
      
      
    }
   
    keyboard.close();
    
    for (int i = 0; i < count; i++) {
      Infor info = infos[i];
      System.out.printf("장르: %s\n공연명: %s\n장소: %s\n공연기간: %s ~ %s 분\n"
          + "러닝타임: %d시간\n관람연령: 만 %d세 이상\n공연소개: %s\n", 
          info.genre, info.name, info.location, info.startDate, info.endDate, info.runnigTime, info.age, info.introduce);
      
    }
  }
}
