package basic;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class isAnagramTest {

    @Test
    public void test(){

        Assert.assertThat(solution("arc","car"), Is.is(true));
        Assert.assertThat(solution("abcc","cabc"), Is.is(true));

        Assert.assertThat( use_map("haribo","obriah"), Is.is(true));

    }


    private boolean solution(String str1, String str2){

        if(str1.length()!=str2.length())
            return false;


        char[] strArr1 = str1.toCharArray();
        char[] strArr2 = str2.toCharArray();


        Arrays.sort( strArr1 );
        Arrays.sort( strArr2 );

        for( int i = 0 ; i < strArr1.length; i++){
            if(strArr1[i]!=strArr2[i])
                return false;
        }

        return true;
    }

    private boolean use_map(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        Map<Character, Integer> strMap = new HashMap<>();

        for (char c : str1.toCharArray()) {
            if (strMap.containsKey(c)) {
                strMap.put(c, strMap.get(c) + 1);
            } else {
                strMap.put(c, 1);
            }
        }

        for (char c : str2.toCharArray()) {
            if (!strMap.containsKey(c)) {
                return false;
            }
            if (strMap.get(c) == 0) {
                return false;
            }
            strMap.put(c, strMap.get(c) - 1);
        }

        return true;
    }


}
