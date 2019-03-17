package topcorder.dp;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class HandShaking {


    @Test
    public void test(){

        Assert.assertThat(countPerfect(2), Is.is(1L));

        Assert.assertThat(countPerfect(4), Is.is(2L));

        Assert.assertThat(countPerfect(8), Is.is(14L));

    }

    private long countPerfect(int n){

        long[] dp = new long[n/2+1];

        dp[0]=1;

        for( int i =1 ; i<= n/2; i++){
            dp[i]=0;

            for(int j =0; j<i; j++){
                dp[i] += dp[j] * dp[i-j-1];
            }
        }

        return dp[n/2];
    }

}

