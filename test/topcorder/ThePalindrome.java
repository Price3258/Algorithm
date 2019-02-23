package topcorder;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ThePalindrome {


    @Test
    public void test(){

//        Assert.assertThat( solution("abab"), Is.is(4) );
//        Assert.assertThat( solution("abacaba"), Is.is(7) );
//        Assert.assertThat( solution("qwerty"), Is.is(11) );
        Assert.assertThat( solution("abba"), Is.is(4) );
        Assert.assertThat( solution("abcba"), Is.is(5) );
        Assert.assertThat( solution("qwerty"), Is.is(11) );

    }

    private int solution(String s){

        char[] strArr = s.toCharArray();

        StringBuilder reverseStr = new StringBuilder();

        Map<String, Integer> map = new HashMap<>();

//        /*
//        for ( int j = strArr.length ; j > 0 ; j--) {
//            if (s.length() % 2 == 0) {
//                for (int i = strArr.length - j ; i >= s.length() / 2; i-- ) {
//                    reverseStr.append(strArr[i]);
//                }
//                if (reverseStr.toString().equals(s.substring(0, s.length() / 2))) {
//                    return s.length();
//                }
//
//            } else {
//                for (int i = strArr.length - j ; i > s.length() / 2; i-- ) {
//                    reverseStr.append(strArr[i]);
//                }
//                if (reverseStr.toString().equals(s.substring(0, s.length() / 2))) {
//                    return s.length();
//                }
//
//            }
//        }
//        */
        int min = s.length();
        int cur = 1;

        for( int i = s.length() ; i > 0; i--){
             for (int j = strArr.length  ; j < ( s.length() -i ) / 2; j-- ) {
                 reverseStr.append(strArr[j]);

                 if( reverseStr.toString().equals(s.substring(0, s.length() / 2 -j ))){
                     if( min > cur ){
                         min = cur;
                     }
                     cur = reverseStr.length()*2;

                 }else {

                 }
             }





             reverseStr.setLength(0);
        }

        return min;
    }

}
