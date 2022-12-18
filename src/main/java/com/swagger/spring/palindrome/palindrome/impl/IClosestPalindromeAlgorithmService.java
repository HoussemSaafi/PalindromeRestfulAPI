package com.swagger.spring.palindrome.palindrome.impl;


public interface IClosestPalindromeAlgorithmService {
    boolean isPalindrome(long value);
    String closestPalindromeValue(String inputValue);

}
