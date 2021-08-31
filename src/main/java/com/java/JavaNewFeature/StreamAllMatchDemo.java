package com.java.JavaNewFeature;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAllMatchDemo {

    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("RAM");
        strList.add("RAM");
        strList.add("RAVI");
        strList.add("VIVEK");
        strList.add("TEJAS");

        System.out.println(strList.stream().distinct().collect(Collectors.toList()));//.anyMatch(s -> s.equals("RAM")));

        System.out.println(strList.stream().sorted().collect(Collectors.toList()));

        System.out.println(strList.stream().sorted(Comparator.reverseOrder()).limit(2).collect(Collectors.toList()));

//       allmatch() true when all value matches and false when not matches
    }
}
