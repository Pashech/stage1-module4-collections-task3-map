package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        boolean result = functionMap.containsValue(requiredValue);
        return result;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer i : sourceList) {
            map.put(i, formula(i));
        }

        return map;
    }

    private int formula(int number) {
        return 5 * number + 2;
    }
}
