package com.company;

import java.util.Arrays;
import java.util.List;


class Solution {
    public String truncateSentence(String s, int k) {

        String[] str = s.split(" ");
        StringBuilder sb =new StringBuilder();
        for(int i=0;i<k;i++)
        {
            sb.append(str[i]);
            if(i<k-1)
                sb.append(" ");
        }

        return sb.toString();
    }
}
public class Main {

    public static void main(String[] args) {

        String s="What is the solution to this problem";
        int k=4;

        Solution obj = new Solution();

        System.out.println(obj.truncateSentence(s,k));

    }
}
