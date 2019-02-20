package basic;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args){

//        int a= '0';
//        int b = '1';
//        System.out.println(a);
//        System.out.println(b);
//
//        String str ="dsadsa";
//        char[] strArr = str.toCharArray();
//        for( char s :strArr ){
//            System.out.println( );
//        }


        Map<String , Integer> map = new HashMap<>();


        map.put("test",1);

        System.out.println(map.get("test"));


        String s = "abcb";

        System.out.println( s.substring( s.length()/2 ));

        StringBuffer reverseStr = new StringBuffer();

        for( int i = 0 ; i< s.length()/2 ; i++ ){
            reverseStr.append( s.substring(s.length()-i ) );
        }


        System.out.println(s.length()/2);



    }
}
