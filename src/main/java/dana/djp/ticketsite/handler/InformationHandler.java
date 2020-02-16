package dana.djp.ticketsite.handler;

import java.sql.Date;
import java.util.Scanner;
import dana.djp.ticketsite.domain.Information;

public class InformationHandler {
  
  Information[] informations = new Information[INFORMAITON_SIZE];
  int informationCount = 0;
  
  
  static final int INFORMAITON_SIZE = 100;
  public static Scanner keyboard;
  
  
  public void addInformation() {
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
  
  public void listInformation() {
    for (int i = 0; i < this.informationCount; i++) {
      Information infor = this.informations[i];
      System.out.printf("%d, %s, %s, %s, %s ~ %s, %d, %s, %s\n",
          infor.no, infor.genre, infor.name, infor.location, 
          infor.startDate, infor.endDate, infor.runnigTime, infor.age,
          infor.introduce);
    }
  }
  
  public void detailInformation() {
    System.out.print("번호? " );
    int no = keyboard.nextInt();
    keyboard.nextLine();
    
    Information information = null;
    for(int i = 0; i < this.informationCount; i++) {
      if(this.informations[i].no == no) {
        information = this.informations[i];
        break;
      }
    }
    
    if(information == null) {
      System.out.println("게시물 번호가 유효하지 않습니다.");
      return;
    }
    
    System.out.printf("번호: %d\n", information.no);
    System.out.printf("장르: %s\n", information.genre);
    System.out.printf("공연명: %s\n", information.name);
    System.out.printf("장소: %s\n", information.location);
    System.out.printf("공연기간: %s ~ %s\n", information.startDate, information.endDate);
    System.out.printf("러닝타임: %d\n", information.runnigTime);
    System.out.printf("관람연령: %s\n", information.age);
    System.out.printf("공연소개: %s\n", information.introduce);
       
  }
  
}
