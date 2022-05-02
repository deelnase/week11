package com.example.week11;

import java.util.LinkedHashSet;

public class HelloApplication {
    public static void main(String[] args) {
        LinkedHashSet<String> strings = new LinkedHashSet<>();
        LinkedHashSet<String> strings1 = new LinkedHashSet<>();
        strings.add("George");
        strings.add("Jim");
        strings.add("John");
        strings.add("Blake");
        strings.add("Kevin");
        strings.add("Michael");

        strings1.add("George");
        strings1.add("Katie");
        strings1.add("Kevin");
        strings1.add("Michelle");
        strings1.add("Ryan");

        LinkedHashSet<String> lhs1 = new LinkedHashSet<>();
        lhs1.addAll(strings);

        LinkedHashSet<String> lhs2 = new LinkedHashSet<>();
        lhs2.addAll(strings1);
        strings.addAll(strings1);
        System.out.println(strings);

        LinkedHashSet<String> copyNames1 = new LinkedHashSet<String>(lhs1);
        copyNames1.retainAll(strings1);
        System.out.println(copyNames1);

        strings.removeAll(copyNames1);
        System.out.println(strings);
    }
}
