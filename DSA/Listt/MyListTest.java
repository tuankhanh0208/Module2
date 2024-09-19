package DSA.Listt;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println("Size: " + list.size()); // Size: 3
        System.out.println("Element at index 1: " + list.get(1)); // B
        System.out.println("Contains 'A': " + list.contains("A")); // true

        list.remove(1);
        System.out.println("Size after removal: " + list.size()); // Size: 2
    }
}
