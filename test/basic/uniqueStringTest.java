package basic;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

// String 이 고유한지 판별
public class uniqueStringTest {


    @Test
    public void test(){

        Assert.assertThat(solution("absdd"), Is.is(false));
        Assert.assertThat(solution("absdc"), Is.is(true));
        Assert.assertThat(solution2("absdd"), Is.is(false));
        Assert.assertThat(solution2("absdc"), Is.is(true));
        Assert.assertThat(solution2("abzxde"), Is.is(true));

    }
    private boolean solution( String str ){

        char[] strArr = str.toCharArray();

        for( int i = 0; i < str.length(); i++ ){
            for( int j =i+1 ; j < str.length() ; j++){
                if(strArr[i]==strArr[j])
                    return false;
            }
        }

        return true;
    }

    private boolean solution2( String str){

        Set<String> set = new HashSet<>();

        char[] strArr = str.toCharArray();

        for( int i = 0; i < str.length(); i ++){
            set.add( String.valueOf(strArr[i]) );
        }

        return set.size() == str.length();
    }
}
