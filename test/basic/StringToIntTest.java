package basic;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;


// String to int 변환
public class StringToIntTest {
     /*
        TASK
        주어진 문자열을 int 형으로 변환한다.
    */

    @Test
    public void toIntFromString() {
        Assert.assertThat(toIntFromString("123"), Is.is(123));
        Assert.assertThat(toIntFromString("1234"), Is.is(1234));
    }

    private int toIntFromString(String str) {
//        return Integer.parseInt(str);
        char[] strArr = str.toCharArray();
        int base = 0;
        for (char c : strArr) {
            base *= 10;
            System.out.println(base);
            base += c - '0';
            System.out.println(base);
        }
        return base;
    }
}
