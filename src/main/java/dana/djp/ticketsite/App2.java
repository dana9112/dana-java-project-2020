package dana.djp.ticketsite;

import java.sql.Date;
import java.util.Scanner;

public class App2 {
  public static void main(String[] args) {
    Scanner keyboard= new Scanner(System.in);

    class Booking {
      String number;
      int ticketNumber;
      String ticketType;
      Date visitDay;
      String name;
      String email;
      String phone;
      Date bookingDay;
    }

    String response;
    final int Size = 100;
    Booking[] bookings = new Booking[100];

    int count = 0;
    for (int i = 0; i < Size; i++) {
      Booking booking = new Booking();

      count++;

      System.out.print("공연번호: ");
      booking.number = keyboard.nextLine();

      System.out.print("예약번호: ");
      booking.ticketNumber = keyboard.nextInt();

      keyboard.nextLine();

      System.out.print("티켓권종: ");
      booking.ticketType = keyboard.nextLine();

      System.out.print("관람일시: ");
      booking.visitDay = Date.valueOf(keyboard.next());

      keyboard.nextLine();

      System.out.print("이름: ");
      booking.name = keyboard.nextLine();

      System.out.print("이메일: ");
      booking.email = keyboard.nextLine();

      System.out.print("휴대전화: ");
      booking.phone = keyboard.nextLine();

      booking.bookingDay = new Date(System.currentTimeMillis());

      bookings[i] = booking;

      System.out.println();

      System.out.print("계속 작성하시겠습니까? (Y/n)");
      response = keyboard.nextLine();
      if (!response.equalsIgnoreCase("y")) {
        break;
        
      }
    }
    
    keyboard.close();
    
    for (int i = 0; i < count; i++) {
      Booking booking = bookings[i];
      System.out.printf("공연번호: %s\n예약번호: %d\n티켓권종: %s\n관람일시: %s\n이름: %s\n이메일: %s\n휴대전화: %s\n예매일: %s", 
          booking.number, booking.ticketNumber, booking.ticketType, booking.visitDay, booking.name, booking.email, booking.phone, booking.bookingDay);   
    }

  } //main end

} //class end
