package leetcode;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/*

number 242

Given two strings s and t , write a function to determine if t is an anagram of s.

Input: s = "anagram", t = "nagaram"
Output: true

Input: s = "rat", t = "car"
Output: false


Note:
You may assume the string contains only lowercase alphabets.

Follow up:
What if the inputs contain unicode characters? How would you adapt your solution to such case?



 */

public class ValidAnagram {

    @Test
    public void test(){
        String s = "anagram";
        String t = "nagaram";

        Assert.assertThat( isAnagram(s,t) , Is.is(true));

        s = "rat";
        t = "car";

        Assert.assertThat( isAnagram(s,t) , Is.is(false));



    }


    private boolean isAnagram(String s, String t) {
        if( s.length() != t.length())
            return false;

        char[] sArr = s.toLowerCase().toCharArray();
        char[] tArr = t.toLowerCase().toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);


        int length = sArr.length;

        for( int i =0 ; i < length ; i++){
            if( sArr[i] != tArr[i])
                return false;
        }
        return true;
    }
}
