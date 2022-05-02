package com.example.week11;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class exe21_06ex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> stringIntegerTreeMap = new TreeMap<>();
        while (in.hasNext()) {
            String trim = in.next().trim();
            if (trim.length() > 0) {
                if (trim.equals("0")) {
                    Set<Map.Entry<String, Integer>> entrySet = stringIntegerTreeMap.entrySet();
                    int i = 0;
                    for (Map.Entry<String, Integer> entry : entrySet) {
                        i = Math.max(entry.getValue(), i);
                    }
                    for (Map.Entry<String, Integer> entry : entrySet) {
                        if (entry.getValue() == i) {
                            System.out.println("" + entry.getKey());
                        }
                    }
                    return;
                } else {
                    if (!stringIntegerTreeMap.containsKey(trim)) {
                        stringIntegerTreeMap.put(trim, 1);
                    } else {

                        int value = stringIntegerTreeMap.get(trim);
                        value++;
                        stringIntegerTreeMap.put(trim, value);
                    }
                }
            }
        }
    }
}
