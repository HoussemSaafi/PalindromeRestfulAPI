package com.swagger.spring.palindrome.palindrome.impl;

import org.springframework.stereotype.Service;

@Service
public class ClosestPalindromeAlgorithmServiceImpl implements IClosestPalindromeAlgorithmService {

    /*
       Algorithm Explanation:
       We start from the given value then we increment and decrement it by "i" and test for both values
       if they are palindromic
       if any of them is : the function should return that value
       else the function should continue to increment by the value of i
       Note that there is no condition for the "for loop" as our algorithm should only stop once it finds
       a palindromic value and returns it.
     */
    public String closestPalindromeValue(String inputValue) {
        long number = Long.parseLong(inputValue);
        for (long i = 1;; i++) {
            if (isPalindrome(number - i))
                return "" + (number - i);
            if (isPalindrome(number + i))
                return "" + (number + i);
        }
    }

    /*
    Algorithm Explanation:
    The goal behind this algorithm is to test if a value is palindromic.
    To do so: it reverses the value and tests if it's equal to the initially entered value.
    if true: then the value is Palindromic
    Else: then it is not.
     */
    public boolean isPalindrome(long value) {
        long temporary = value, reversed = 0;
        while (temporary > 0) {
            reversed = 10 * reversed + temporary % 10;
            temporary /= 10;
        }
        return reversed == value;
    }

}