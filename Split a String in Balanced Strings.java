package com.company;

class Solution {
    public int balancedStringSplit(String s) {

        int ans=0;
        int cnt=0;
        for(char c: s.toCharArray())
        {
            if(c=='R') cnt++;
            else
                cnt--;

            if(cnt==0) ans++;
        }

        return ans;

    }
}
public class Main {

    public static void main(String[] args) {

        String s = "RLRRRLLRLL";
        Solution obj = new Solution();

        System.out.println(obj.balancedStringSplit(s));

    }
}
