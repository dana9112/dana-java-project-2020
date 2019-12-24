package dana.djp.ticketsite;

import java.sql.Date;
import java.util.Scanner;

public class App2 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    
   

    
    for (int i = 0; i < SIZE; i++) {
      // 회원정보를 저장할 메모리를 Member 설계도에 따라 만든다. 
      Member member = new Member();

      count++;

      System.out.print("공연번호: ");
      member.playNumber = keyboard.nextInt();
      keyboard.nextLine();

      System.out.print("예약번호: ");
      member.reservationNumber = keyboard.nextLine();

      System.out.print("티켓권종: ");
      member.ticketSort = keyboard.nextLine();

      System.out.print("관람날짜: ");
      member.viewDate = Date.valueOf(keyboard.next());
      keyboard.nextLine();

      System.out.print("이름: ");
      member.name = keyboard.nextLine();

      System.out.print("이메일: ");
      member.email = keyboard.nextLine();

      System.out.print("휴대전화: ");
      member.phone = keyboard.nextLine();
      
      // 회원정보가 담겨있는 인스턴스 주소를 레퍼런스 배열에 보관한다. 
      // 나중에 사용할 수 있도록 보관해두는 것임. 
      members[i] = member;

      System.out.print("계속 입력하시겠습니까?(Y/n) ");
      String response = keyboard.nextLine();
      if (!response.equalsIgnoreCase("y"))
        break;

      System.out.println();
      
    }

    System.out.println("---------------------------------");
    
    for (int i = 0; i < count; i++) {
      Member member = members[i];
      System.out.printf("공연번호: %d\n예약번호: %s\n티켓권종: %s\n관람날짜: %s\n이름: %s\n이메일: %s\n휴대전화: %s\n",
          member.playNumber, member.reservationNumber, member.ticketSort, member.viewDate, member.name, member.email, member.phone);
      System.out.println();
    }

    keyboard.close();


  } //main end

} //class end
