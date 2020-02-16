package dana.djp.ticketsite.domain;

import java.sql.Date;

public class Member {
    public int no;
    public String reservationNumber;
    public String ticketSort;
    public Date viewDate;
    public String name;
    public String email;
    public String phone;
    
    
    public int getNo() {
      return no;
    }
    public void setNo(int no) {
      this.no = no;
    }
    public String getReservationNumber() {
      return reservationNumber;
    }
    public void setReservationNumber(String reservationNumber) {
      this.reservationNumber = reservationNumber;
    }
    public String getTicketSort() {
      return ticketSort;
    }
    public void setTicketSort(String ticketSort) {
      this.ticketSort = ticketSort;
    }
    public Date getViewDate() {
      return viewDate;
    }
    public void setViewDate(Date viewDate) {
      this.viewDate = viewDate;
    }
    public String getName() {
      return name;
    }
    public void setName(String name) {
      this.name = name;
    }
    public String getEmail() {
      return email;
    }
    public void setEmail(String email) {
      this.email = email;
    }
    public String getPhone() {
      return phone;
    }
    public void setPhone(String phone) {
      this.phone = phone;
    }
    
    
    
}
