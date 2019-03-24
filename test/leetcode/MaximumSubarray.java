package leetcode;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

/*

Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

 */

public class MaximumSubarray {

    @Test
    public void test(){
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};

        Assert.assertThat( maxSubArray(nums), Is.is(6) );

        int[] nums2 = new int[]{-2,-1};

        Assert.assertThat( maxSubArray(nums2), Is.is(-1) );


        int[] nums3 = new int[]{-1,-2};

        Assert.assertThat( maxSubArray(nums3), Is.is(-1) );

        //////////

        Assert.assertThat( maxSubArray2(nums), Is.is(6) );

        Assert.assertThat( maxSubArray2(nums2), Is.is(-1) );

        Assert.assertThat( maxSubArray2(nums3), Is.is(-1) );




    }

    public int maxSubArray(int[] nums) {

        if( nums.length == 1)
            return nums[0];

        int max = Integer.MIN_VALUE;
        int subMax = 0;

        int length = nums.length;



        for( int i = 0 ; i < length ; i++) {
            for( int j = length -i -1 ; j >= 0 ; j-- ){

                subMax+= nums[j];
                max = Math.max( max, subMax);
            }
            subMax = 0;
        }

        return max;
    }


    public int maxSubArray2(int[] nums) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int len = nums.length;

        while (left < len) {
            if (right < len && sum >= 0) {
                sum += nums[right++];
            } else {
                sum -= nums[left++];
            }

            if (sum > max && left != right) {  // Deal with max<0
                max = sum;
            }
        }
        return max;
    }

    public int maxSubArray3(int[] A) {
        int n = A.length;
        int[] dp = new int[n];//dp[i] means the maximum subarray ending with A[i];
        dp[0] = A[0];
        int max = dp[0];

        for(int i = 1; i < n; i++){
            dp[i] = A[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
            max = Math.max(max, dp[i]);
        }

        return max;
    }

}
