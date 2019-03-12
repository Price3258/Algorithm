package basic;

public class SplitTest {



    public static void main( String[] args){


        String test = "aa/bb";

        String[] str = test.split("/");

        System.out.println( str[0] + " and " + str[1] );


    }
}
