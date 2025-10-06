package LeetCode.Medium;

class Node{
    public int val;
    public Node next;
    public Node prev;
    public Node(int val, Node next, Node prev){
        this.val = val;
        this.next = next;
        this.prev = prev;
    }
}
public class P_641_DesignCurcularDeque {
    public static void main(String[] args) {
        myCircularDeque deque = new myCircularDeque(3); //capacity
        System.out.println(deque.insertLast(1)); //true
        System.out.println(deque.insertLast(2));//true
        System.out.println(deque.insertFront(3));//true
        System.out.println(deque.insertFront(4));// false (deque is full)
        System.out.println("Rear: " + deque.getRear()); //2
        System.out.println("Is full? " + deque.isFull()); //true
        System.out.println(deque.deleteLast()); //true
        System.out.println(deque.insertFront(4)); //true
        System.out.println("Front: " + deque.getFront()); //4
    }
}
class myCircularDeque{
    Node head;
    Node rear;
    int size;
    int capacity;
    public myCircularDeque(int k){
        size = 0;
        capacity = k;
    }
    public boolean insertFront(int value){
        if(isFull()) return false;
        if(head == null){
            head = new Node(value, null, null);
            rear = head;
        }else{

            Node newNode = new Node(value, head, null);
            head.prev = newNode;
            head = newNode;
        }
        size++;
        return true;
    }
    public boolean insertLast(int value){
        if(isFull()) return false;
        if(head == null){
            head = new Node(value, null, null);
            rear = head;
        } else {
            rear.next = new Node(value, null, null);
            rear.next.prev = rear;
            rear = rear.next;
        }
        size ++;
        return true;
    }
    public boolean deleteFront(){
        if(isEmpty()) return false;
        if(size == 1) {
            head = null;
            rear = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size --;
        return true;
    }
    public boolean deleteLast(){
        if (isEmpty()) return false;
        if (size == 1) {
            head = null;
            rear = null;
        } else {
            rear = rear.prev;
            rear.next = null;
        }
        size--;
        return true;
    }
    public int getFront(){
        if(isEmpty()) return -1;
        return head.val;
    }
    public int getRear(){
        if(isEmpty()) return -1;
        return rear.val;
    }
    public boolean isEmpty(){
       return size == 0;
    }
    public boolean isFull(){
        return size == capacity;
    }
}

