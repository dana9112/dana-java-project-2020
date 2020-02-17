package dana.djp.ticketsite.handler;

import java.util.Arrays;

public class ArrayList {

  static final int DEFAULT_CAPACITY = 3;

  Object[] list;
  int size = 0;

  public ArrayList() {
    this.list = new Object[DEFAULT_CAPACITY];
  }

  public ArrayList(int capacity) {
    if (capacity < DEFAULT_CAPACITY || capacity > 1000) {
      this.list = new Object[DEFAULT_CAPACITY];
    } else {
      this.list = new Object[capacity];
    }
  }


  public Object[] toArray() {
    return Arrays.copyOf(this.list, this.size);
  }

  public void add(Object obj) {
    if (this.size == this.list.length) {
      int oldCapacity = this.list.length;
      int newCapacity = oldCapacity + (oldCapacity >> 1);
      this.list = Arrays.copyOf(this.list, newCapacity);
      System.out.printf("새 배열을 %d 개 생성하였음!", newCapacity);
    }
    this.list[this.size++] = obj;
  }

  public Object get(int idx) {
    if (idx >= 0 && idx < this.size) {
      return this.list[idx];
    } else {
      return null;
    }
  }

}
