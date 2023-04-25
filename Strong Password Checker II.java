package com.company;



class Solution {
    public boolean strongPasswordCheckerII(String password) {

        if(password.length()<8) return false;

        boolean lower = false, upper = false, special=false, digit = false;
        for (int i=0;i<password.length();i++)
        {
            if(i>0 && password.charAt(i-1)==password.charAt(i)) return false;

            if(Character.isLowerCase(password.charAt(i))) lower =true;
            else if(Character.isUpperCase(password.charAt(i))) upper =true;
            else if(Character.isDigit(password.charAt(i))) digit=true;
            else special =true;


        }

        return lower && upper && digit && special;

    }
}
public class Main {

    public static void main(String[] args) {

        String s="IloveLe3tcode!";

        Solution obj = new Solution();

        System.out.println(obj.strongPasswordCheckerII(s));

    }
}
