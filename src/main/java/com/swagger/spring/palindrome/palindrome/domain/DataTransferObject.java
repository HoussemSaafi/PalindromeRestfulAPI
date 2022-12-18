package com.swagger.spring.palindrome.palindrome.domain;

import io.swagger.annotations.ApiModelProperty;

public class DataTransferObject {

    @ApiModelProperty(notes = "The Entree Value")
    private String inputValue;


    public DataTransferObject(String inputValue) {
        this.inputValue = inputValue;
    }

    public DataTransferObject() {
    }


    public String getInputValue() {
        return inputValue;
    }

    public void setInputValue(String inputValue) {
        this.inputValue = inputValue;
    }

}