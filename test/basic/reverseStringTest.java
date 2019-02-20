package basic;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

// 역순 String
public class reverseStringTest {


    @Test
    public void test(){
            Assert.assertThat(solution("abc"),Is.is("cba"));
        Assert.assertThat(solution("test"),Is.is("tset"));
    }

    private String solution(String str){

        char[] reverseStr = str.toCharArray();

        StringBuffer reverse = new StringBuffer();

        for(int i = reverseStr.length-1 ; i >= 0 ; i--){

            reverse.append(reverseStr[i]);
            System.out.println(reverse);
        }


        return reverse.toString();
    }



}
