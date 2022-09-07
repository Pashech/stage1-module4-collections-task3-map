package com.epam.mjc.collections.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> resultMap = new HashMap<>();
        String[] str = sentence.split("[\\' '\\.\\,]");
        int count = 0;

        for (String s : str) {
            s = s.toLowerCase(Locale.ROOT);
            if (s.equals("")) {
                continue;
            }
            if (resultMap.containsKey(s)) {
                count = resultMap.get(s);
                count++;
                resultMap.put(s, count);
            } else {
                count++;
                resultMap.put(s, count);
            }
            count = 0;
        }

        return resultMap;
    }
}
