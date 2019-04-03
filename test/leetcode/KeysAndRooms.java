package leetcode;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/*


841. Keys and Rooms


N개의 룸이 있고 각 룸 번호가 잇음

각 방에는 rooms[i]라는 열쇠 리스트가 있음.
그리고 각 키 ( room[i][j])는 N 개의 인티져값이다.
rooms[i][j]=v 일 때 room[v] 가 열린다 .

모든 문은 잠겨있다. 시작할때


Example 1:

Input: [[1],[2],[3],[]]
Output: true
Explanation:
We start in room 0, and pick up key 1.
We then go to room 1, and pick up key 2.
We then go to room 2, and pick up key 3.
We then go to room 3.  Since we were able to go to every room, we return true.


Example 2:

Input: [[1,3],[3,0,1],[2],[0]]
Output: false
Explanation: We can't enter the room with number 2.
Note:

1 <= rooms.length <= 1000
0 <= rooms[i].length <= 1000
The number of keys in all rooms combined is at most 3000.



 */
public class KeysAndRooms {

    @Test
    public void test(){

        List<Integer> key1= new ArrayList<>();

        key1.add(1);
        key1.add(3);
        List<List<Integer>> rooms = new ArrayList<>();

        rooms.add(key1);


        List<Integer> key2= new ArrayList<>();

        key2.add(3);
        key2.add(0);
        key2.add(1);
        rooms.add(key2);


        List<Integer> key3= new ArrayList<>();

        key3.add(2);
        rooms.add(key3);

        List<Integer> key4= new ArrayList<>();
        key4.add(0);
        rooms.add(key4);


        Assert.assertThat( canVisitAllRooms(rooms), Is.is(false));


    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {


        Stack<Integer> dfs = new Stack<>();
        dfs.add(0);
        HashSet<Integer> seen = new HashSet<Integer>();
        seen.add(0);
        while (!dfs.isEmpty()) {
            int i = dfs.pop();
            for (int j : rooms.get(i))
                if (!seen.contains(j)) {
                    dfs.add(j);
                    seen.add(j);
                    if (rooms.size() == seen.size()) return true;
                }
        }
        return rooms.size() == seen.size();

    }

}
