package com.epipractice;

public class ReverseDigits {

    public int reverseNumber(int number){

        int result =0;

        int i=10;

        while(number >0){

            result = (result * i)+(number%10);

            number = number/10;
        }

        return  result;
    }

    public boolean isPalindromeNumber(int number){
        int result =0;
        int actual = number;
        int i=10;

        while(number >0){

            result = (result * i)+(number%10);

            number = number/10;
        }
        if(result == actual){
            return true;
        }else{
            return false;
        }
    }
    
}
