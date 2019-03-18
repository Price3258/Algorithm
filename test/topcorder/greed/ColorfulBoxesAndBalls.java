package topcorder.greed;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ColorfulBoxesAndBalls {

    @Test
    public void test(){

        Assert.assertThat(getMaximum(2,3,100,400,200), Is.is(1400));

        Assert.assertThat(getMaximum(2,3,100,400,300), Is.is(1600));

        Assert.assertThat(getMaximum(5,5,464,464,464), Is.is(4640));

        Assert.assertThat(getMaximum(1,4,20,-30,-10), Is.is(-100));

        Assert.assertThat(getMaximum(9,1,-1,-10,4), Is.is(0));



    }

    // numRed , Blue = 공이랑 상자의 각각의 개수.
    // onlyRed, Blue = 공과 상자의 색이 같은 경우의 밸류 값
    // bothColors =  공과 상자의 색이 다른 경우의 밸류 값.
    private int getMaximum(int numRed, int numBlue, int onlyRed, int onlyBlue, int bothColors ){



        int maxRed = numRed * onlyRed;
        int maxBlue = numBlue * onlyBlue;


        int length = numRed > numBlue ? numBlue : numRed;

        int[] total = new int[length+1];
        total[0] = maxBlue + maxRed;

        for (int i = 1 ; i <= length; i++ ){
            total[i] = total[0] + bothColors * i * 2 - (onlyBlue +onlyRed) *i ;
        }

        Arrays.sort(total);


        return total[length];
    }
}
