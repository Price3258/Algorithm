package topcorder.dp;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

/*
0)
{ 10, 3, 2, 5, 7, 8 }
Returns: 19
The maximum donation is 19, achieved by 10+2+7. It would be better to take 10+5+8 except that the 10 and 8 donations are from neighbors.
1)
{ 11, 15 }
Returns: 15
2)
{ 7, 7, 7, 7, 7, 7, 7 }
Returns: 21
3)
{ 1, 2, 3, 4, 5, 1, 2, 3, 4, 5 }
Returns: 16
4)
{ 94, 40, 49, 65, 21, 21, 106, 80, 92, 81, 679, 4, 61, 6, 237, 12, 72, 74, 29, 95, 265, 35, 47, 1, 61, 397, 52, 72, 37, 51, 1, 81, 45, 435, 7, 36, 57, 86, 81, 72 }
Returns: 2926
 */
public class BadNeighbors {

    @Test
    public void test(){

        int[] donations = new int[]{ 10, 3, 2, 5, 7, 8 };
        Assert.assertThat( maxDonations(donations) , Is.is(19) );

        donations = new int[]{ 11, 15 };
        Assert.assertThat( maxDonations(donations) , Is.is(15) );

        donations = new int[]{ 7, 7, 7, 7, 7, 7, 7 };
        Assert.assertThat( maxDonations(donations) , Is.is(21) );

        donations = new int[]{ 1, 2, 3, 4, 5, 1, 2, 3, 4, 5 };
        Assert.assertThat( maxDonations(donations) , Is.is(16) );


    }


    private int maxDonations(int[] donations){


        int length = donations.length;
        int max = 0;
        int[] dp = new int[length];

        for( int i =0 ; i < length-1 ; i++){
            dp[i] = donations[i];

            if(i > 0 ){
                dp[i] = Math.max(dp[i],dp[i-1]);
            }
            if(i > 1 ){
                dp[i] = Math.max(dp[i],dp[i-2]+donations[i]);
            }
            max = Math.max(max,dp[i]);

        }

        for( int i =1 ; i < length ; i++){
            dp[i] = donations[i];

            if(i > 1 ){
                dp[i] = Math.max(dp[i],dp[i-1]);
            }
            if(i > 2 ){
                dp[i] = Math.max(dp[i],dp[i-2]+donations[i]);
            }
            max = Math.max(max,dp[i]);

        }



        return max;
    }


}
