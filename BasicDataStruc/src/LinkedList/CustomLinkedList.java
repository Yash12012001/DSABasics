package LinkedList;

public class CustomLinkedList<T> {
    Node<T> start;
    Node<T> tail;
    int size;

    //Constructor
    public CustomLinkedList(){
        this.size=0;
    }

    // add element at the start postion
    public T addFirst(T val){
        if(size==0){
            Node<T> node =new Node();
            node.setVal(val);
            node.setNext(null);
            this.start=node;
            this.tail=node;
            size++;
            return val;
        }
        Node<T> node = new Node<>();
        node.setVal(val);
        node.setNext(this.start);
        this.start=node;
        size++;
        return val;
    }

    //add element at the last position
    public T addLast(T val){
        if(size==0){
            Node<T> node =new Node();
            node.setVal(val);
            node.setNext(null);
            this.start=node;
            this.tail=node;
            size++;
            return val;
        }
        Node<T> node = new Node<>();
        node.setVal(val);
        node.setNext(null);
        tail.setNext(node);
        tail=node;
        size++;
        return val;
    }

    //get node at index
    public Node<T> get(int index){
        Node temp = start;
        for(int i=0;i<index;i++ ){
            temp=temp.getNext();
        }
        return temp;
    }

    //insert at a given index
    public T insert(int index,T val){
        Node temp=get(index-1);
        Node<T> newNode=new Node<>();
        newNode.setVal(val);
        newNode.setNext(temp.getNext());
        temp.setNext(newNode);
        size++;
        return val;
    }

    //remove an element from first position
    public T removeFirst(){
        if(size==0){
            return null;
        }
        T temp = start.getVal();
        start=start.getNext();
        if(start==null){
            tail=null;
        }
        size--;
        return temp;
    }

    //remove an element from the last position
    public T removeLast(){
        if(size<=1) {
            return removeFirst();
        }
        T temp = tail.getVal();
        Node seconLast= get(size-2);
        tail=seconLast;
        seconLast.setNext(null);
        return temp;
    }

    //remove element at given index
    public T removeAt(int index){
        if(size<index+1){
            return null;
        }
        if(index==size-1){
            return removeLast();
        }
        if(index==0){
            return removeFirst();
        }
        Node temp= get(index-1);

        T val= (T) temp.getNext().getVal();
        temp.setNext(temp.getNext().getNext());
        return val;
    }



    public void display(){
        Node temp = start;
        while(temp!=null){
            System.out.print(temp.getVal() + "->");
            temp=temp.getNext();
        }
        System.out.print("END");
    }
}
