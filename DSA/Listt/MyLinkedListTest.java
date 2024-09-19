package DSA.Listt;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.addFirst(10);
        list.addFirst(20);
        list.addLast(30);
        list.add(1, 15);

        System.out.println("List size: " + list.size());  // Output: 4
        System.out.println("First element: " + list.getFirst());  // Output: 20
        System.out.println("Last element: " + list.getLast());  // Output: 30

        System.out.println("Index of 15: " + list.indexOf(15));  // Output: 1
        System.out.println("Contains 10? " + list.contains(10));  // Output: true

        list.remove((Integer) 15);
        System.out.println("After removing 15, size: " + list.size());  // Output: 3

        MyLinkedList<Integer> clonedList = list.clone();
        System.out.println("Cloned list size: " + clonedList.size());  // Output: 3
    }
}
