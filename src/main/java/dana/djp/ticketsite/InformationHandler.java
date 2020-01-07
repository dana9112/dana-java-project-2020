package dana.djp.ticketsite;

import java.sql.Date;
import java.util.Scanner;

public class InformationHandler {
  
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
  public static Scanner keyboard;
  
  
  public static void addInformation() {
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
  
  public static void listInformation() {
    for (int i = 0; i < informationCount; i++) {
      Information infor = informations[i];
      System.out.printf("%d, %s, %s, %s, %s ~ %s, %d, %s, %s",
          infor.no, infor.genre, infor.name, infor.location, 
          infor.startDate, infor.endDate, infor.runnigTime, infor.age,
          infor.introduce);
    }
  }
  
}
