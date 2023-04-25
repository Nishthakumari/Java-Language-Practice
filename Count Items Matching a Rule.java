package com.company;

import java.util.Arrays;
import java.util.List;



class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int res=0;
        for(int i=0;i<items.size();i++)
        {
            if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)) res++;
            if(ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)) res++;
            if(ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)) res++;

        }

        return res;
    }
}
public class Main {

    public static void main(String[] args) {

        List<List<String>> lists = Arrays.asList(Arrays.asList("phone","blue","pixel"),
                Arrays.asList("computer","silver","lenovo"),
                Arrays.asList("phone","gold","iphone"));

        String ruleKey = "color";
        String ruleValue = "silver";

        Solution obj = new Solution();

        System.out.println(obj.countMatches(lists, ruleKey, ruleValue));

    }
}
