package dana.djp.lms.domain;

import java.sql.Date;

public class Information {
    public int no;
    public String genre;
    public String name;
    public String location;
    public  Date startDate;
    public Date endDate;
    public int runnigTime;
    public String age;
    public String introduce;
    
    
    public int getNo() {
      return no;
    }
    public void setNo(int no) {
      this.no = no;
    }
    public String getGenre() {
      return genre;
    }
    public void setGenre(String genre) {
      this.genre = genre;
    }
    public String getName() {
      return name;
    }
    public void setName(String name) {
      this.name = name;
    }
    public String getLocation() {
      return location;
    }
    public void setLocation(String location) {
      this.location = location;
    }
    public Date getStartDate() {
      return startDate;
    }
    public void setStartDate(Date startDate) {
      this.startDate = startDate;
    }
    public Date getEndDate() {
      return endDate;
    }
    public void setEndDate(Date endDate) {
      this.endDate = endDate;
    }
    public int getRunnigTime() {
      return runnigTime;
    }
    public void setRunnigTime(int runnigTime) {
      this.runnigTime = runnigTime;
    }
    public String getAge() {
      return age;
    }
    public void setAge(String age) {
      this.age = age;
    }
    public String getIntroduce() {
      return introduce;
    }
    public void setIntroduce(String introduce) {
      this.introduce = introduce;
    }
    
    
    
    

}
