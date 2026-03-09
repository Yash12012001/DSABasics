package Stack;

import java.util.*;

public class StackBasics {

    public static void main(String[] args) {
        // initialise stack
        Stack<String> stack =new Stack<>();

        //insert in stack
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println(stack);

        //peek functions return the top value in stack
        System.out.println(stack.peek());

        //pop functions returns the top element in stack while also deleting it
        System.out.println(stack.pop());
        System.out.println(stack);

        //check size of stack using size function
        System.out.println(stack.size());

        /*
        -Stack has many more inbuilt functions however we mainly use the once given
         above as these are the once that implement the LIFO behavior of stack
        -Stack is mainly used if we have a use-case for LIFO else once can directly
        use Arrays or ArrayLists.
        */

        //iterating through a stack
        //1. Advance for loop
        for(String s: stack){
            System.out.println(s);
        }

        //2.using iterator
        Iterator<String> iterator = stack.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //3. using pop , implementing LIFO behavior
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
