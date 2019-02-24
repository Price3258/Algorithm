package topcorder;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class FriendScore {

    @Test
    public void test(){

        //String[] example1 = new String[]{"NYY","YNY","YYN"};

        Assert.assertThat( highestScore( new String[]{"NYY","YNY","YYN"} ), Is.is(2));


    }


    public int highestScore(String[] friends){

        int ans = 0;

        int max = 0;

        int length = friends[0].length();

        for( int i = 0 ; i < length ; i++){

        }


        return 2;
    }
}
