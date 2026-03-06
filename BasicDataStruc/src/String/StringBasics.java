package String;
import java.util.*;

public class StringBasics {
    public static void main(String[] args) {

        // instanciate in two ways:
        //using string literals

        String str= "Hello";
        System.out.println(str=="Hello");

        //using new Keyword

        String string = new String("Hello");
        System.out.println(string=="Hello");

        // length of string
        int length = string.length();
        System.out.println(length);

        //iteration Using charAt()
        for(int i=0;i<length;i++) {
            System.out.println(string.charAt(i));
        }

        //substring function
        //using two index
        System.out.println(string.substring(0, 3));
        //using only first index
        System.out.println(string.substring(2));

        //equals and equalsIgnoreCase()
        System.out.println(string.equals(str));
        System.out.println(string.equalsIgnoreCase(str));

        //to char array
        System.out.println(string.toCharArray());

        //split logic
        String trySplit="hel:lo";
        String[] splitString = trySplit.split(":");
        for(String strr:splitString) {
            System.out.println(strr);
        }

        //trim() it trims spaces from the start and end of string
        String trimString= "  hello  ";
        System.out.println("with space:" + trimString);
        System.out.println("without Space:" + trimString.trim());

        // when we add two char 'a'+'b' -> the askii value is added 97+98=195
        //when we add two String "a" + "b" -> the string are concatenated "ab"
        // when we add an object to string -> the object is converted
        //to string using toString method and then concatenated with the string
        //"a" +1 -> converted to "a" +"1" -> "a1"

        System.out.println('a' + 'b');// -> 195
        System.out.println("a"+"b");//-> ab
        System.out.println('a' + 1);//-> 98
        System.out.println("a" + 1);//-> a1

        /************** String Builder Concepts ***************/
        // String Builder is a class implemented to solve string immutability issue
        //for memory optimization as if string is updated in any form it creates a new
        //object every time
        // String Builder -> Mutable String
        // this class has a lot of methods of its own

        StringBuilder builder = new StringBuilder();

        //apend a to empty string
        builder.append("a");
        System.out.println(builder);

        //append 1 to existing string
        builder.append(1);
        System.out.println(builder);

        //delete the char at 0 index
        builder.deleteCharAt(0);
        System.out.println(builder);

        builder.append("abcdef");
        System.out.println(builder);

        // delete the charecters from 2nd index to 4th index
        builder.delete(2,4);
        System.out.println(builder);

        //get length of string
        System.out.println(builder.length());

        //insert string from given index
        builder.insert (3,"HI");
        System.out.println(builder);

        //search a string pattern in string and start searching from given index
        //it will return the index of the first character in seq at its first occurrence
        System.out.println(builder.indexOf("HI",2));

        //reverse string
        //thing to remember here .reverse() will nit just return a reversed String Builder
        //-> It will actually reverse it in the memory
        System.out.println(builder.reverse());

        //update a char aat given index
        builder.setCharAt(5,'5');
        System.out.println(builder);

    }

}
