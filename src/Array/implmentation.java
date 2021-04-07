package Array;

public class implmentation {
    int size;
    int top;
    int[] arr;
    int Max;
    public implmentation(int capacity)
    {
        size=0;
        top=0;
        Max=capacity;
        arr=new int[Max];
    }
    void push(int data)
    {
        if(size==Max)
        {
            System.out.println("Stack overflow");
        }
        else
        {
            arr[top]=data;
            top++;
            size++;
        }
    }
    void pop()
    {
        if(top==0)
        {
            System.out.println("Stack underFlow");
        }
        else
        {
            top--;

            size--;
        }
    }
    int peek()
    {
        return arr[top-1];
    }
    void traverse()
    {
        for (int i = 0; i <top ; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}
