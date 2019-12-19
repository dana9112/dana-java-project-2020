package dana.djp.ticketsite;

import java.sql.Date;
import java.util.Scanner;

public class App2 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("공연번호: ");
    String number = keyboard.nextLine();
    
    System.out.print("예약번호: ");
    int ticketNumber = keyboard.nextInt();
    
    keyboard.nextLine();
    
    System.out.print("티켓권종: ");
    String ticketType = keyboard.nextLine();
    
    System.out.print("관람일시: ");
    Date visitDay = Date.valueOf(keyboard.next());
    
    keyboard.nextLine();
    
    System.out.print("이름: ");
    String name = keyboard.nextLine();
    
    System.out.print("이메일: ");
    String email = keyboard.nextLine();
    
    System.out.print("휴대전화: ");
    String phone = keyboard.nextLine();
    
    Date bookingDay = new Date(System.currentTimeMillis());
    
    System.out.println();
    keyboard.close();
    
    System.out.printf("공연번호: %s\n", number);
    System.out.printf("예약번호: %d\n", ticketNumber);
    System.out.printf("티켓권종: %s\n", ticketType);
    System.out.printf("관람일시: %s\n", visitDay);
    System.out.printf("이름: %s\n", name);
    System.out.printf("이메일: %s\n", email);
    System.out.printf("휴대전화: %s\n",phone);
    System.out.printf("예매일: %s\n", bookingDay);

    
  }

}
