package dana.djp.ticketsite;

import java.sql.Date;
import java.util.Scanner;

public class App2 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    final int SIZE = 100;

    int[] playNumber = new int[SIZE];
    String[] reservationNumber = new String[SIZE];
    String[] ticketSort = new String[SIZE];
    Date[] viewDate = new Date[SIZE];
    String[] name = new String[SIZE];
    String[] email = new String[SIZE];
    String[] phone = new String[SIZE];

    int count = 0;
    for (int i = 0; i < SIZE; i++) {

      count++;

      System.out.print("공연번호: ");
      playNumber[i] = keyboard.nextInt();
      keyboard.nextLine();

      System.out.print("예약번호: ");
      reservationNumber[i] = keyboard.nextLine();

      System.out.print("티켓권종: ");
      ticketSort[i] = keyboard.nextLine();

      System.out.print("관람날짜: ");
      viewDate[i] = Date.valueOf(keyboard.next());
      keyboard.nextLine();

      System.out.print("이름: ");
      name[i] = keyboard.nextLine();

      System.out.print("이메일: ");
      email[i] = keyboard.nextLine();

      System.out.print("휴대전화: ");
      phone[i] = keyboard.nextLine();

      System.out.print("계속 입력하시겠습니까?(Y/n) ");
      String response = keyboard.nextLine();
      if (!response.equalsIgnoreCase("y"))
        break;

      System.out.println();
      
    }

    System.out.println("---------------------------------");
    
    for (int i = 0; i < count; i++) {
      System.out.printf("공연번호: %d\n예약번호: %s\n티켓권종: %s\n관람날짜: %s\n이름: %s\n이메일: %s\n휴대전화: %s\n",
          playNumber[i], reservationNumber[i], ticketSort[i], viewDate[i], name[i], email[i],phone[i]);
      System.out.println();
    }

    keyboard.close();


  } //main end

} //class end
