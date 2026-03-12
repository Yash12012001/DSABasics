package Queue;

import java.lang.reflect.Array;
import java.util.*;

public class QueueBasics {
    public static void main(String[] args) throws Exception {
    	 /*
        # 1️⃣ Queue (Java Queue Interface)

        ## A) Important Concepts & Methods to Practice

        ### Concepts

        * FIFO (First In First Out)
        * Queue front and rear
        * Underflow (removing from empty queue)
        * Basic queue traversal

        ### Methods

        Practice these methods using `Queue<Integer> queue = new LinkedList<>();`

        * `offer(element)` → insert element
        * `poll()` → remove front element
        * `peek()` → view front element
        * `isEmpty()` → check if queue empty
        * `size()` → number of elements
        * Iterating through queue using loop

        */
    	Queue<Integer> queue =new LinkedList<>();
    	
    	queue.offer(1);
    	queue.offer(2);
    	queue.offer(3);
    	queue.offer(4);
    	System.out.println(queue);
    	System.out.println(queue.poll());
    	System.out.println(queue);
    	System.out.println(queue.peek());
    	System.out.println(queue.size());
    	System.out.println();
    	
    	
    	while(!queue.isEmpty()) {
    		System.out.println(queue.poll());
    	}
    	
    	
    	/*

        ## B) Practice Questions

        ### 1. Basic Queue Operations

        **Problem**

        Create an empty queue and perform the following operations:

        1. Insert elements `10, 20, 30, 40`
        2. Remove one element
        3. Print the remaining queue
        4. Print the front element

        **Example**

        ```
        Queue after operations:
        [20, 30, 40]

        Front element:
        20
        ```

        ---

        ### 2. Reverse a Queue

        **Problem**

        Given a queue of integers, reverse the entire queue.

        **Example**

        ```
        Input:
        queue = [10, 20, 30, 40]

        Output:
        [40, 30, 20, 10]
        ```

        *(Hint: you may use a stack since it is already covered.)*

        ---
        */
    	Queue<Integer> queue1 = new LinkedList<>();
    	queue1.offer(10);
    	queue1.offer(20);
    	queue1.offer(30);
    	queue1.offer(40);
    	
    	queue1.poll();
    	
    	System.out.println(queue1);
    	System.out.println(queue1.element());
        


       

        
        Queue<Integer> queue2 = new LinkedList<>();

        queue2.add(5);
        queue2.add(2);
        queue2.add(9);
        queue2.add(1);

        Stack<Integer> stack = new Stack<>();
        while(!queue2.isEmpty()){
            stack.push(queue2.poll());
        }

        while(!stack.isEmpty()){
            queue2.offer(stack.pop());
        }
        System.out.println(queue2);
        /*

        ### 3. Find Maximum Element in Queue

        **Problem**

        Given a queue of integers, find the maximum element without removing elements permanently.

        **Example**

        ```
        Input:
        queue = [5, 2, 9, 1]

        Output:
        9
        ```

        ---

         */
        Queue<Integer> queue3 = new LinkedList<>();
        int max=Integer.MIN_VALUE;

        queue3.offer(5);
        queue3.offer(2);
        queue3.offer(9);
        queue3.offer(1);

        for(int i: queue3){
            max= Integer.max(max,i);
        }
        System.out.println(max);


        /*

        ### 4. Count Even Numbers in Queue

        **Problem**

        Given a queue of integers, count how many even numbers are present.

        **Example**

        ```
        Input:
        queue = [2, 5, 8, 7, 10]

        Output:
        3
        ```

        ---
        */
        Queue<Integer> queue4 = new LinkedList<>();

        queue4.offer(2);
        queue4.offer(5);
        queue4.offer(8);
        queue4.offer(7);
        queue4.offer(10);
        int count=0;
        for(int i: queue4){
            if(i%2==0)
                count++;
        }
        System.out.println(count);
        /*

        ### 5. Rotate Queue

        **Problem**

        Given a queue and an integer `k`, move the first `k` elements of the queue to the end.

        **Example**

        ```
        Input:
        queue = [10, 20, 30, 40, 50]
        k = 2

        Output:
        [30, 40, 50, 10, 20]
        ```

        ---
        */
        Queue<Integer> queue5 = new LinkedList<>();
        queue5.offer(10);
        queue5.offer(20);
        queue5.offer(30);
        queue5.offer(40);
        queue5.offer(50);

        Stack<Integer> temp=new Stack<>();
        int k=2;
        for(int i=0;i<k;i++){
            temp.push(queue5.poll());
            queue5.offer(temp.pop());
        }
        System.out.println(queue5);

        /*

        # 2️⃣ PriorityQueue (Heap)

        ## A) Important Concepts & Methods to Practice

        ### Concepts

        * Heap data structure
        * Min Heap behavior (default in Java)
        * Priority ordering
        * Difference between Queue and PriorityQueue

        ### Methods

        Practice using:

        ```
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ```

        * `offer(element)`
        * `poll()`
        * `peek()`
        * `isEmpty()`
        * `size()`

        Also practice **Max Heap**

        ```
        PriorityQueue<Integer> pq =
            new PriorityQueue<>(Collections.reverseOrder());
        ```

        ---

        ## B) Practice Questions

        ### 1. Basic PriorityQueue Operations

        **Problem**

        Create a priority queue and insert the elements:

        ```
        5, 1, 8, 3
        ```

        Remove elements one by one and print them.

        **Example Output**

        ```
        1 3 5 8
        ```

        ---

         */

        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        pQueue.offer(5);
        pQueue.offer(1);
        pQueue.offer(8);
        pQueue.offer(3);

        while(!pQueue.isEmpty()){
            System.out.println(pQueue.poll());
        }
        /*

        ### 2. Find K Smallest Elements

        **Problem**

        Given an array `nums` and an integer `k`, print the `k` smallest elements using a PriorityQueue.

        **Example**

        ```
        Input:
        nums = [7,10,4,3,20,15]
        k = 3

        Output:
        3 4 7
        ```

        ---
        */
        PriorityQueue<Integer> pQueue1 = new PriorityQueue<>();
        int[] nums= new int[]{7,10,4,3,20,15};
        int k2=3;

        for(int i=0;i< nums.length;i++){
            pQueue1.offer(nums[i]);
        }
        for(int i=0;i<k2;i++){
           System.out.print(pQueue1.poll() + "->");
        }
        System.out.print("END");
        System.out.println();

        /*

        ### 3. Find K Largest Elements

        **Problem**

        Given an array `nums` and integer `k`, print the `k` largest elements.

        **Example**

        ```
        Input:
        nums = [7,10,4,3,20,15]
        k = 2

        Output:
        20 15
        ```

        ---
        */
        int[] nums1= new int[]{7,10,4,3,20,15};
        PriorityQueue<Integer> pQueue2 = new PriorityQueue<>(Collections.reverseOrder());
        int k1=2;
        for(int i=0;i<nums1.length;i++){
            pQueue2.offer(nums1[i]);
        }
        for(int i=0;i<k1;i++){
            System.out.print(pQueue2.poll() + "->");
        }
        System.out.print("END");
        System.out.println();

        /*

        ### 4. Sort an Array Using PriorityQueue

        **Problem**

        Given an integer array, use a PriorityQueue to print the elements in sorted order.

        **Example**

        ```
        Input:
        nums = [9,4,7,1]

        Output:
        1 4 7 9
        ```

        ---

        */
        int[] nums3 = new int[] {9,4,7,1,10};
        PriorityQueue<Integer> pQueue3 = new PriorityQueue<>();
        for(int i: nums3){
            pQueue3.offer(i);
        }
        System.out.println(pQueue3);

        /*

        ### 5. Find Kth Smallest Element

        **Problem**

        Given an integer array `nums` and integer `k`, return the `kth` smallest element.

        **Example**

        ```
        Input:
        nums = [7,10,4,3,20,15]
        k = 3

        Output:
        7
        ```

        ---
        */
        int[] nums4= new int[] {7,10,4,3,20,15};
        int k3=3;
        PriorityQueue<Integer> pQueue4 = new PriorityQueue<>();
        for(int i: nums){
            pQueue4.offer(i);
        }
        for(int i=0;i<k3-1;i++){
            pQueue4.poll();
        }
        System.out.println(pQueue4.element());
        /*

        # 3️⃣ ArrayDeque

        ## A) Important Concepts & Methods to Practice

        ### Concepts

        * Double ended queue
        * Insert/remove from both ends
        * Can behave as:

          * Stack
          * Queue

        ### Methods

        Practice using:

        ```
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        ```

        Front operations

        * `addFirst()`
        * `removeFirst()`
        * `peekFirst()`

        Rear operations

        * `addLast()`
        * `removeLast()`
        * `peekLast()`

        General methods

        * `isEmpty()`
        * `size()`

        ---

        ## B) Practice Questions

        ### 1. Basic Deque Operations

        **Problem**

        Create a deque and perform the following operations:

        1. Add `10` at front
        2. Add `20` at rear
        3. Add `5` at front
        4. Remove element from rear

        Print the final deque.

        **Example**

        ```
        Output:
        [5, 10]
        ```

        ---
        */
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.offerFirst(10);
        deque.offerFirst(20);
        deque.offerFirst(5);

        deque.pollLast();
        System.out.println(deque);
        /*

        ### 2. Reverse an Array Using Deque

        **Problem**

        Given an array `nums`, reverse the array using an `ArrayDeque`.

        **Example**

        ```
        Input:
        nums = [1,2,3,4]

        Output:
        [4,3,2,1]
        ```

        ---
        */
        int[] nums5 = new int[]{1,2,3,4};
        ArrayDeque<Integer> deque1 = new ArrayDeque<>();
        for(int i:nums5){
            deque1.offerFirst(i);
        }
        System.out.println(deque1);
        /*

        ### 3. Check Palindrome Using Deque

        **Problem**

        Given a string `s`, check if it is a palindrome using a deque.

        **Example**

        ```
        Input:
        s = "racecar"

        Output:
        true
        ```

        ---
        */

        String s="racecar";
        ArrayDeque<Character> charDeque= new ArrayDeque<>();
        for(char c: s.toCharArray()) {
            charDeque.offer(c);
        }
        boolean check = true;
        while(charDeque.size()>1){
            if(charDeque.pollFirst()!=charDeque.pollLast()){
                check=false;
                break;
            }
        }
        System.out.println(check);


        /*

        ### 4. Remove Elements from Both Ends

        **Problem**

        Given a deque of integers, remove elements from both ends until the size becomes `3`.

        Return the remaining elements.

        **Example**

        ```
        Input:
        deque = [1,2,3,4,5,6]

        Output:
        [2,3,4]
        ```

        ---
        */
        int[] nums6= new int[] { 1,2,3,4,5,6};
        ArrayDeque<Integer> deque2= new ArrayDeque<>();
        for(int i:nums6){
            deque2.offer(i);
        }
        while(deque2.size()>3){
            deque2.pollLast();
            if (deque2.size()>3){
                deque2.pollFirst();
            }
        }
        System.out.println(deque2);
        /*

        ### 5. Implement Stack Using ArrayDeque

        **Problem**

        Use `ArrayDeque` to simulate stack operations:

        * push
        * pop
        * peek

        Perform the following:

        ```
        push(10)
        push(20)
        push(30)
        pop()
        peek()
        ```

        **Output**

        ```
        20
        ```

        ---

         */
        // implemented in StckWithDequeue Class
        StackWithDeque<Integer> stack1 =new StackWithDeque<>();
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);

        int a=stack1.pop();
        int b= stack1.peek();

        System.out.println(a+" "+b);


    }

}
