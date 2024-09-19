package DSA.Listt;

import java.util.Arrays;

public class MyList <E>{
  private int size = 0;
  private static final int DEFAULT_CAPACITY=10;
  private Object [] elements;
  public MyList() {
      elements = new Object[DEFAULT_CAPACITY];
  }
  public MyList(int capacity){
    elements = new Object[capacity];
  }

  public void add(int index,E element){
      if(index >= size || index <0){
          throw new IndexOutOfBoundsException("Index : " + index + ", Size : " + size);
      }
      ensureCapacity(size+1);
      for (int i = size; i > index; i--) {
          elements[i] = elements[i-1];
      }
      elements[index]=element;
      size++;
  }
  public boolean add(E e){
      ensureCapacity(size+1);
      elements[size++]=e;
      return true;
  }
  public E get(int i){
      if(i >size || i< 0 ){
          throw new IndexOutOfBoundsException("Index :" + i + " , Size :" + i);
      }
      return (E) elements[i];
  }
  public E remove(int index){
    if(index >= size || index <0){
        throw new IndexOutOfBoundsException("Index : " + index + " , Size " + size);
    }
    E oldValue = (E) elements[index];
//      for (int i = index; i <size-1 ; i++) {
//          elements[i]=elements[i+1];
//      }
      elements[size--]=null;
      size--;
      return oldValue;
  }
  public int size(){
      return size;
  }
  public MyList<E> clone(){
    MyList<E> newList = new MyList<>(size);
      for (int i = 0; i < size; i++) newList.add((E) elements[i]);
    return newList ;
  }
  public boolean contains(E o){
    return indexOf(o) >=0;
  }
  public int indexOf(E o){
      for (int i = 0; i < size; i++) {
          if(o.equals(elements[i])){
              return i;
          }
      }
      return -1;
  }


  public void ensureCapacity(int minCapacity){
    if(minCapacity > elements.length){
        elements=Arrays.copyOf(elements,minCapacity);
    }
  }
  public void clear(){
      for (int i = 0; i < size; i++) {
          elements[i]=null;
      }
      size=0;
  }
}
