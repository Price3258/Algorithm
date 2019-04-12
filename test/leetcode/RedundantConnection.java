package leetcode;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class RedundantConnection {



    @Test
    public void test(){

        int[][] edges= new int[][]{ {1,2},{1,3},{2,3} };
        Assert.assertThat( findRedundantConnection(edges), Is.is( new int[]{2,3} ) );

        int[][] edges2= new int[][]{ {1,2}, {2,3}, {3,4}, {1,4}, {1,5} };
        Assert.assertThat( findRedundantConnection(edges2), Is.is( new int[]{1,4} ) );

    }



    private int MAX_EDGE_VAL = 1000;

    private int[] findRedundantConnection(int[][] edges) {
        DSU dsu = new DSU(MAX_EDGE_VAL + 1);
        for (int[] edge: edges) {
            if (!dsu.union(edge[0], edge[1])) return edge;
        }
        throw new AssertionError();
    }


}
