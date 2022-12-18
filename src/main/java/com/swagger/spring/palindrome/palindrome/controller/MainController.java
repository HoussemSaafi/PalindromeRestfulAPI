package com.swagger.spring.palindrome.palindrome.controller;

import com.swagger.spring.palindrome.palindrome.domain.DataTransferObject;
import com.swagger.spring.palindrome.palindrome.impl.ClosestPalindromeAlgorithmServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import static org.springframework.http.HttpStatus.OK;

/**
 * created by niraj on Sep, 2018
 */
@RestController
@RequestMapping("/api")
@Api(value = "Palindrome API")
public class MainController {

    @Autowired
    private ClosestPalindromeAlgorithmServiceImpl palindromeAlgorithmService;


    @ApiOperation(value = "Get the closest Palindrome")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully Found Closest Palindrome"),
            @ApiResponse(code = 401, message = "You are not authorized to get a response"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })

    @PostMapping(value = "/closestpalindrome")
    public ResponseEntity<String> getClosestPalindrome(@RequestBody DataTransferObject dto) {
        String result = palindromeAlgorithmService.closestPalindromeValue(dto.getInputValue());
        System.out.println(result);
        return new ResponseEntity<>("the closest palindrome value is " + result, OK );
    }
}
