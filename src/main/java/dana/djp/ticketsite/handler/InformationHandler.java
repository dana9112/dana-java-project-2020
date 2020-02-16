package dana.djp.ticketsite.handler;

import java.sql.Date;
import java.util.Scanner;
import dana.djp.ticketsite.domain.Information;

public class InformationHandler {

  Information[] informations;
  int informationCount = 0;
  
  Scanner input;

  static final int INFORMATION_SIZE = 100;


  // 생성자
  // => 인스턴스를 생성할 때 반드시 호출되는 메서드
  // => new 명령을 실행할 때, 호출할 생성자를 지정할 수 있따.
  // => 주로 의존 객체를 초기화시키는 코드를 넣는다.
  // => 생성자는 리턴 값이 없고, 클래스 이름과 같은 이름으로 메서드를 정의한다.
  // => 생성자를 실행할 때 사용할 값은 파라미터로 받는다.
  
  public InformationHandler(Scanner input) {
    // InformationHandler를 실행하려면 데이터를 입력 받는 도구가 반드시 있어야 한다.
    // 이런 도구를 의존객체라 부른다.
    // 보통 dependecy라 줄여서 부른다.
    // 생성자에서 해야할 일은 인스턴스를 생성할 때
    // 이런 의존 객체를 반드시 초기화시키도록 하는 것이다. 
    this.input = input;
    this.informations = new Information[INFORMATION_SIZE];
  }
  
  public InformationHandler(Scanner input, int capacity) {
    this.input = input;
    if (capacity < INFORMATION_SIZE || capacity > 10000) {
      this.informations = new Information[INFORMATION_SIZE];
    } else {
      this.informations = new Information[capacity];
    }
  }
  
  // 인스턴스 메서드
  // => 인스턴스가 있어야만 호출할 수 있는 메서드이다.
  // => 인스턴스를 사용하는 메서드인 경우 인스턴스 메서드로 선언하라.
  // => 호출할 때는 반드시 인스턴스 주소를 줘야 한다.
  //    인스턴스주소.메서드명();
  // => 이렇게 인스턴스의 변수 값을 다루는 메서드는
  //    "연산자(operation)"라 부를 수 있다.
  
  public void addInformation() {
    Information information = new Information();

    System.out.print("번호: ");
    information.no = input.nextInt();
    input.nextLine();
    
    System.out.print("장르: ");
    information.genre = input.nextLine();

    System.out.print("공연명: ");
    information.name = input.nextLine();

    System.out.print("장소: ");
    information.location = input.nextLine();

    System.out.print("공연시작: ");
    information.startDate = Date.valueOf(input.next());

    System.out.print("공연종료: ");
    information.endDate = Date.valueOf(input.next());

    System.out.print("러닝타임: ");
    information.runnigTime = input.nextInt();
    input.nextLine();

    System.out.print("관람연령: ");
    information.age = input.nextLine();

    System.out.print("공연소개: ");
    information.introduce = input.nextLine();

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
    int no = input.nextInt();
    input.nextLine();

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
