package Queue;

import java.util.ArrayDeque;

public class StackWithDeque<T> {
    private ArrayDeque<T> deque;

    public StackWithDeque(){
        deque= new ArrayDeque<>();
    }
    public boolean push(T e){
        deque.offerFirst(e);
        return true;
    }
    public T pop() throws Exception{
        if(deque.size()==0){
            throw new RuntimeException("stack is empty");
        }
        return deque.pollFirst();
    }
    public T peek() throws Exception{
        if(deque.size()==0){
            throw new RuntimeException("stack is empty");
        }
        return deque.peekFirst();
    }
}
