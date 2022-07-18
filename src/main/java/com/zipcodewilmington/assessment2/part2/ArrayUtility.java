package com.zipcodewilmington.assessment2.part2;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {

        Integer[] newArray = new Integer[array1.length + array2.length];
        for (int i = 0; i<array1.length; i++){
            newArray[i] = array1[i];
        }
        for (int i = 0; i< array2.length; i++){
            newArray[array1.length + i] = array2[i];
        }
        return newArray;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        int length = array.length;
        int[] temp = new int[index];
        for (int i =0; i<index; i++){
            temp[i] = array[i];
        }
        for (int i = index; i<length; i++){
            array[i-index] = array[i];
        }
        for (int i = 0; i < index; i++){
            array[i+length-index] = temp[i];
        }
        return array;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        int count = 0;

        for (int i = 0; i<array1.length; i++){
            if (array1[i] == valueToEvaluate){
                count++;
            }
        }
        for (int i = 0; i<array2.length; i++){
            if (array2[i] == valueToEvaluate){
                count++;
            }
        }

        return count;
    }

    public static Integer mostCommon(Integer[] array) {
        int count = 1, tempCount;
        int popular = array[0];
        int temp = 0;
        for (int i = 0; i < (array.length-1); i++){
            temp = array[i];
            tempCount = 0;
            for (int j = 1; j<array.length; j++){
                if (temp == array[j]){
                    tempCount++;
                }
                if (tempCount > count){
                    popular = temp;
                    count = tempCount;
                }
            }
        }
        return popular;
    }
}
