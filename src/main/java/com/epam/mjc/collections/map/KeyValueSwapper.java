package com.epam.mjc.collections.map;

import java.util.*;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> resultMap = new LinkedHashMap<>();

        for (Map.Entry<Integer, String> m : sourceMap.entrySet()) {
            if (resultMap.containsKey(m.getValue())) {
                continue;
            }
            resultMap.put(m.getValue(), m.getKey());
        }

        for (Map.Entry<String, Integer> m : resultMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        return resultMap;
    }
}
