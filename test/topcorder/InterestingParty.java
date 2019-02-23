package topcorder;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

// 포문 한 번에 다 넣기 .
// 키셋이나 이터레이터 사용하기 .

public class InterestingParty {

    @Test
    public void test(){

        String[] first = new String[]{"fishing", "gardening", "swimming", "fishing"};
        String[] second = new String[]{"hunting", "fishing", "fishing", "biting"};

        Assert.assertThat( bestInvitation(first,second) , Is.is(4) );

        first = new String[]{"variety", "diversity", "loquacity", "courtesy"};
        second = new String[]{"talking", "speaking", "discussion", "meeting"};
        Assert.assertThat( bestInvitation(first,second) , Is.is(1) );

        first = new String[]{"snakes", "programming", "cobra", "monty"};
        second = new String[]{"python", "python", "anaconda", "python"};
        Assert.assertThat( bestInvitation(first,second) , Is.is(3) );

        first = new String[]{"t", "o", "p", "c", "o", "d", "e", "r", "s", "i", "n", "g", "l", "e", "r", "o", "u", "n", "d", "m", "a", "t", "c", "h", "f", "o", "u", "r", "n", "i"};
        second = new String[]{"n", "e", "f", "o", "u", "r", "j", "a", "n", "u", "a", "r", "y", "t", "w", "e", "n", "t", "y", "t", "w", "o", "s", "a", "t", "u", "r", "d", "a", "y"};
        Assert.assertThat( bestInvitation(first,second) , Is.is(6) );


    }


    private int bestInvitation( String[] first, String[] second){



        if(first.length!=second.length)
            return -1;

        //HashMap<String, Integer> map = new HashMap<>();
        TreeMap<String, Integer> map = new TreeMap<>();


        for (String s : first) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }

        }

        for (String s : second) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }

        }


        return Collections.max( map.values() ) ;
    }
}


