package topcorder;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class MazeMaker {


    @Test
    public void test(){

        String[] maze = new String[]{"...","...","..."};
        int startRow = 0;
        int startCol = 1;
        int[] moveRow = new int[]{1,0,-1,0};
        int[] moveCol = new int[]{0,1,0,-1};

        Assert.assertThat( logestPath( maze, startRow , startCol , moveRow, moveCol) , Is.is(3) );



    }

    private int logestPath(String[] maze, int startRow, int startCol, int[] moveRow, int[] moveCol){



        return 0;
    }
}
