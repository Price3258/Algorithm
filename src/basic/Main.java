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




    }
}
