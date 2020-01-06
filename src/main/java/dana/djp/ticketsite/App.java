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
      int runnigTime;
      String age;
      String introduce;
    }

    final int INFORMAITON_SIZE = 100;
    Information[] informations = new Information[INFORMAITON_SIZE];
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


    String command;

    do {
      System.out.print("\n명령> ");
      command = keyboard.nextLine();

      switch (command) {
        case "/information/add":
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

          break;
        case "/information/list":

          for (int i = 0; i < informationCount; i++) {
            Information infor = informations[i];
            System.out.printf("%d, %s, %s, %s, %s ~ %s, %d, %s, %s",
                infor.no, infor.genre, infor.name, infor.location, 
                infor.startDate, infor.endDate, infor.runnigTime, infor.age,
                infor.introduce);
          }
          break;

        case "/member/add" :

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

          break;


        case "/member/list" :

          for (int i = 0; i < memberCount; i++) {
            Member m = members[i];
            System.out.printf("%d, %s, %s, %s, %s, %s, %s\n", 
                m.playNumber, m.reservationNumber, m.ticketSort, m.viewDate, m.name, m.email, 
                m.phone);
          }
          break;

        case "/review/add" :

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

          break;

        case "/review/list" :
          
          for (int i = 0; i < reviewCount; i++) {
            Review r = reviews[i];
            System.out.printf("%d, %s, %s, %d\n", 
                r.no, r.name, r.viewDate, r.title, r.content, r.today, r.viewCount);
          }
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
}






