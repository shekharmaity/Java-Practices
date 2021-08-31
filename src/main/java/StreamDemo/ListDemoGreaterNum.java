package StreamDemo;

import java.util.*;

public class ListDemoGreaterNum {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
        l.add(10);
        l.add(5);
        l.add(30);
        l.add(2);
        l.add(30);
        l.add(50);
        l.add(65);

        OptionalInt i = l.stream().mapToInt(v -> v).max();
        System.out.println(i);
        l.stream().sorted();

        Integer [] iArr = new Integer[]{2,3,6,4,10,12,34,50,45,65,76,67};
        List<Integer> arrL = Arrays.asList(iArr);

        OptionalInt i1 = arrL.stream().mapToInt(v -> v).max();
        System.out.println(i1);

        int sum = arrL.stream().mapToInt(s -> s).sum();
        System.out.println(sum);

//        Arrays.binarySearch(arrL, 6);


        String pattern = ")()()(()())()((";
        pattern = pattern.replace("()","");
        System.out.println(pattern);

    }
}
