package String;
import java.security.Key;
import java.util.*;

public class StringBasicQuestions {

    /*
    1.	Reverse a string without using built-in reverse.
    2.	Check if a string is a palindrome.
    3.	Count frequency of characters using only string methods.
    4.	Reverse words in a sentence.
    5.	Remove duplicate characters from a string.
    6.	Check if two strings are anagrams.
    7.	Compress string (aaabb → a3b2).
    8.	Modify a string efficiently using StringBuilder.

     */
    public static void main(String[] args) {

        //1.	Reverse a string without using built-in reverse.

        String str = "Reverse This String";
        StringBuilder builder = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            builder.append(str.charAt(i));
        }
        System.out.println(builder);// output "gnirtS sihT esreveR"


        //Check if a string is a palindrome. without using built in reverse

        String str1 = "NitinA";
        String pal = str1.toLowerCase();

        int start = 0;
        int end = str1.length() - 1;
        boolean checkPal = true;

        while (end > start) {
            if (pal.charAt(start) == pal.charAt(end)) {
                start++;
                end--;
            } else {
                checkPal = false;
                break;
            }

        }
        if (checkPal) {
            System.out.println("its a palindrome");
        } else {
            System.out.println("its not a palindrome");
        }

        // 3.	Count frequency of characters using only string methods.

        String str2= "programming";

        Map<String,Integer> freqMap= new LinkedHashMap<>();
        for(int i=0;i<str2.length();i++){
            if(freqMap.containsKey(String.valueOf(str2.charAt(i)))){
                Integer fre=freqMap.get(String.valueOf(str2.charAt(i)))+1;
                freqMap.put(String.valueOf(str2.charAt(i)),fre);
            }else{
                freqMap.put(String.valueOf(str2.charAt(i)),1);
            }
        }

        for(String k: freqMap.keySet()){

            System.out.println(k +"->" + freqMap.get(k));

        }

        // 4.	Reverse words in a sentence.
        //ex-> "I Love Java" -> "Java Love I"

        String str3 = "I Love Java";

        StringBuilder builder1 = new StringBuilder();
        StringBuilder ans = new StringBuilder();

        for(int i=str3.length()-1;i>=0;i--){
            if(str3.charAt(i)==' '){
                ans.append(' ');
                ans.append(builder1.reverse());
                builder1.delete(0,builder1.length());
            }else{
                builder1.append(str3.charAt(i));
            }
            if(i==0){
                ans.append(' ');
                ans.append(builder1.reverse());
                builder1.delete(0,builder1.length());
            }

        }
        System.out.println(ans.toString().trim());

        //5.Remove duplicate characters from a string.
        //Input: s = "programming"
        //Output: "progamin"

        String str4 = "programming";
        Set<Character> charSet = new LinkedHashSet<>();

        for(int i=0;i<str4.length();i++){
            charSet.add(str4.charAt(i));
        }
        StringBuilder noDupliStirng = new StringBuilder();
        for(Character c: charSet){
            noDupliStirng.append(c);
        }
        System.out.println(noDupliStirng);

        //6.	Check if two strings are anagrams.
        //Input: s = "listen", t = "silent"
        //Output: true
        String s ="listen";
        String t ="silent";
        boolean checkAna=false;
        int[] character= new int[26];

        for(int i=0;i<s.length();i++){
            character[s.charAt(i)-'a']++;
            character[t.charAt(i)-'a']--;
        }
        for(int i:character){
            if(i!=0){
                checkAna=false;
                break;
            }else{
                checkAna=true;
            }
        }
        System.out.println(checkAna);

        // 7.	Compress string (aaabb → a3b2).

        String str7= "aaabb";
        int[] compr = new int[26];
        for(int i=0;i<26;i++){
            compr[i]=0;
        }
        for(int i=0;i<str7.length();i++){
            compr[str7.charAt(i)-'a']++;
        }
        StringBuilder compressedString = new StringBuilder();
        for(int i=0;i<26;i++){
            if(compr[i]>0){
                char c= (char)('a'+i);
                compressedString.append(c);
                compressedString.append(compr[i]);

            }
        }
        System.out.println(compressedString);

    }


}
