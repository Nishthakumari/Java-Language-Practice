package com.company;

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;

        int[]  ans = new int[nums.length*2];

        for (int i=0;i<nums.length;i++)
        {
            ans[i] =ans[i+n] = nums[i];
        }

        return ans;

    }
}
public class Main {

    public static void main(String[] args) {

        int[] nums = {1,3,2,1};

        Solution obj = new Solution();

        System.out.println(obj.getConcatenation(s));

    }
}
