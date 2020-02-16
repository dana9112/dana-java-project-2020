package dana.djp.ticketsite.handler;

import java.util.Arrays;
import dana.djp.ticketsite.domain.Information;

public class InformationList {

  static final int DEFAULT_CAPACITY = 3;

  Information[] list;
  int size = 0;


  public InformationList() {
    this.list = new Information[DEFAULT_CAPACITY];
  }

  public InformationList(int capacity) {
    if (capacity < DEFAULT_CAPACITY || capacity > 10000) {
      this.list = new Information[DEFAULT_CAPACITY];
    } else {
      this.list = new Information[capacity];
    }
  }

  public Information[] toArray() {

    /*
    Information[] arr = new Information[this.size];
    for (int i = 0; i < this.size; i++) {
      arr[i] = this.list[i];
    }
    return arr;
    */
    
    return Arrays.copyOf(this.list, this.size);
  }


  public void add(Information information) {
    if (this.size == this.list.length) {
      int oldCapacity = this.list.length;
      int newCapacity = oldCapacity + (oldCapacity >> 1);


      /*
      Information[] arr = new Information[newCapacity];
      for (int i = 0; i < this.list.length; i++) {
        arr[i] = this.list[i];
      }
      this.list = arr;
       */

      this.list = Arrays.copyOf(this.list, newCapacity);
      // Arrays.copyOf(원본배열, 복사할 길이);
      // 값에 의한 복사이므로 복사된 배열에서 값을 바꿔도 원본 배열의 값이 바뀌지 않음!
      System.out.printf("새 배열을 %d 개 생성하였음!", newCapacity);
    }
    this.list[this.size++] = information;
  }
  
  public Information get(int no) {
    for (int i = 0; i < this.size; i++) {
      if(this.list[i].getNo() == no) {
        return this.list[i];
      }
    }
    return null;
  }
  
}

