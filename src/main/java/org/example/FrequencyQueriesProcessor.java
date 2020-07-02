package org.example;

import java.util.*;


public class FrequencyQueriesProcessor {
    static List<Integer> process(int[][] queries) {
        Map<Integer, Integer> output = new HashMap<>();
        Map<Integer, Set<Integer>> tracker = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int[] query : queries) {
            int command = query[0];
            int data = query[1];

            int value = output.getOrDefault(data, 0);
            if (command == 1){
                int newValue = value + 1;
                output.put(data, newValue); //set output
                if (tracker.containsKey(value))//set tracker
                    tracker.get(value).remove(data);

                tracker.putIfAbsent(newValue, new HashSet<>());
                tracker.get(newValue).add(data);
            } else if (command == 2) {
                int newValue = (value > 1) ? value - 1: 0;
                if (tracker.containsKey(value))
                    tracker.get(value).remove(data);
                tracker.putIfAbsent(newValue, new HashSet<>());
                tracker.get(newValue).add(data);
                output.put(data, newValue);
            }
            else {
                result.add((data == 0 ||
                        tracker.getOrDefault(data, Collections.emptySet()).size() > 0) ? 1: 0);
            }
        }
        return result;
    }
}
