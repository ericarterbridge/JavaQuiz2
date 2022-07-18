package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {

    private Integer concatenator;
    public WuTangConcatenator(Integer input) {
        this.concatenator = input;
    }

    public Boolean isWu() {

        return concatenator%3==0;
    }

    public Boolean isTang() {

        return concatenator%5==0;
    }

    public Boolean isWuTang() {

        return (concatenator%3==0 && concatenator%5==0);
    }
}
