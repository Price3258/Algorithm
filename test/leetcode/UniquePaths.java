package leetcode;



/*


A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

How many possible unique paths are there?
 */


import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class UniquePaths {

    @Test
    public void test(){


        Assert.assertThat(uniquePaths(3,2), Is.is(3));

        Assert.assertThat(uniquePaths(7,3), Is.is(28));

    }

    int[] vy = new int[]{0,1};
    int[] vx = new int[]{1,0};

    //right, down

    public int uniquePaths(int m, int n) {

        int count = 0;

        boolean[][] ways = new boolean[n][m];




        for(int i = 0 ; i < n ; i++){
            for(int j =0 ; j < m ; j++){
                if( ways[i][j]){
                    ways[i][j] = true;

                }
            }
        }
        return count;
    }
    public int dfs(int x, int y, int n){



        return count;
    }

}
