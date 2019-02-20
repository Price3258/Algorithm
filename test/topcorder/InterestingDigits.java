package topcorder;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class InterestingDigits {


    @Test
    public void test(){

        Assert.assertThat( solution(10), Is.is( new int[]{3,9} ));

        Assert.assertThat( solution(3), Is.is( new int[]{2} ));

        Assert.assertThat( solution(9), Is.is( new int[]{ 2, 4, 8 } ));

        Assert.assertThat( solution(26), Is.is( new int[]{ 5, 25 } ));

        Assert.assertThat( solution(30), Is.is( new int[]{ 29 } ));

    }


    private int[] solution(int base){


        ArrayList<Integer> arr = new ArrayList<>();

        for ( int i = 2 ; i < base ; i++){

            if((base-1)%i == 0)
                arr.add(i);
        }

        int[] answer = new int[arr.size()];

        for( int i = 0 ; i < arr.size(); i++){
            answer[i] = arr.get(i);
        }



        return answer;
    }
}
