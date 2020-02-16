package dana.djp.ticketsite.handler;

import java.util.Arrays;
import java.util.Scanner;
import dana.djp.ticketsite.domain.Review;

public class ReviewList {
  
  static final int DEFAULT_CAPACITY = 3;

  Review[] list;
  int size = 0;

  Scanner input;
  
  public ReviewList() {
    this.list = new Review[DEFAULT_CAPACITY];
  }
  
  public ReviewList(int capacity) {
    if(capacity < DEFAULT_CAPACITY | capacity > 10000) {
      this.list = new Review[DEFAULT_CAPACITY];
    } else {
      this.list = new Review[capacity];
    }
  }
  
  
  public Review[] toArray() {
    return Arrays.copyOf(this.list, this.size);
  }
  
  public void add(Review review) {
    if(this.size == this.list.length) {
      int oldCapacity = this.list.length;
      int newCapacity = oldCapacity + (oldCapacity >> 1);
      
      /*
      Review[] arr = new Review[this.size];
      for (int i = 0; i < this.size; i++) {
        arr[i] = this.list[i];
      }
      this.list = arr;
      */
      this.list = Arrays.copyOf(this.list, newCapacity);
      System.out.printf("새 배열을 %d 개 생성하였음!", newCapacity);
    }
    this.list[this.size++] = review;
  }
  
  
  public Review get(int no) {
    for (int i = 0; i < this.size; i++) {
      if (this.list[i].getNo() == no) {
        return this.list[i];
      }
    }
    return null;
  }
  
}
