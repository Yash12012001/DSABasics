package Stack;
import java.util.*;

public class CustomStack<T extends Comparable<T>>  {

    protected ArrayList<T> arr;
    protected ArrayList<T> min;

    public void push(T element){
        arr.add(element);
        if(min.size()==0 || element.compareTo(getMin())<=0 ){
            min.add(element);
        }
    }
    public T getMin(){
        if(min.size()==0){
            throw new RuntimeException("min is empty");
        }else{
            return min.get(min.size()-1);
        }
    }
    public T pop(){
        if(arr.isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        T e = arr.get(arr.size()-1);
        if(e.compareTo(getMin())==0){
            min.remove(min.size()-1);
        }
        arr.remove(arr.size()-1);
        return e;
    }

    public T peek(){
        if(arr.isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return arr.get(arr.size()-1);
    }

   public CustomStack() {
        arr= new ArrayList<>();
        min = new ArrayList<>();
    }

    public boolean isEmpty(){
        return arr.size()==0;
    }

    public String toString(){
        return arr.toString();
    }


}
