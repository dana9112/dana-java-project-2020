package dana.djp.ticketsite;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
  
    Scanner keyboard = new Scanner(System.in);
    String command;
    
    do {
      System.out.print("명령> ");
      command = keyboard.nextLine();
      
      switch (command) {
        case "/infor/add":
          
          break;
          
        case "/infor/list":
          break;
          
        case "/audience/add":
          break;
          
         
      }
      
    } while (!command.equalsIgnoreCase("quit"));
    
    System.out.println("완료");
    
    
    
    keyboard.close();
    } // main() end
  } // class() end

