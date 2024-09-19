package StackOueue;

public class Main {
    public static void main(String[] args) {
        Solution solution =  new Solution();
        solution.enQueue(10);
        solution.enQueue(20);
        solution.enQueue(40);
        solution.displayQueue();

        solution.deQueue();

        solution.displayQueue();
    }
}
