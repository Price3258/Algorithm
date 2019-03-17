package topcorder.dp;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class ChessMetric2 {



    @Test
    public void test(){

        int size = 3;
        int[] start = new int[]{0, 0};
        int[] end = new int[]{1, 0};
        int numMoves = 1;

        Assert.assertThat(howMany(size, start, end, numMoves), Is.is(1L));



        size = 3;
        start = new int[]{0,0};
        end = new int[]{0,0};
        numMoves = 2;
        Assert.assertThat(howMany(size, start, end, numMoves), Is.is(5L));



    }



    public long howMany(int n, int[] start, int[] end, int m) {
        long[][] count = new long[n][n];

        // Initialize the first seed
        count[start[0]][start[1]] = 1;
        for(int iter = 0; iter < m; iter++) {
            long[][] prevResult = count;
            count = new long[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    for(Move move : Move.values()) {
                        int targetX = i + move.x;
                        int targetY = j + move.y;

                        if(targetX >= 0 && targetX < n
                                && targetY >= 0 && targetY < n) {
                            count[targetX][targetY] += prevResult[i][j];
                        }
                    }
                }
            }
        }

        return count[end[0]][end[1]];
    }

    private enum Move {
        LEFT(-1, 0), RIGHT(1, 0), UP(0, 1), DOWN(0, -1),
        UP_LEFT(-1, 1), UP_RIGHT(1, 1), DOWN_LEFT(-1, -1), DOWN_RIGHT(1, -1),
        UUL(-1, 2), UUR(1, 2), ULL(-2, 1), URR(2, 1),
        DDL(-1, -2), DDR(1, -2), DLL(-2, -1), DRR(2, -1);

        public int x;
        public int y;

        Move(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
