package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListUtility {
    List<Integer> newList;
    public ListUtility(){
        newList = new ArrayList<>();
    }
    public Boolean add(Integer i) {
        return newList.add(i);
    }

    public Integer size() {
        return newList.size();
    }

    public List<Integer> getUnique() {
        Set<Integer> uniqueSet = new HashSet<>(newList);

        return new ArrayList<>(uniqueSet);
    }

    public String join() {
        StringBuilder listToString = new StringBuilder();
        if (newList.size()==1){
            listToString.append(newList.get(0));
        } else {
            for (int i = 0; i < newList.size()-1; i++) {
                listToString.append(newList.get(i)).append(", ");
            }
            listToString.append(newList.get(newList.size()-1));
            return listToString.toString();
        } return listToString.toString();
    }

    public Integer mostCommon() {
        Integer[] newArray = newList.toArray(new Integer[0]);
        return ArrayUtility.mostCommon(newArray);
    }

    public Boolean contains(Integer valueToAdd) {
        return newList.contains(valueToAdd);
    }
}
