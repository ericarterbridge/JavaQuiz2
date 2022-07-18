package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Router {
    Map<String, String> newMap;
    public Router(){
        newMap = new LinkedHashMap<>();
    }
    public void add(String path, String controller) {
        newMap.put(path, controller);
    }

    public Integer size() {
        return newMap.size();
    }

    public String getController(String path) {
        return newMap.get(path);
    }

    public void update(String path, String studentController) {
        newMap.put(path, studentController);
    }

    public void remove(String path) {
        newMap.remove(path);
    }
    @Override
    public String toString(){
        StringBuilder newString = new StringBuilder();
        for(Map.Entry<String, String> entry : newMap.entrySet()){
            newString.append(entry.getKey()).append(entry.getValue()).append("\n");
        }
        return String.valueOf(newString);
    }
}
