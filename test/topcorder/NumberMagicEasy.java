package topcorder;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class NumberMagicEasy {

    @Test
    public void test(){


        Assert.assertThat( theNumber("YNYY"), Is.is(5) );

        Assert.assertThat( theNumber("YNNN"), Is.is(8) );

        Assert.assertThat( theNumber("NNNN"), Is.is(16) );

        Assert.assertThat( theNumber("NYNY"), Is.is(11) );


    }



    public int theNumber(String answer){




        return 1;
    }
}
