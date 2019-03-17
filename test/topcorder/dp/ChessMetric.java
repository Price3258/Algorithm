package topcorder.dp;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
/*
0)
3
{0,0}
{1,0}
1
Returns: 1
Only 1 way to get to an adjacent square in 1 move
1)
3
{0,0}
{1,2}
1
Returns: 1
A single L-shaped move is the only way

2)
3
{0,0}
{2,2}
1
Returns: 0
Too far for a single move

3)
3
{0,0}
{0,0}
2
Returns: 5

Must count all the ways of leaving and then returning to the corner


4)
100
{0,0}
{0,99}
50
Returns: 243097320072600
This problem statement is the exclusive and proprietary property of TopCoder, Inc. Any unauthorized use or reproduction of this information without the prior written consent of TopCoder, Inc. is strictly prohibited. (c)2003, TopCoder, Inc. All rights reserved.

 */
public class ChessMetric {


    @Test
    public void test() {
        int size = 3;
        int[] start = new int[]{0, 0};
        int[] end = new int[]{1, 0};
        int numMoves = 1;

        Assert.assertThat(howMany(size, start, end, numMoves), Is.is(1L));

    }



    private long howMany(int size, int[] start, int[] end, int numMoves) {


        int[][][] ways = new int[size][size][50];

        int[] vx = {1, -1, 0, 0, -1, -1, 1, 1, 2, 2, -2, -2, 1, 1, -1, -1}; //
        int[] vy = {0, 0, 1, -1, -1, 1, 1, -1, 1, -1, 1, -1, 2, -2, -2, 2}; //


        long answer = 0;

        int length = vx.length;

        int startX = start[0];
        int startY = start[1];

        int endX = end[0];
        int endY = end[1];


        ways[startY][startX][0] =1;


        if (size < 3 || numMoves < 0 || numMoves > 50) {
            return -1;
        }

        for (int i = 1; i <= numMoves; i++) {

            for (int j = 0; j < size ; j++) { //// move X

                for (int k = 0; k < size; k++) { /// move Y

                    for(int l=0 ; l < length ; l++){ //

                        int nx = j+ vx[l];
                        int ny = k+ vy[l];
                        if( nx <0 || ny <0 || nx >= size || ny >= size){
                            continue;
                        }

                        ways[ny][nx][i] += ways[k][j][i-1];

                    }



                }
            }

        }


        return ways[endY][endX][numMoves];
    }
}