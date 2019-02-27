package topcorder;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class FriendScore {

    @Test
    public void test(){
        String[] example3 = new String[]{"NNNNNNNNNNNNNNY", "NNNNNNNNNNNNNNN",
                "NNNNNNNYNNNNNNN", "NNNNNNNYNNNNNNY", "NNNNNNNNNNNNNNY", "NNNNNNNNYNNNNNN",
                "NNNNNNNNNNNNNNN", "NNYYNNNNNNNNNNN", "NNNNNYNNNNNYNNN",
                "NNNNNNNNNNNNNNY", "NNNNNNNNNNNNNNN", "NNNNNNNNYNNNNNN",
                "NNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNN", "YNNYYNNNNYNNNNN"};


        Assert.assertThat( highestScore( new String[]{"NNN","NNN","NNN"} ), Is.is(0));


        Assert.assertThat( highestScore( new String[]{"NYY","YNY","YYN"} ), Is.is(2));

        Assert.assertThat( highestScore( example3 ), Is.is(6));





    }


    private int highestScore(String[] friends){

        int ans = 0;

        int max = 0;

        int length = friends[0].length();

        for( int i = 0 ; i < length ; i++){

            for( int j = 0 ; j < length ; j++) {

                if( i == j ){
                    continue;
                }

                if ( friends[i].charAt(j) == 'Y'){
                    max++;

                }else{
                    for ( int k =0 ; k < length ; k++){
                        if( friends[j].charAt(k) == 'Y' && friends[k].charAt(i) =='Y' ){
                            max++;
                            break;
                        }
                    }
                }

            }

            ans = Math.max(ans,max);
            max = 0;
        }


        return ans;
    }
}
