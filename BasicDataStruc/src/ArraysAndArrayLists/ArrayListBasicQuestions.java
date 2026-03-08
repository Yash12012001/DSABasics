package ArraysAndArrayLists;
import java.util.*;
public class ArrayListBasicQuestions {

    public static void main(String[] args) {

        /*
    1. Insert Element in ArrayList

        Problem:
        You are given an empty ArrayList<Integer>.
        Add the elements 5, 10, 15, 20 to the list and insert the element 12 at index 2.

        Return the final list.

     */
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(5,10,15,20));
        int e=12;
        int index=2;

        nums.add(0);
        for(int i=nums.size()-1;i>index;i--){
            nums.set(i, nums.get(i-1));
            nums.set(i-1,0);
        }
        nums.set(index,e);
        System.out.println(nums);

        /*
        2. Remove Element from ArrayList

        Problem:
        Given an ArrayList<Integer> list, remove the element at index k.

        Return the updated list.

        Example:
        Input: list = [5, 10, 15, 20], k = 2
        Output: [5, 10, 20]
         */
        ArrayList<Integer> nums1 =new ArrayList<>(Arrays.asList(5,10,15,20));
        nums1.remove(2);
        System.out.println(nums1);

        /*
        3. Find Maximum Element in ArrayList

        Problem:
        Given an ArrayList<Integer> list, return the maximum element in the list.

        Example:
        Input: list = [4, 7, 1, 9, 3]

        Output: 9
         */
        ArrayList<Integer> nums2 =new ArrayList<>(Arrays.asList(4,7,1,9,3));
        int max=Integer.MIN_VALUE;
        for(int i:nums2){
            max=Integer.max(max,i);
        }
        System.out.println(max);

        /*
        5. Remove Even Numbers

        Problem:
        Given an ArrayList<Integer> list, remove all even numbers and return the updated list.

        Example:
        Input: list = [1,2,3,4,5,6]

        Output: [1,3,5]
         */

        ArrayList<Integer> nums3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        for(int i=0;i<nums3.size();i++){
            if(nums3.get(i)%2==0){
                nums3.remove(i);
            }
        }
        System.out.println(nums3);

        /*
        7. Remove Duplicates from ArrayList

        Problem:
        Given an ArrayList<Integer> list, remove duplicate elements while preserving the
        order of the first occurrence.

        Example:
        Input: list = [1,2,2,3,4,4]

        Output: [1,2,3,4]
         */
        ArrayList<Integer> nums4 = new ArrayList<>(Arrays.asList(1,2,2,3,4,4));
        int rd=0;
        for(int i=1;i<nums4.size();i++){
            if(nums4.get(rd)==nums4.get(i)){
                nums4.remove(i);
                i--;
            }else{
                rd++;
            }
        }
        System.out.println(nums4);

    }


}
