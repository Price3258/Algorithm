package topcorder.dp;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class CorporationSalary {



    @Test
    public void test(){

        String[] salaries = new String[]{"NNYN", "NNYN", "NNNN", "NYYN"};
        // 1, 1, 1, 2
        Assert.assertThat( totalSalary ( salaries ), Is.is(5L) );

        salaries= new String[]{"NNNN", "NNNN", "NNNN", "NNNN"};
        // 1, 1, 1, 1
        Assert.assertThat( totalSalary ( salaries ), Is.is(4L) );

        salaries = new String[]{"NNNNNN", "YNYNNY", "YNNNNY", "NNNNNN", "YNYNNN", "YNNYNN"};
        // 1, 3, 2, 1, 2, 2
        Assert.assertThat( totalSalary ( salaries ), Is.is(17L) );

    }


    private long[] salaries;

    private long totalSalary(String[] relations){

        int length = relations.length;

        salaries = new long[length];

        long total = 0;

        for( int i=0 ; i< length ; i++){

            total += dp(i, relations);


        }

        return total;
    }



    private long dp(int i, String[] relations){

        if( salaries[i] == 0 ) {

            long salary = 0;
            int length = relations.length;

            for (int j = 0; j < length; j++) {
                if (relations[i].toString().charAt(j) == 'Y') {

                    salary += dp(j, relations);
                }

            }

            if(salary == 0){
                salary = 1;
            }

            salaries[i] = salary;

        }



        return salaries[i];
    }


}
