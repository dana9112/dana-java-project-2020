package dana.djp.ticketsite;

import java.util.Scanner;
import dana.djp.ticketsite.handler.InformationHandler;
import dana.djp.ticketsite.handler.MemberHandler;
import dana.djp.ticketsite.handler.ReviewHandler;


public class App {

  static Scanner keyboard = new Scanner(System.in);
  
  public static void main(String[] args) {
    
    // Handler의 메서드를 사용하기 전에
    // 그 메서드가 작업할 때 사용할 키보드 객체를 설정해줘야 한다. 
    InformationHandler.keyboard = keyboard;
    MemberHandler.keyboard = keyboard;
    ReviewHandler.keyboard = keyboard;
    
    
    //메서드가 사용할 메모리만 게시판마다 따로 생성한다.
    InformationHandler informationTable = new InformationHandler();
    MemberHandler memberTable = new MemberHandler();
    ReviewHandler reviewTable = new ReviewHandler();
    String command;

    do {
      System.out.print("\n명령> "); 
      command = keyboard.nextLine();

      switch (command) {
        case "/information/add":
          informationTable.addInformation();
          break;
        case "/information/list":
          informationTable.listInformation();
          break;
        case "/information/detail":
          informationTable.detailInformation();
          break;
        case "/member/add" :
          memberTable.addMember();
          break;
        case "/member/list" :
          memberTable.listMember();
          break;
        case "/member/detail" :
          memberTable.detailMember();
          break;
        case "/review/add" :
          reviewTable.addReview();
          break;
        case "/review/list" :
          reviewTable.listReview();
          break;
        case "/review/detail" :
          reviewTable.detailReview();
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







