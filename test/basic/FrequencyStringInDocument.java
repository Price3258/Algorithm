package basic;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FrequencyStringInDocument {


    @Test
    public void test(){
        String[] arr = new String[100];

        Assert.assertThat(countStringDocs(arr,null), Is.is(0));
        arr[0] = "test";
        Assert.assertThat(countStringDocs(arr,"test"), Is.is(1));
        arr[1] = "test";
        Assert.assertThat(countStringDocs(arr,"test"), Is.is(2));
        arr[2] = "test";
        Assert.assertThat(countStringDocs(arr,"test"), Is.is(3));

        arr[3] = "java";
        Assert.assertThat(countStringDocs(arr,"java"), Is.is(1));


    }


    private int countStringDocs(String[] arr,String target){

        if (arr == null || target == null) return 0;

        Map<String,Integer> map = new HashMap<>();

        for (String s : arr) {

            if (!map.containsKey(s)) {
                map.put(s, 1);

            }else{
                map.put(s, map.get(s) + 1);
            }
        }

        return map.get(target);
    }
}
