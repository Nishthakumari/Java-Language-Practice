package com.company;

class Solution {
    public String restoreString(String s, int[] indices) {

        char[] temp = new char[indices.length];
        for(int i=0;i<indices.length;i++)
        {
            temp[indices[i]] = s.charAt(i);
        }
        return new String(temp);
    }
}
public class Main {

    public static void main(String[] args) {

        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        Solution obj = new Solution();

        System.out.println(obj.restoreString(s, indices));

    }
}
