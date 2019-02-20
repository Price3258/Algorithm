package math;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class GcdTest {



    @Test
    public void test(){

        Assert.assertThat( getGCD(0 ,3), Is.is(-1));
        Assert.assertThat( getGCD(2 ,3), Is.is(1));
        Assert.assertThat( getGCD(3 ,3), Is.is(3));
        Assert.assertThat( getGCM(3 ,3), Is.is(3));
        Assert.assertThat( getGCM(2 ,3), Is.is(6));

    }

    //  Euclidean Algorithm
    private int getGCD(int a , int b){

        if( a <= 0 || b <= 0 ){
            return -1;
        }


        int mod = 0;

       // gcd = a/b;

        while (b != 0) {

            mod = a % b;
            a = b;
            b = mod;

        }

        return a;

    }

    private int getGCM(int a, int b) {
        return a * b / getGCD(a, b);
    }
}
