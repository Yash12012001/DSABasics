package LinkedList;

import java.util.*;

public class LinnkedListBasics {
    public static void main(String[] args) {

        /*

        # 1️⃣ LinkedList (Used as List)

        ## A) Important Concepts & Methods to Practice

        ### Concepts

        * Dynamic list structure
        * Doubly linked nodes
        * Efficient insertion/deletion compared to arrays
        * Traversal of linked nodes
        * Difference between `ArrayList` and `LinkedList`

        ### Methods

        Practice using:

        ```java
        LinkedList<Integer> list = new LinkedList<>();
        ```

        Insertion

        * `add(element)`
        * `addFirst(element)`
        * `addLast(element)`
        * `add(index, element)`

        Access

        * `get(index)`
        * `getFirst()`
        * `getLast()`

        Update

        * `set(index, element)`

        Deletion

        * `remove(index)`
        * `removeFirst()`
        * `removeLast()`
        * `remove(Object)`

        General

        * `size()`
        * `isEmpty()`
        * Iterating using loops

        ---
        */


        /*

        ## B) Practice Questions

        ### 1. Basic LinkedList Operations

        **Problem**

        Create an empty linked list and perform the following operations:

        1. Add elements `10, 20, 30`
        2. Insert `5` at the beginning
        3. Insert `25` at index `3`
        4. Remove the last element

        Print the final list.

        **Example**

        ```
        Output:
        [5, 10, 20, 25]
        ```

        ---
        */
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.addFirst(5);
        linkedList.set(3,25);

        System.out.println(linkedList);
        /*

        ### 2. Find Maximum Element

        **Problem**

        Given a linked list of integers, find the maximum element in the list.

        **Example**

        ```
        Input:
        list = [3, 7, 2, 9, 4]

        Output:
        9
        ```

        */
        LinkedList<Integer> linkedList1= new LinkedList<>();

        int[] nums=new int[] {3,7,2,9,4};
        for(int i:nums){
            linkedList1.add(i);
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<linkedList1.size();i++){
            max=Integer.max(max,linkedList1.get(i));
        }
        System.out.println(max);

        /*

        ### 3. Reverse a LinkedList

        **Problem**

        Given a linked list of integers, reverse the list.

        **Example**

        ```
        Input:
        list = [10, 20, 30, 40]

        Output:
        [40, 30, 20, 10]
        ```

        *(You may use a stack if needed.)*

        */
        int[] nums1= new int[] {10,20,30,40};
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        for(int i: nums1){
            linkedList2.add(i);
        }
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<linkedList2.size();i++){
            stack.push(linkedList2.get(i));
        }
        for(int i=0;i<linkedList2.size();i++){
            linkedList2.set(i,stack.pop());
        }
        System.out.println(linkedList2);
        /*

        ### 4. Remove Even Numbers

        **Problem**

        Given a linked list of integers, remove all even numbers from the list.

        **Example**

        ```
        Input:
        list = [1,2,3,4,5,6]

        Output:
        [1,3,5]
        ```

        */

        /*

        ### 5. Find Middle Element

        **Problem**

        Given a linked list, return the middle element.

        If the list has an even number of elements, return the second middle element.

        **Example**

        ```
        Input:
        list = [10,20,30,40,50]

        Output:
        30
        ```

        ---

        ### 6. Count Occurrences of Element

        **Problem**

        Given a linked list and an integer `x`, count how many times `x` appears.

        **Example**

        ```
        Input:
        list = [5,10,5,20,5]
        x = 5

        Output:
        3
        ```

        ---

        # 2️⃣ LinkedList (Used as Queue)

        ## A) Important Concepts & Methods to Practice

        ### Concepts

        * FIFO behavior
        * Front and rear of queue
        * Insertion at rear
        * Removal from front
        * LinkedList implementing Queue interface

        ### Methods

        Practice using:

        ```java
        Queue<Integer> queue = new LinkedList<>();
        ```

        Queue operations

        * `offer(element)`
        * `poll()`
        * `peek()`

        Additional LinkedList methods

        * `addFirst()`
        * `addLast()`
        * `removeFirst()`
        * `getFirst()`

        General methods

        * `isEmpty()`
        * `size()`
        * Traversal

        ---

        ## B) Practice Questions

        ### 1. Basic Queue Operations

        **Problem**

        Create a queue using LinkedList and perform the following operations:

        1. Insert `10, 20, 30, 40`
        2. Remove one element
        3. Print the queue
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
        queue = [10,20,30,40]

        Output:
        [40,30,20,10]
        ```

        *(Hint: You may use a stack.)*

        ---

        ### 3. Find Minimum Element in Queue

        **Problem**

        Given a queue of integers, find the smallest element without permanently removing elements.

        **Example**

        ```
        Input:
        queue = [5, 8, 2, 9]

        Output:
        2
        ```

        ---

        ### 4. Count Odd Numbers in Queue

        **Problem**

        Given a queue of integers, count the number of odd elements.

        **Example**

        ```
        Input:
        queue = [1,2,3,4,5]

        Output:
        3
        ```

        ---

        ### 5. Rotate Queue

        **Problem**

        Given a queue and an integer `k`, move the first `k` elements to the back of the queue.

        **Example**

        ```
        Input:
        queue = [10,20,30,40,50]
        k = 3

        Output:
        [40,50,10,20,30]
        ```

        ---

        ### 6. Print Queue Without Losing Elements

        **Problem**

        Given a queue, print all elements without permanently removing them.

        **Example**

        ```
        Input:
        queue = [5,10,15]

        Output:
        5 10 15
        ```
  */
    }
}
