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
        Assert.assertThat(uniquePaths(4,4), Is.is(20));
        Assert.assertThat(uniquePaths(6,6), Is.is(252));


    }


    //right, down

    public int uniquePaths(int m, int n) {
        if (m == 0 || n == 0) return 0;
        if (m == 1 || n == 1) return 1;

        int[][] dp = new int[m][n];

        //left column
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }

        //top row
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }

        //fill up the dp table
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[m - 1][n - 1];
    }

    // 조합을 사용해 한번 풀어보자.
    // m+n-2 C n-1 or n+m-2 C m-1
    public int uniquePaths2(int m, int n) {

        int min ;

        if( m > n){
            min = n;
        }else{
            min = m;
        }





        return 0;

    }


}
