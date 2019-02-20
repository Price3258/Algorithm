package topcorder;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Cryptography {

    @Test
    public void test(){

        int[] A = new int[]{1,2,3};

        Assert.assertThat( solution(A), Is.is(12) );

        int[] B = new int[]{1,3,2,1,1,3};
        Assert.assertThat( solution(B), Is.is(36) );


        int[] C = new int[]{1,1,1,1};
        Assert.assertThat( solution(C), Is.is(2) );


    }

    private int solution( int[] A){

        int max = 1;
        int cur = 1;

        Arrays.sort(A);


        for(int i = 0; i < A.length; i++){
            if( cur < max ){
                cur = max;
            }
            max = 1;
            A[i] = A[i]+1;

            for (int j : A) {
                max *= j;

            }

            A[i] = A[i]-1;
        }



        return cur;
    }
}
