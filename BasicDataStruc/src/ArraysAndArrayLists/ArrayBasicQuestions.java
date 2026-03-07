package ArraysAndArrayLists;

import java.util.*;

public class ArrayBasicQuestions {




    public static void main(String[] args) {
        /* 1. Insert Element at Index
      Problem:
           Given an integer array nums of size n, insert an element x at index k.
           Shift the remaining elements to the right.

           Assume the array has enough capacity to store the new element.

           Example:
           Input: nums = [1, 2, 3, 4], x = 10, k = 2
           Output: [1, 2, 10, 3, 4]
     */


        int [] nums =new int[5];
        nums[0]=1;
        nums[1]=2;
        nums[2]=3;
        nums[3]=4;

        int x=10;
        int k=2;
        for(int i=nums.length-1;i>k;i--){
            nums[i]=nums[i-1];
        }
        nums[k]=x;
        System.out.println(Arrays.toString(nums));

        /*  2. Delete Element from Array

        Problem:
        Given an array nums and an index k, delete the element at index k and
         shift all elements to the left.

         Example:
         Input: nums = [5, 10, 15, 20], k = 1
         Output: [5, 15, 20]
     */

        int[] nums1 = {5,10,15,20};
        int k1=1;
        int[] ans1 = new int[nums1.length-1];

        for(int i=k1;i< nums1.length-1;i++){
            nums1[i]+=nums1[i+1];
            nums1[i+1]=nums1[i]-nums1[i+1];
            nums1[i]=nums1[i]-nums1[i+1];
        }
        for(int i=0;i< ans1.length;i++){
            ans1[i]=nums1[i];
        }
        System.out.println(Arrays.toString(ans1));

        /*
        3. Find Maximum Element

        Problem:
        Given an integer array nums, return the largest element in the array.

        Example:
            Input: nums = [3, 7, 2, 9, 4]
            Output: 9
         */

        int[] nums2={3,7,2,9,4};
        int max = Integer.MIN_VALUE;
        for(int i=0;i< nums2.length-1;i++){
            max=Integer.max(nums2[i],nums2[i+1]);
        }
        System.out.println(max);

        /*
        4. Reverse an Array

        Problem:
        Given an integer array nums, reverse the array in-place.

        Example:
        Input: nums = [1,2,3,4,5]
        Output: [5,4,3,2,1]
         */
        int[] nums3 ={1,2,3,4,5};
        int s=0;
        int e= nums3.length-1;

        while (e>s){
            nums3[s]+=nums3[e];
            nums3[e]=nums3[s]-nums3[e];
            nums3[s]=nums3[s]-nums3[e];
            s++;
            e--;
        }
        System.out.println(Arrays.toString(nums3));

        /*
        5. Remove Duplicates from Array

        Problem:
        Given an array nums, remove duplicate elements and return the array containing only unique elements.

        Example:
        Input: nums = [1,2,2,3,4,4,5]

        Output: [1,2,3,4,5]

        Note: do it only using arrays
         */

        int[] nums4 ={1,2,3,2,4,4,5};
        Arrays.sort(nums4);
        int rd=0;
        for(int i=1;i<nums4.length;i++){
            if(nums4[rd]!=nums4[i]){
                rd++;
                System.out.println(rd + " " + i);
                nums4[rd]=nums4[i];
            }
        }
        for(int i=0;i<=rd;i++){
            System.out.print(" "+ nums4[i]);
        }



    }






}
