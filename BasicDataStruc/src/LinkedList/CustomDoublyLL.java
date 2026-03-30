package LinkedList;

public class CustomDoublyLL<T> {

    int size;
    DNode<T> head;
    DNode<T> tail;

    public CustomDoublyLL() {
        this.size = 0;
    }

    public T addFirst(T val){
        if(size==0){
            head = new DNode<>();
            head.val=val;
            head.prev=null;
            head.next=null;
            tail=head;
            size ++;
            return val;
        }
        DNode<T> temp= new DNode<>();
        temp.val=val;
        temp.prev=null;
        temp.next=head;
        head.prev=temp;
        head=temp;
        size++;
        return val;
    }

    public T addLast(T val){
        if(size==0){
            head = new DNode<>();
            head.val=val;
            head.prev=null;
            head.next=null;
            tail=head;
            size ++;
            return val;
        }
        DNode<T> temp = new DNode<>();
        temp.val=val;
        tail.next=temp;
        temp.prev=tail;
        temp.next=null;
        tail=temp;
        size++;
        return val;
    }

    public T addAt(int index, T val){
        return null;
    }

    public void display(){
        if(head==tail){
            System.out.println(head.val + "->End");
            return;
        }
        DNode<T> temp=head;
        while (temp!=null){
            System.out.print(temp.val + "->");
            temp=temp.next;
        }

        System.out.print("End");
        System.out.println();
    }

    class DNode<T>{
        T val;
        DNode<T> prev;
        DNode<T> next;
    }
}
