package LinkedList.implementation;

public class Mymain {
    public static void main(String[] args) {
        SinglyLinkedList<String> s=new SinglyLinkedList();
        s.push("Hello");
        s.push("priya");
        s.push("tarkar");
        s.pop();
        System.out.println(s.peek());
        s.traverse();
    }
}
