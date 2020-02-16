package dana.djp.ticketsite.handler;

import java.sql.Date;
import java.util.Scanner;
import dana.djp.ticketsite.domain.Information;

public class InformationHandler {

  InformationList informationList;
  Scanner input;

  public InformationHandler(Scanner input) {
    this.input = input;
    informationList = new InformationList();
  }
  
  public InformationHandler(Scanner input, int capacity) {
    this.input = input;
    informationList = new InformationList(capacity);
  }
  
  public void addInformation() {
    Information information = new Information();

    System.out.print("번호: ");
    information.setNo(input.nextInt());
    input.nextLine();
    
    System.out.print("장르: ");
    information.setGenre(input.nextLine());

    System.out.print("공연명: ");
    information.setName(input.nextLine());

    System.out.print("장소: ");
    information.setLocation(input.nextLine());

    System.out.print("공연시작: ");
    information.setStartDate(Date.valueOf(input.next()));

    System.out.print("공연종료: ");
    information.setEndDate(Date.valueOf(input.next()));

    System.out.print("러닝타임: ");
    information.setRunnigTime(input.nextInt());
    input.nextLine();

    System.out.print("관람연령: ");
    information.setAge(input.nextLine());

    System.out.print("공연소개: ");
    information.setIntroduce(input.nextLine());

    informationList.add(information);
    System.out.println("저장되었습니다.");       
  }

  public void listInformation() {
    Information[] informations = informationList.toArray();
    for (Information infor : informations) {
      System.out.printf("%d, %s, %s, %s, %s ~ %s, %d, %s, %s\n",
          infor.getNo(), infor.getGenre(), infor.getName(), infor.getLocation(), 
          infor.getStartDate(), infor.getEndDate(), infor.getRunnigTime(), infor.getAge(),
          infor.getIntroduce());
    }
  }

  public void detailInformation() {
    System.out.print("번호? " );
    int no = input.nextInt();
    input.nextLine();
    
    Information information = informationList.get(no);
    if(information == null) {
      System.out.println("게시물 번호가 유효하지 않습니다.");
      return;
    }

    System.out.printf("번호: %d\n", information.getNo());
    System.out.printf("장르: %s\n", information.getGenre());
    System.out.printf("공연명: %s\n", information.getName());
    System.out.printf("장소: %s\n", information.getLocation());
    System.out.printf("공연기간: %s ~ %s\n", information.getStartDate(), information.getEndDate());
    System.out.printf("러닝타임: %d\n", information.getRunnigTime());
    System.out.printf("관람연령: %s\n", information.getAge());
    System.out.printf("공연소개: %s\n", information.getIntroduce());

  }

}
