package basic;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CompressTest {

    @Test
    public void test(){


        Assert.assertThat( getCompressArr("teettt"), Is.is("t4e2"));
        //Assert.assertThat( getCompressArr("wisenut"), Is.is("w1i1s1e1n1u1t1"));
        Assert.assertThat( getCompressArr("aabbccc"), Is.is("a2b2c3"));



    }


    private String getCompressArr(String str){

        StringBuffer comp = new StringBuffer();

        Map<Character, Integer> map = new HashMap<>();

        char[] strArr = str.toCharArray();

        for( int i=0; i < str.length(); i++ ){

            if( !map.containsKey(strArr[i])){
                map.put(strArr[i],0);
            }

            map.put(strArr[i], map.get(strArr[i]) + 1);

        }

        StringBuilder sb = new StringBuilder();
        map.forEach((chr, count) -> sb.append(chr + count.toString()));

        return sb.toString();
    }
}
