package com.company;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> s= new HashSet<Character>();
        int ans=0;

        for(char c: jewels.toCharArray())
            s.add(c);

        for (char c : stones.toCharArray())
        {
            if(s.contains(c))
            {
                ans++;
            }
        }

        return ans;

    }
}

public class Main {

    public static void main(String[] args) {

        String jewels = "z";
        String stones = "ZZ";
        Solution obj = new Solution();

        System.out.println(obj.numJewelsInStones(jewels, stones ));

    }
}
