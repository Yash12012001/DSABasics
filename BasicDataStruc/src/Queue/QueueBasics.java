package Queue;

public class QueueBasics {
    public static void main(String[] args) {
        /*
        Below is the **revised version** of the previous sections with the following fixes you requested:

        * ❌ **Removed use of data structures not yet covered**
        * ❌ **Removed stream-style problems**
        * ✅ **Added “Important Concepts & Methods to Practice” section before questions**
        * ✅ **Questions only use concepts you have already learned:**

          * Arrays
          * ArrayList
          * Stack
          * Queue
          * PriorityQueue
          * ArrayDeque
          * Strings
        * ✅ **Minimal questions — just enough to get comfortable**

        ---

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

        ---

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

        ✅ Now the problems strictly follow your constraints:

        * No **HashMap / HashSet / TreeSet / TreeMap**
        * No **Streams**
        * Only previously covered structures used
        * Each section includes **concepts + methods before questions**

        ---

        If you'd like, I can also create a **final structured checklist of ALL questions across every data structure you mentioned** so you can **track progress like a mini DSA curriculum**.

         */
    }

}
