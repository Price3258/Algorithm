package reetcode;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

/*
Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Note that you cannot sell a stock before you buy one.


 */

public class BestTimeToBuyAndSellStock {

    @Test
    public void test(){

        int[] prices = new int[]{ 7,1,5,3,6,4 };

        Assert.assertThat( maxProfit( prices ), Is.is(5) );


        prices = new int[]{  7,6,4,3,1  };

        Assert.assertThat( maxProfit( prices ), Is.is(0) );

        prices = new int[]{  1,2 };

        Assert.assertThat( maxProfit( prices ), Is.is(1) );


    }

    public int maxProfit(int[] prices) {

        int max, minPrice,length ;

        max = 0;

        minPrice = 0;

        length = prices.length;


        for ( int i = length-1 ; i >= 0 ; i-- ){
            if( i == 0)
                break;

            if( prices[i] < prices[i-1] ){
                continue;
            }
            minPrice = prices[i-1];

            for( int j = i; j < length ; j++ ){
                max = Math.max(max , prices[j] - minPrice );
            }

        }

        return max;
    }
}
