package dana.djp.ticketsite;

import java.sql.Date;
import java.util.Scanner;

public class App2 {
  public static void main(String[] args) {
 
    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("공연번호: ");
    int playNumber = keyboard.nextInt();
    keyboard.nextLine();
        
    System.out.print("예약번호: ");
    String reservationNumber = keyboard.nextLine();
    
    System.out.print("티켓권종: ");
    String ticketSort = keyboard.nextLine();
    
    System.out.print("관람날짜: ");
    Date viewDate = Date.valueOf(keyboard.next());
    keyboard.nextLine();
    
    System.out.print("이름: ");
    String name = keyboard.nextLine();
    
    System.out.print("이메일: ");
    String email = keyboard.nextLine();
    
    System.out.print("휴대전화: ");
    String phone = keyboard.nextLine();
    
    keyboard.close();
    System.out.println();
    
    
    System.out.printf("공연번호: %d\n", playNumber );
    System.out.printf("예약번호: %s\n", reservationNumber );
    System.out.printf("티켓권종: %s\n", ticketSort );
    System.out.printf("관람날짜: %s\n", viewDate );
    System.out.printf("이름: %s\n", name );
    System.out.printf("이메일: %s\n", email );
    System.out.printf("휴대전화: %s\n", phone );
    
    

  } //main end

} //class end
