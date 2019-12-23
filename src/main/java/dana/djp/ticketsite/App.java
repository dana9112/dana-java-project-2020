package dana.djp.ticketsite;

import java.sql.Date;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    
    Scanner keyboard = new Scanner(System.in);
    
    final int SIZE= 10;
    
    int[] no = new int[SIZE];
    String[] genre = new String[SIZE];
    String[] name = new String[SIZE];
    String[] location = new String[SIZE];
    Date[] startDate = new Date[SIZE];
    Date[] endDate = new Date[SIZE];
    int[] runningTime = new int[SIZE];
    int[] age = new int[SIZE];
    
    int count = 0;
    for (int i = 0; i < SIZE; i++) {
      count++;
      
      System.out.print("번호: ");
      no[i] = keyboard.nextInt();
      keyboard.nextLine();
      
      System.out.print("장르: ");
      genre[i] = keyboard.nextLine();
      
      System.out.print("공연명: ");
      name[i] = keyboard.nextLine();
      
      System.out.print("장소: ");
      location[i] = keyboard.nextLine();
      
      System.out.print("공연시작: ");
      startDate[i] = Date.valueOf(keyboard.next());
      
      System.out.print("공연종료: ");
      endDate[i] = Date.valueOf(keyboard.next());
      
      System.out.print("러닝타임: ");
      runningTime[i] = keyboard.nextInt();
      
      System.out.print("관람연령: ");
      age[i] = keyboard.nextInt();
      keyboard.nextLine();
      
      System.out.print("계속 입력하시겠습니까?(Y/n) ");
      String response = keyboard.nextLine();
      if (!response.equalsIgnoreCase("y")) 
        break;
    
      System.out.println();
      
    }
    System.out.println();

    
    for (int i = 0; i < count; i++) {
      System.out.printf("번호: %d\n장르: %s\n공연명: %s\n장소: %s\n공연기간: %s ~ %s\n%d 시간\n만 %d 이상\n",
                        no[i], genre[i], name[i], location[i], startDate[i], endDate[i], runningTime[i], age[i]);
      System.out.println();
    }
    
    keyboard.close();
    

  } // main() end
} // class() end

