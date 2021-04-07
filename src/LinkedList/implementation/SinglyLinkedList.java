package LinkedList.implementation;

import LinkedList.StackADT;

public class SinglyLinkedList<E> implements StackADT {
    Node top;
    public SinglyLinkedList()
    {
        top=null;
    }


    @Override
    public void push(Object data) {
        Node node=new Node(data);
        if(isEmpty())
        {
            top=node;
        }
        else
        {
            node.next=top;
            top=node;
        }
    }

    @Override
    public void pop() {
        if(isEmpty())
        {
            System.out.println("underflow");;
        }
        else
        {
            top=top.next;
        }
    }

    @Override
    public Object peek() {
        return top.data;
    }

    @Override
    public boolean isEmpty() {
        if(top==null) {
            return true;
        }
        return  false;
    }

    @Override
    public void traverse() {
        Node temp=top;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }


}
