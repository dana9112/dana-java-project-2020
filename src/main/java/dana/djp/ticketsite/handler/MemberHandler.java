package dana.djp.ticketsite.handler;

import java.sql.Date;
import java.util.Scanner;
import dana.djp.ticketsite.domain.Member;


public class MemberHandler {

  Member[] members;
  int memberCount = 0;
  
  Scanner input;

  
  static final int MEMBER_SIZE = 100;
  
  
  public MemberHandler(Scanner input) {
    this.input = input;
    this.members = new Member[MEMBER_SIZE];
  }
  
  
  public MemberHandler(Scanner input, int capacity) {
    this.input = input;
    if (capacity < MEMBER_SIZE || capacity > 10000) {
      this.members = new Member[MEMBER_SIZE];
    } else {
      this.members = new Member[capacity];
    }
      
  }
  
  
  public void addMember() {
    Member member = new Member();   

    System.out.print("공연번호: ");
    member.setNo(input.nextInt());
    input.nextLine(); // 줄바꿈 기호 제거용

    System.out.print("예약번호: ");
    member.setReservationNumber(input.nextLine());

    System.out.print("티켓권종: ");
    member.setTicketSort(input.nextLine());

    System.out.print("관람일시: ");
    member.setViewDate(Date.valueOf(input.nextLine()));

    System.out.print("이름: ");
    member.setName(input.nextLine());

    System.out.print("이메일: ");
    member.setEmail(input.nextLine());

    System.out.print("휴대전화: ");
    member.setPhone(input.nextLine());

    members[memberCount++] = member;
    System.out.println("저장되었습니다.");
  }
  
    
  public void listMember() {
    for (int i = 0; i < this.memberCount; i++) {
      Member m = this.members[i];
      System.out.printf("%d, %s, %s, %s, %s, %s, %s\n", 
          m.getNo(), m.getReservationNumber(), m.getTicketSort(), m.getViewDate(), m.getName(), m.getEmail(), 
          m.getPhone());
    }
  }
    public void detailMember() {
      System.out.print("공연번호? " );
      int no = input.nextInt();
      input.nextLine();
      
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
      
      System.out.printf("공연번호: %d\n", member.getNo());
      System.out.printf("예약번호: %s\n" , member.getReservationNumber());
      System.out.printf("티켓권종: %s\n", member.getTicketSort());
      System.out.printf("관람일시: %s\n", member.getViewDate());
      System.out.printf("이름: %s\n", member.getName());
      System.out.printf("이메일: %s\n", member.getEmail());
      System.out.printf("휴대전화: %s\n", member.getPhone());
    }
  
  
  
}
