package dana.djp.ticketsite;

import java.sql.Date;
import java.util.Scanner;

public class MemberHandler {

  static class Member {
    int playNumber;
    String reservationNumber;
    String ticketSort;
    Date viewDate;
    String name;
    String email;
    String phone;
  }
  
  
  static final int MEMBER_SIZE = 100;
  static Member[] members = new Member[MEMBER_SIZE];
  static int memberCount = 0;
  public static Scanner keyboard;
  
  public static void addMember() {
    Member member = new Member();

    System.out.print("공연번호: ");
    member.playNumber = keyboard.nextInt();
    keyboard.nextLine(); // 줄바꿈 기호 제거용

    System.out.print("예약번호: ");
    member.reservationNumber = keyboard.nextLine();

    System.out.print("티켓권종: ");
    member.ticketSort = keyboard.nextLine();

    System.out.print("관람일시: ");
    member.viewDate = Date.valueOf(keyboard.nextLine());

    System.out.print("이름: ");
    member.name = keyboard.nextLine();

    System.out.print("이메일: ");
    member.email = keyboard.nextLine();

    System.out.print("휴대전화: ");
    member.phone = keyboard.nextLine();

    members[memberCount++] = member;
    System.out.println("저장되었습니다.");
  }
  
    
  public static void listMember() {
    for (int i = 0; i < memberCount; i++) {
      Member m = members[i];
      System.out.printf("%d, %s, %s, %s, %s, %s, %s\n", 
          m.playNumber, m.reservationNumber, m.ticketSort, m.viewDate, m.name, m.email, 
          m.phone);
    }
  }
  
  
}
