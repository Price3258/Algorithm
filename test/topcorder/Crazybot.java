package topcorder;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

/*


1
2
25
25
25
25
Returns: 0.75
The robot will visit its starting point twice only if the two moves are in opposite directions.

2)
7
50
0
0
50
Returns: 1.0
Here, the only possible directions are north and east, so the robot will never visit the same point twice.

3)
14
50
50
0
0
Returns: 1.220703125E-4

Here, the only possible directions are east and west. The only two available paths are "EEEEEEEEEEEEEE" and "WWWWWWWWWWWWWW". The probability is equal to 2 / (2^14).


4)
14
25
25
25
25
Returns: 0.008845493197441101


 */
public class Crazybot {

    @Test
    public void test(){


        Assert.assertThat( getProbability(1,25,25,25,25), Is.is(1.0) );

        Assert.assertThat( getProbability(2,25,25,25,25), Is.is(0.75) );

        Assert.assertThat( getProbability(7,50,0,0,50), Is.is(1.0) );

        Assert.assertThat( getProbability(14,50,50,0,0), Is.is(1.220703125E-4) );

        Assert.assertThat( getProbability(14,25,25,25,25), Is.is(0.008845493197441101) );


    }

    //private static double p = 1; //  전체 확률 1

    private double[] probabilities = new double[4]; //동서남북의 퍼센트

    private boolean[][] checked = new boolean[100][100];
    private int[] vx = {1, -1, 0, 0};
    private int[] vy = {0, 0, 1, -1};



    private double getProbability(int n, int east, int west, int south, int north){

        probabilities[0]= east/100.0;
        probabilities[1]= west/100.0;
        probabilities[2]= south/100.0;
        probabilities[3]= north/100.0;

//        Stack<String> stack = new Stack<>();
//
//      //  int next = 0;
//        if( n==1){
//            return 1;
//
//        }
//
////
////        for (int i = 0; i < 4; i++) {
////                answer += dfs(n , probabilities);
////        }
//
//        int length = ways.length;
//
//        for( int i =0 ; i < length; i++ ){
//            if( probabilities[i] != 0) {
//                stack.push(ways[i]);
//            }
//
//            answer += dfs(n , stack, probabilities);
//
//            stack.pop();
//
//        }


        return dfs(50,50,n);
    }

//    private double dfs (int n, Stack<String> stack, double[] probabilities ){
//
//        double percent = 0;
//
//        int length = ways.length;
//
//
//        if( n==0 ){
//            return percent;
//        }
//
//
//        return dfs (n-1, stack, probabilities );
//    }


    private double dfs( int x , int y , int n){

        if( checked[x][y] ){
            return 0;
        }
        if( n==0){
            return 1;
        }

        checked[x][y]=true;
        double ret = 0;
        for( int i=0 ; i<4 ; i++){


            ret += dfs(x+vx[i],y+vy[i],n-1)*probabilities[i];
        }

        checked[x][y] = false;

        return ret;


    }

}
