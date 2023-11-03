package edu.hw3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task3 {

    public <M> Map<M, Integer> freeDict(ArrayList<M> arrayList) {
        Map<M, Integer> dict = new HashMap<>();
        for (var element: arrayList) {
            if (dict.containsKey(element)) {
                dict.put(element, dict.get(element) + 1);
            } else {
                dict.put(element, 1);
            }
        }
        return dict;
    }
}
