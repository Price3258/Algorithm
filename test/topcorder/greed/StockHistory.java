package topcorder.greed;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class StockHistory {


    @Test
    public void test(){
        String[] stockPrices = new String[]{"10 20 30", "15 24 32"};
        Assert.assertThat(maximumEarnings(1000,0, stockPrices), Is.is(500));

        stockPrices = new String[]{ "10", "9" };
        Assert.assertThat(maximumEarnings(1000,0, stockPrices), Is.is(0));


        stockPrices = new String[]{"40 50 60", "37 48 55", "100 48 50", "105 48 47", "110 50 52", "110 50 52", "110 51 54", "109 49 53"};
        Assert.assertThat(maximumEarnings(100,20, stockPrices), Is.is(239));


    }


    private int maximumEarnings(int initialInvestment, int monthlyContribution, String[] stockPrices){

        int max = 0;
        int[] corp = new int[stockPrices[0].length()];

        int y = stockPrices.length;
        int x = stockPrices[0].split(" ").length;


        int[][] stocks = new int[y][x];

        for(int i = 0 ; i < y ; i++){
            for( int j = 0 ; j < x ; j++){
                //stocks[i][j] = stockPrices[i].split(" ");
            }
        }






        return max;
    }
}
