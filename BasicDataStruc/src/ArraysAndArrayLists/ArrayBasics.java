package ArraysAndArrayLists;
import java.util.*;

public class ArrayBasics {
    public static void main(String[] args) {

        //Declaration of arrays and ArrayList
        int[] num=new int[5];
        ArrayList<Integer> nums = new ArrayList<>();

        System.out.println(num);
        System.out.println(nums);


        //adding element to array
        num[1]=5;

        //adding element to arryList
        //.add()
        //.add(index,value)
        nums.add(5);
        nums.add(1,4);

        System.out.println(Arrays.toString(num));
        System.out.println(nums);

        //getting the value from array
        int n=num[0];
        System.out.println(n);

        //getting and setting element from arrayList
        //.get(index) & .set(index,value);
        int n1=nums.get(0);
        nums.set(1,6);
        System.out.println(n1);
        System.out.println(nums);


        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(10);

        //removing an element from array is not possible as the size is fixed
        //removing an element from arrayList is possible
        //.remove(index)
        //.remove(object)
        nums.remove(0);
        System.out.println(nums);
        nums.remove(Integer.valueOf(10));
        System.out.println(nums);

        //checking if an element exists in an array lists , not possible in arrays
        //in arrays you need to perform manual searching
        System.out.println(nums.contains(Integer.valueOf(7)));

        //finding the size of arrays and array lists
        //arrays -> .length as lengt is a property of array not a function
        //arrayLists -> .size()
        System.out.println(num.length);
        System.out.println(nums.size());

        //clearing an array is not possible however clearing an arrayList is
        nums.clear();
        System.out.println(nums);

        //adding elements to demonstrate futher concepts
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(10);
        num[0]=4;
        num[2]=6;
        num[3]=7;
        num[4]=8;

        //Iterating arrays and arrayLists
        //1. iterating using a for loop
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
        for(int i=0;i<nums.size();i++){
            System.out.println(nums.get(i));
        }

        //2.iterating through advance for loop
        for(int i: num){
            System.out.println(i);
        }
        for(int i:nums){
            System.out.println(i);
        }

        //3. iterating using a iterator. not possible for arrays
        Iterator<Integer> iterator = nums.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //inbuild sorting for arrays and array lists
        Arrays.sort(num);
        Collections.sort(nums);

        System.out.println(Arrays.toString(num));
        System.out.println(nums);
    }
}
