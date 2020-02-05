package com.epipractice;

public class ReverseString {

    public String reverseString(String s){
       // String result = "";
    char[] array = s.toCharArray();
        for(int i=0,j=array.length-1;i<j;--j,++i){
            char temp = array[i];
            array[i]=array[j];
            array[j]=temp;
        }

        return new String(array);

    }
    public Boolean isPalindrome(String s){
        for(int i=0,j=s.length()-1;i<j;--j,++i){
            if(s.charAt(i) != s.charAt(j))
                return false;
        }
        return true;

    }

}
