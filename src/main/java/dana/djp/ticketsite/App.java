package dana.djp.ticketsite;

import java.util.Scanner;
import dana.djp.ticketsite.handler.InformationHandler;
import dana.djp.ticketsite.handler.MemberHandler;
import dana.djp.ticketsite.handler.ReviewHandler;
import dana.djp.ticketsite.handler.ReviewHandler2;


public class App {

  static Scanner keyboard = new Scanner(System.in);
  
  public static void main(String[] args) {
    
    // Handler의 메서드를 사용하기 전에
    // 그 메서드가 작업할 때 사용할 키보드 객체를 설정해줘야 한다. 
    InformationHandler.keyboard = keyboard;
    MemberHandler.keyboard = keyboard;
    ReviewHandler.keyboard = keyboard;

    String command;

    do {
      System.out.print("\n명령> "); 
      command = keyboard.nextLine();

      switch (command) {
        case "/information/add":
          InformationHandler.addInformation();
          break;
        case "/information/list":
          InformationHandler.listInformation();
          break;
        case "/member/add" :
          MemberHandler.addMember();
          break;
        case "/member/list" :
          MemberHandler.listMember();
          break;
        case "/review/add" :
          ReviewHandler.addReview();
          break;
        case "/review/list" :
          ReviewHandler.listReview();
          break;
          
        case "/review2/add" :
          ReviewHandler2.addReview();
          break;
        case "/review2/list" :
          ReviewHandler2.listReview();
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







