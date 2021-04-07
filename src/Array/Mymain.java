package Array;

public class Mymain {
    public static void main(String[] args) {


        implmentation i = new implmentation(5);
        i.push(10);
        i.push(20);
        i.push(50);
        i.push(60);
        i.push(100);
        i.pop();
        i.pop();
//        i.pop();
        System.out.println(i.peek());
        i.traverse();
    }
}
