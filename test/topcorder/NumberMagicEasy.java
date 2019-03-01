package topcorder;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class NumberMagicEasy {

    @Test
    public void test(){


        Assert.assertThat( theNumber("YNYY"), Is.is(5) );

        Assert.assertThat( theNumber("YNNN"), Is.is(8) );

        Assert.assertThat( theNumber("NNNN"), Is.is(16) );

        Assert.assertThat( theNumber("NYNY"), Is.is(11) );


    }



    public int theNumber(String answer){


//        int[] Card1 = new int[]{1,2,3,4,5,6,7,8};
//        int[] Card2 = new int[]{1,2,3,4,9,10,11,12};
//        int[] Card3 = new int[]{1,2,5,6,9,10,13,14};
//        int[] Card4 = new int[]{1,3,5,7,9,11,15};
//


        String[] Cards = new String[]{
                "YYYYYYYYNNNNNNNN",
                "YYYYNNNNYYYYNNNN",
                "YYNNYYNNYYNNYYNN",
                "YNYNYNYNYNYNNNYN"
        };


        int length = Cards.length;

        for( int i = 0 ; i < 16; i++){
            StringBuilder temp = new StringBuilder();
            for( int j = 0 ; j < 4 ; j++){
                temp.append(Cards[j].charAt(i));
            }
            if( answer.equals(temp.toString()) ){
                return i+1;
            }
        }

        return -1;
    }
}
