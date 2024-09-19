package StackOueue;

public class Solution {

    Queue queue = new Queue();
    public void enQueue(int data){
        Node newNode = new Node(data);
        if (queue.rear == null){
            queue.front=newNode;
            queue.rear=newNode;
        }else {
            queue.rear.link=newNode;
            queue.rear=newNode;
        }
        System.out.println(data+ " added to queue");
    }
    public void deQueue(){
        if (queue.front == null){
            System.out.println(" ");
            return;
        }
        Node temp = queue.front;
        queue.front =queue.front.link;
        if (queue.front == null){
            queue.rear =null;
        }
        System.out.println(temp.data + " ");
    }
    public void displayQueue(){
        if (queue.front == null){
            System.out.println(" ");
            return;
        }
        Node temp = queue.front;
        System.out.println("Queue : ");
        while (temp != null){
            System.out.println(temp.data + " ");
            temp=temp.link;
        }
        System.out.println();
    }

}
