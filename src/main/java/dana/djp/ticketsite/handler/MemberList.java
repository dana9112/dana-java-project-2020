package dana.djp.ticketsite.handler;

import java.util.Arrays;
import dana.djp.ticketsite.domain.Member;

public class MemberList {
  
  static final int DEFAULT_CAPACITY = 3;

  Member[] list;
  int size = 0;
  
  public MemberList() {
    this.list = new Member[DEFAULT_CAPACITY];
  }
  
  public MemberList(int capacity) {
    if (capacity < DEFAULT_CAPACITY || capacity > 1000) {
      this.list = new Member[DEFAULT_CAPACITY];
    } else {
      this.list = new Member[capacity];
    }
  }
  

  public Member[] toArray() {
    /*
    Member[] arr = new Member[this.size];
    for (int i = 0; i < this.size; i++) {
      arr[i] = this.list[i];
    }
    return arr;
    */
    return Arrays.copyOf(this.list, this.size);
  }
  
  public void add(Member member) {
    if (this.size == this.list.length) {
      int oldCapacity = this.list.length;
      int newCapacity = oldCapacity + (oldCapacity >> 1);
      
      /*
      Member[] arr = new Member[newCapacity];
      for (int i = 0; i < this.list.length; i++) {
        arr[i] = this.list[i];
      }
      this.list = arr;
      */
      this.list = Arrays.copyOf(this.list, newCapacity);
      System.out.printf("새 배열을 %d 개 생성하였음!", newCapacity);
    }
    this.list[this.size++] = member;
  }
  
  public Member get(int no) {
    for (int i = 0; i < this.size; i++) {
      if (this.list[i].getNo() == no) {
        return this.list[i];
      }
    }
    return null;
  }
  
}
