package Set;

import java.util.HashSet;

public class HashSetPractice {

    public static void main(String[] args) {
        /*
        1️⃣ HashSet
            A) Important Concepts & Methods to Practice
            Concepts
            -Stores unique elements only
            -No ordering guaranteed
            -Backed by hashing
            -Fast operations → O(1) average
            -Duplicate elements are ignored

            Methods
            -HashSet<Integer> set = new HashSet<>();
            -add(element)
            -remove(element)
            -contains(element)
            -size()
            -isEmpty()

            ***Iteration
            1.using advance for loop
            for (String s : set) {
                 System.out.println(s);
            }

            2. using iterator

            Iterator<Integer> iterator = set.iterator();
            while (iterator.hasNext()) {
                Integer element = iterator.next();
                if (element % 2 == 0) {
                iterator.remove(); // Safely removes the current element
                }
            }
         */

        /*
        1. Basic HashSet Operations

            Problem

            Create a HashSet and perform the following:

            Add elements 10, 20, 30, 20, 10
            Remove element 20
            Print all elements
         */

        HashSet<Integer> hashSet =new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(20);
        hashSet.add(10);
        hashSet.remove(20);
        System.out.println(hashSet);

        /*
        2. Remove Duplicates from Array

            Problem

            Given an integer array nums, remove duplicates using a HashSet
             and return the unique elements.

            Example
            Input:
            nums = [1,2,2,3,4,4,5]

            Output:
            [1,2,3,4,5]
         */
        int [] nums = {1,2,2,3,4,4,5};
        HashSet<Integer> hashSet1 = new HashSet<>();
        for (int i: nums){
            hashSet1.add(i);
        }
        System.out.println(hashSet1);

        /*
        3. Check Element Existence

            Problem

            Given an array nums and an integer x, check if x exists in
            the array using a HashSet.

            Example
            Input:
            nums = [5,10,15,20]
            x = 15

            Output:
            true
         */
        int [] nums2 = {5,10,15,20};
        int x=15;
        HashSet<Integer> hashSet2 = new HashSet<>();
        for(int i: nums2){
            hashSet2.add(i);
        }
        System.out.println(hashSet2.contains(x));

        /*
        4. Count Distinct Elements

            Problem

            Given an integer array nums, return the count of distinct elements.

            Example
            Input:
            nums = [1,2,2,3,3,3]

            Output:
            3
         */
        int [] nums3 = {1,2,2,3,3,3,3};
        HashSet<Integer> hashSet3 = new HashSet<>();
        for (int i: nums3){
            hashSet3.add(i);
        }
        System.out.println(hashSet3.size());

        /*
        5. Find First Repeating Element

            Problem

            Given an array nums, return the first element that appears more than once.
            Input:
            nums = [5,3,4,3,5,6]

            Output:
            3
         */
        int [] nums4 ={5,3,4,3,5,6};
        HashSet<Integer> hashSet4 = new HashSet<>();
        for (int i: nums4){
            if(hashSet4.contains(i)){
                System.out.println(i);
                break;
            } else{
                hashSet4.add(i);
            }
        }

    }
}
