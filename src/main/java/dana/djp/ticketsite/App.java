package dana.djp.ticketsite;

import java.sql.Date;
import java.util.Scanner;

public class App {

  static Scanner keyboard = new Scanner(System.in);
  
  static class Information {
    int no;
    String genre;
    String name;
    String location;
    Date startDate;
    Date endDate;
    int runnigTime;
    String age;
    String introduce;
  }
  
  static final int INFORMAITON_SIZE = 100;
  static Information[] informations = new Information[INFORMAITON_SIZE];
  static int informationCount = 0;
  
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
  
  static class Review {
    int no;
    String name;
    Date viewDate;
    String title;
    String content;
    Date today;
    int viewCount;
  }
  
  
  static final int REVIEW_SIZE = 100;
  static Review[] reviews = new Review[REVIEW_SIZE];
  static int reviewCount = 0;

  public static void main(String[] args) {

    String command;

    do {
      System.out.print("\n명령> ");
      command = keyboard.nextLine();

      switch (command) {
        case "/information/add":
          addInformation();
          break;
        case "/information/list":
          listInformation();
          break;
        case "/member/add" :
          addMember();
          break;
        case "/member/list" :
          listMember();
          break;
        case "/review/add" :
          addReview();
          break;
        case "/review/list" :
          listReview();
          break;

        default:
          if (!command.equalsIgnoreCase("quit")) {
            System.out.println("실행할 수 없는 명령입니다.");
          }
      }
    } while (!command.equalsIgnoreCase("quit"));

    System.out.println("안녕!");

    keyboard.close();

  }
    private static void addMember() {
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
    
  
    private static void addInformation() {
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
      information.runnigTime = keyboard.nextInt();

      keyboard.nextLine();

      System.out.print("관람연령: ");
      information.age = keyboard.nextLine();

      System.out.print("공연소개: ");
      information.introduce = keyboard.nextLine();

      informations[informationCount++] = information;
      System.out.println("저장되었습니다.");
    }
    
    private static void listInformation() {
      for (int i = 0; i < informationCount; i++) {
        Information infor = informations[i];
        System.out.printf("%d, %s, %s, %s, %s ~ %s, %d, %s, %s",
            infor.no, infor.genre, infor.name, infor.location, 
            infor.startDate, infor.endDate, infor.runnigTime, infor.age,
            infor.introduce);
      }
    }
 
      
    private static void listMember() {
      for (int i = 0; i < memberCount; i++) {
        Member m = members[i];
        System.out.printf("%d, %s, %s, %s, %s, %s, %s\n", 
            m.playNumber, m.reservationNumber, m.ticketSort, m.viewDate, m.name, m.email, 
            m.phone);
      }
    }
      
    private static void addReview() {
      Review review = new Review();

      System.out.print("번호: ");
      review.no = keyboard.nextInt();
      keyboard.nextLine(); // 줄바꿈 기호 제거용

      System.out.print("공연명: ");
      review.title = keyboard.nextLine();

      System.out.print("관람일시: ");
      review.viewDate = Date.valueOf(keyboard.nextLine());

      System.out.print("제목: ");
      review.title = keyboard.nextLine();

      System.out.print("내용: ");
      review.title = keyboard.nextLine();

      review.today = new Date(System.currentTimeMillis());
      review.viewCount = 0;

      reviews[reviewCount++] = review;
      System.out.println("저장되었습니다.");

    }
    
    private static void listReview() {
      for (int i = 0; i < reviewCount; i++) {
        Review r = reviews[i];
        System.out.printf("%d, %s, %s, %d\n", 
            r.no, r.name, r.viewDate, r.title, r.content, r.today, r.viewCount);
      }
      
    }
    
    
  }







