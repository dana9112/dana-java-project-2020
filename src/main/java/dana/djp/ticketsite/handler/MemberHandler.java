package dana.djp.ticketsite.handler;

import java.sql.Date;
import java.util.Scanner;
import dana.djp.ticketsite.domain.Member;


public class MemberHandler {

  Member[] members = new Member[MEMBER_SIZE];
  int memberCount = 0;
  
  static final int MEMBER_SIZE = 100;
  public static Scanner keyboard;
  
  public void addMember() {
    Member member = new Member();   

    System.out.print("공연번호: ");
    member.no = keyboard.nextInt();
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
  
    
  public void listMember() {
    for (int i = 0; i < this.memberCount; i++) {
      Member m = this.members[i];
      System.out.printf("%d, %s, %s, %s, %s, %s, %s\n", 
          m.no, m.reservationNumber, m.ticketSort, m.viewDate, m.name, m.email, 
          m.phone);
    }
  }
    public void detailMember() {
      System.out.print("공연번호? " );
      int no = keyboard.nextInt();
      keyboard.nextLine();
      
      Member member = null;
      for (int i = 0; i < this.memberCount; i++) {
        if (this.members[i].no == no) {
          member = this.members[i];
          break;
        }
      }
      if (member == null) {
        System.out.println("게시물 번호가 유효하지 않습니다.");
        return;
      }
      
      System.out.printf("공연번호: %d\n", member.no);
      System.out.printf("예약번호: %s\n" , member.reservationNumber);
      System.out.printf("티켓권종: %s\n", member.ticketSort);
      System.out.printf("관람일시: %s\n", member.viewDate);
      System.out.printf("이름: %s\n", member.name);
      System.out.printf("이메일: %s\n", member.email);
      System.out.printf("휴대전화: %s\n", member.phone);
    }
  
  
  
}
