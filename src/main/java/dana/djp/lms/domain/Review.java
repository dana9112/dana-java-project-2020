package dana.djp.lms.domain;

import java.sql.Date;

public class Review {
    public int no;
    public String name;
    public Date viewDate;
    public String title;
    public String content;
    public Date today;
    public  int viewCount;
    
    
    public int getNo() {
      return no;
    }
    public void setNo(int no) {
      this.no = no;
    }
    public String getName() {
      return name;
    }
    public void setName(String name) {
      this.name = name;
    }
    public Date getViewDate() {
      return viewDate;
    }
    public void setViewDate(Date viewDate) {
      this.viewDate = viewDate;
    }
    public String getTitle() {
      return title;
    }
    public void setTitle(String title) {
      this.title = title;
    }
    public String getContent() {
      return content;
    }
    public void setContent(String content) {
      this.content = content;
    }
    public Date getToday() {
      return today;
    }
    public void setToday(Date today) {
      this.today = today;
    }
    public int getViewCount() {
      return viewCount;
    }
    public void setViewCount(int viewCount) {
      this.viewCount = viewCount;
    }
    
    
    
    
  
}
