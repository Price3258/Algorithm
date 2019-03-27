package kakao;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;


/*

12 = 5 + 5 + (5 / 5) + (5 / 5)
12 = 55 / 5 + 5 / 5
12 = (55 + 5) / 5


 */

public class Nnumbers {




    @Test
    public void test(){


        Assert.assertThat(solution(5,12), Is.is(4));

        Assert.assertThat(solution(2,11), Is.is(3));

    }




    public int solution(int N, int number) {


        int answer = 0;



        for( int i = 1; i <9; i++){

        }


        return answer;

    }
}
