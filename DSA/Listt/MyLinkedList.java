package DSA.Listt;

import org.w3c.dom.Node;

public class MyLinkedList <E>{
    private Node head;
    private int numNodes = 0;
    public MyLinkedList(){
        head = null;
    }
    private class Node {
        private Node next;
        private Object data;
        public Node(Object data){
            this.data=data;
        }
        public Object getData() {
            return data;
        }
    }
    public void add (int index, E element){
       if(index <0 || index > numNodes){
           throw new IndexOutOfBoundsException("Index :" +index + ", Size : " + numNodes);
       }
           Node newNode = new Node(element);
       if(index ==0 ){
           addFirst(element);
       }else {
           Node temp = head;
           for (int i = 0; i < index; i++) {
               temp= temp.next;
           }
           newNode.next =temp.next;
           temp.next=newNode;
           numNodes++;
       }
    }
    public void addFirst(E e){
       Node newNode = new Node(e);
       newNode.next=head;
       head = newNode;
        numNodes++;
    }
    public void addLast(E e){
        Node newNode = new Node(e);
        if(head == null){
            head = newNode;
        }else {
            Node temp = head;
            while (temp.next != null){
                temp= temp.next;
            }
            temp.next=newNode;
        }
        numNodes++;
    }
    public E remove (int index){
        if (index >= numNodes || index <0){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node temp = head;
        if(index == 0 ){
            head=head.next;
        }else {
            for (int i = 0; i < index; i++) {
                temp=temp.next;
            }
            Node toRemove = temp.next;
            temp.next=toRemove.next;
            numNodes--;
            return  (E) toRemove.data;
        }
        numNodes--;
        return (E) temp.data;
    }
    public boolean remove(Object e){
        Node temp = head;
        if(temp == null) return false;
        if(temp.data.equals(e)){
            head = head.next;
            numNodes--;
            return true;
        }
        while (temp.next != null){
            if(temp.next.data.equals(e)){
                temp.next = temp.next.next;
                numNodes--;
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public int size(){
        return numNodes;
    }
    public MyLinkedList <E> clone (){
        MyLinkedList<E> newList  = new MyLinkedList<>();
        Node temp = head;
        while (temp != null){
            newList.addLast((E) temp.data);
            temp=temp.next;
        }
        return newList;
    }
    public boolean contains(E o){
        return indexOf(o) >=0;
    }
    public int indexOf(E o){
       Node temp = head;
       int index =0;
       while (temp != null){
           if(temp.data.equals(o)){
               return index;
           }
           temp=temp.next;
           index++;
       }
       return -1;
    }
    public boolean add(E e){
        addLast(e);
        return true;
    }
    public void ensureCapacity(int minCapacity){

    }
    public E get(int i){
        if (i <0 || i >=numNodes){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node temp = head;
        for (int j = 0; j < i; j++) {
            temp=temp.next;
        }
        return (E) temp.data;
    }
    public E getFirst() {
        if(head == null){
            return null;
        }
        return (E) head.data;
    }
    public E getLast(){
      if(head == null){
          return null;
      }
      Node temp = head;
      while (temp.next != null){
          temp=temp.next;
      }
      return (E) temp.getData();
    }
    public void clear(){
        head = null;
        numNodes=0;
    }
}
//public class MyLinkedList {
//    public static void main(String[] args) {
//        MyLinkedList<Integer> list = new MyLinkedList<>();
//
//        list.addFirst(10);
//        list.addFirst(20);
//        list.addLast(30);
//        list.add(1, 15);
//
//        System.out.println("List size: " + list.size());  // Output: 4
//        System.out.println("First element: " + list.getFirst());  // Output: 20
//        System.out.println("Last element: " + list.getLast());  // Output: 30
//
//        System.out.println("Index of 15: " + list.indexOf(15));  // Output: 1
//        System.out.println("Contains 10? " + list.contains(10));  // Output: true
//
//        list.remove((Integer) 15);
//        System.out.println("After removing 15, size: " + list.size());  // Output: 3
//
//        MyLinkedList<Integer> clonedList = list.clone();
//        System.out.println("Cloned list size: " + clonedList.size());  // Output: 3
//    }
//}
