package Stack;

import java.util.*;

public class StackBasicQuestions {
    public static void main(String[] args) {
        /*
        1. Implement Basic Stack Operations

            Problem:
            You are given an empty stack. Perform the following operations in order:

            Push the elements 5, 10, 15, 20 onto the stack.

            Pop the top element.

            Return the element currently at the top of the stack.

            Example:
            Operations:
            push(5)
            push(10)
            push(15)
            push(20)
            pop()

            Output: 15
         */
        Stack<Integer> stack =new Stack<>();
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);

        System.out.println(stack.pop());

        /*
        2. Reverse a String Using Stack

            Problem:
            Given a string s, reverse the string using a stack.

            Example 1:
            Input: s = "hello"
            Output: "olleh"

            Example 2:
            Input: s = "stack"
            Output: "kcats"

         */

        String s = "hello";
        Stack<Character> stack1 = new Stack<>();

        StringBuilder builder= new StringBuilder();
        for(int i=0;i<s.length();i++){
            stack1.push(s.charAt(i));
        }
        while(!stack1.isEmpty()){
            builder.append(stack1.pop());
        }
        System.out.println(builder.toString());

        /*
        3. Valid Parentheses

            Problem:
            Given a string s containing only the characters '(', ')', '{', '}', '[', ']',
             determine if the input string is valid.

            A string is valid if:

            Open brackets are closed by the same type of brackets.

            Open brackets are closed in the correct order.

            Example 1
            Input: s = "()"
            Output: true

            Example 2
            Input: s = "(]"
            Output: false

            Example 3
            Input: s = "{[]}"
            Output: true
         */

        String validP = "()";
        Stack<Character> stack2 = new Stack<>();
        boolean check = true;
        for(char c: validP.toCharArray()){
            if (validP.length()%2!=0){
                check=false;
                break;
            }
            if(c=='(' || c=='{' || c=='['){
                stack2.push(c);
            }else{
                if(stack2.isEmpty()){
                    check=false;
                    break;
                }
                char top = stack2.pop();
                if(c==')' && top!='('){
                    check=false;
                    break;
                }else if(c=='}' && top!='{'){
                    check=false;
                    break;
                }else if(c==']' && top!='['){
                    check=false;
                    break;
                }

            }
        }
        System.out.println(check);
        /*
        4. Remove Adjacent Duplicates in String

            Problem:
            Given a string s, repeatedly remove adjacent duplicate characters using a stack until no duplicates remain.

            Return the final string.

            Example
            Input: s = "abbaca"

            Process:
            abbaca → aaca → ca

            Output: "ca"
         */

        String s1 ="abbaca";
        Stack<Character> stack3= new Stack<>();
        StringBuilder builder1 = new StringBuilder();
        for(char c: s1.toCharArray()){
            if(!stack3.isEmpty() && stack3.peek()==c){
                stack3.pop();
            }else{
                stack3.push(c);
            }
        }
        while(!stack3.isEmpty()){
            builder1.append(stack3.pop());
        }
        System.out.println(builder1.toString());

        /*
        5. Evaluate Postfix Expression

            Problem:
            You are given a postfix expression as a string array tokens.

            Evaluate the expression and return the result.

            Operators supported: +, -, *, /.

            Example
            Input: tokens = ["2","1","+","3","*"]

            Explanation:
            (2 + 1) * 3

            Output: 9
         */
        String[] arr = {"2","1","+","3","*"};
        Stack<Integer> stack4 = new Stack<>();
        int ans = 0;
        for(String s2: arr){
            if(!s2.equals("*") && !s2.equals("+")&&!s2.equals("-")&&!s2.equals("/")){
                int toPush = Integer.parseInt(s2);
                stack4.push(toPush);
            }else if(!stack4.isEmpty() && s2.equals("+")){
                while(!stack4.isEmpty()){
                    ans+=stack4.pop();
                }
            } else if(!stack4.isEmpty() && s2.equals("-")) {
                while (!stack4.isEmpty()) {
                    ans -= stack4.pop();
                }
            } else if(!stack4.isEmpty() && s2.equals("*")) {
                while (!stack4.isEmpty()) {
                    ans *= stack4.pop();
                }
            }else if(!stack4.isEmpty() && s2.equals("/") && stack4.peek()!=0) {
                while (!stack4.isEmpty()) {
                    ans /= stack4.pop();
                }
            }
        }
        System.out.println(ans);

        /*
        6. Next Greater Element

            Problem:
            Given an array nums, for each element find the next greater element to its right.

            If no such element exists, return -1.

            Example
            Input: nums = [4,5,2,10]

            Output: [5,10,10,-1]

            Explanation:

            Next greater for 4 → 5

            Next greater for 5 → 10

            Next greater for 2 → 10

            Next greater for 10 → -1
         */
        int[] nums = {4,5,2,10};
        Stack<Integer> stack5 = new Stack<>();
        int[] ans1= new int[nums.length];
        for(int i=nums.length-1;i>=0;i--) {
        	while(!stack5.isEmpty() && nums[i]>=stack5.peek()) {
//        		System.out.println("nums" +i+ " "+nums[i]+ "peek"+ stack5.peek());
        		stack5.pop();
        	}
        	
        	if(stack5.isEmpty()) {
        		ans1[i]=-1;
        	}else {
        		ans1[i]=stack5.peek();
        		
        	}
        	stack5.push(nums[i]);
        	System.out.println(stack5);
        	
        }
        System.out.println(Arrays.toString(ans1));
        

        /*
        7. Implement Stack Using ArrayList

            Problem:
            Design a stack using an ArrayList.

            Implement the following operations:

            push(x) — Push element x onto stack.

            pop() — Removes the top element.

            top() — Returns the top element.

            isEmpty() — Returns whether the stack is empty.

            Example
            Operations:
            push(1)
            push(2)
            top()
            pop()
            top()

            Output:
            2
            1
         */



    }
}
