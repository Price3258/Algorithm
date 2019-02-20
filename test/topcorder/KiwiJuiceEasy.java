package topcorder;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class KiwiJuiceEasy {

    @Test
    public void test(){

        int[] capacities = new int[]{ 20, 20 };
        int[] bottles = new int[]{ 5, 8 };
        int[] fromId = new int[]{ 0 };
        int[] toId = new int[]{ 1 };

        Assert.assertThat( solution(capacities,bottles,fromId,toId), Is.is( new int[]{0,13}) );

        capacities = new int[]{30, 20, 10};
        bottles = new int[]{10, 5, 5};
        fromId = new int[]{0, 1, 2};
        toId = new int[]{ 1, 2, 0 };

        Assert.assertThat( solution(capacities,bottles,fromId,toId), Is.is( new int[]{10,10,0}) );

    }


    private int[] solution(int[] capacities, int[] bottles, int[] fromId, int[] toId){

        if( capacities.length != bottles.length)
            return new int[]{-1};


        for ( int i = 0 ; i < toId.length ; i++){

            if( bottles[toId[i]] + bottles[fromId[i]] < capacities[toId[i]] ) {

                bottles[toId[i]] = bottles[toId[i]] + bottles[fromId[i]] ;
                bottles[fromId[i]] = 0;

            }else {


                bottles[fromId[i]] = bottles[toId[i]] + bottles[fromId[i]] - capacities[toId[i]] ;

                bottles[toId[i]] = capacities[toId[i]];

            }
        }






        return bottles;
    }


}
