package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
       // if (array.length % 2 = 0)
        return array.length % 2 == 0;
    }

    public Integer[] range(int start, int stop) {
        int range = (stop-start+1);
        Integer[] array = new Integer[range];
        for(int i = 0; i < range; i++){
            array[i] = start;
            start++;
        }

        return array;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {

        return array[0] + array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {

        return array[array.length-1] * array[array.length-2];
    }
}
