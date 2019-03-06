package topcorder;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;
/*
{"...", "...", "..."}
0
1
{1,0,-1,0}
{0,1,0,-1}
Returns: 3
 */
public class MazeMaker {


    @Test
    public void test(){

        String[] maze = new String[]{"...","...","..."};
        int startRow = 0;
        int startCol = 1;
        int[] moveRow = new int[]{1,0,-1,0,1,1,-1,-1};
        int[] moveCol = new int[]{0,1,0,-1,1,-1,1,-1};

        Assert.assertThat( logestPath( maze, startRow , startCol , moveRow, moveCol) , Is.is(2) );


        moveRow= new int[]{1, 0, -1, 0};
        moveCol = new int[]{0,1,0,-1};

        Assert.assertThat( logestPath( maze, startRow , startCol , moveRow, moveCol) , Is.is(3) );


        maze = new String[]{"X.X", "...", "XXX", "X.X"};

        Assert.assertThat( logestPath( maze, startRow , startCol , moveRow, moveCol) , Is.is(-1) );



    }

    private int logestPath(String[] maze, int startRow, int startCol, int[] moveRow, int[] moveCol){


        int max = 0;

        int width = maze[0].length();
        int height = maze.length;

        int[][] board = new int[height][width];


        for ( int i= 0; i< height ; i++){

            for( int j =0 ; j < width ;j++){
                board[i][j]=-1;
            }
        }


        board[startRow][startCol] = 0;

        Queue<Integer> queueX = new LinkedList<>();
        Queue<Integer> queueY = new LinkedList<>();

        queueX.add(startCol);
        queueY.add(startRow);


        while (!queueX.isEmpty()){
            int x = queueX.poll();
            int y = queueY.poll();

            for( int i =0 ;  i < moveRow.length;i++){

                int nextX = x + moveCol[i];
                int nextY = y + moveRow[i];

                if( 0 <= nextX && nextX < width && 0 <= nextY && nextY < height && board[nextY][nextX] == -1 && maze[nextY].charAt(nextX) =='.') {

                    board[nextY][nextX] = board[y][x] + 1;
                    queueX.add(nextX);
                    queueY.add(nextY);

                }
            }
        }



        for(int i =0 ; i < height ; i++){
            for ( int j = 0 ; j<width ; j++){
                if( maze[i].charAt(j)=='.' && board[i][j] ==-1){
                    return -1;
                }
                max = Math.max(max , board[i][j]);
            }
        }



        return max;
    }
}
