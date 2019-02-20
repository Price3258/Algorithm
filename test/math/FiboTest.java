package math;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class FiboTest {

    @Test
    public void test(){

        Assert.assertThat(solution(1), Is.is(1));
        Assert.assertThat(solution(0), Is.is(0));
        Assert.assertThat(solution(3), Is.is(2));
        Assert.assertThat(solution(4), Is.is(3));

        Assert.assertThat(calcFiboByRec(1), Is.is(1));
        Assert.assertThat(calcFiboByRec(0), Is.is(0));
        Assert.assertThat(calcFiboByRec(3), Is.is(2));
    }


    private int solution(int number){

        int fibo = 0;
        int cur = 0;
        int next = 1;

        if( number == 0) {
            return 0;
        }else if( number == 1 ){
            return 1;
        }

        for ( int i = 2; i <= number ; i ++){
            fibo= cur+ next;

            cur = next;
            next = fibo;

        }

        return fibo;

    }

    private int calcFiboByRec(int num) {
        if (num < 0) return -1;
        if (num < 2) return num;
        return calcFiboByRec(num - 1) + calcFiboByRec(num - 2);
    }
}
