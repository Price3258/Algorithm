package leetcode;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;


/*
number 287

Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least one duplicate number must exist.
Assume that there is only one duplicate number, find the duplicate one.


You must not modify the array (assume the array is read only).
You must use only constant, O(1) extra space.
Your runtime complexity should be less than O(n2).
There is only one duplicate number in the array, but it could be repeated more than once.


 */
public class FindTheDuplicateNumber {



    @Test
    public void test(){

        int[] nums = new int[]{1,3,4,2,2};

        Assert.assertThat( findDuplicate(nums) , Is.is(2) );

        nums = new int[]{3,1,3,4,2};

        Assert.assertThat( findDuplicate(nums) , Is.is(3) );

    }

    public int findDuplicate(int[] nums) {


        int length = nums.length;
        Arrays.sort(nums);

        for( int i =1 ; i < length ; i++){
            if (nums[i] == nums[i-1]) {
                return nums[i];
            }
        }

        return 0;
    }
}
