package StringPrac;

import java.time.DateTimeException;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ConcurrentSkipListSet;

public class StringDemo {


    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().totalMemory());
        String s = "Shekhar";
        String s1 = new String("Shekhar");
        System.out.println(s.charAt(6));
        System.out.println(s.substring(3));
        System.out.println(s.contains("kha"));  //true
        s.isEmpty();
        System.out.println(s.repeat(2));
        System.out.println(s);
        System.out.println(s1.intern());
//        System.out.println(s==s1.toString());
//        System.out.println(s.equals(s1));
//        System.out.println(s.toUpperCase());
//
//        System.out.println(s.concat(" maity"));
//        s.concat("Test123");
//        System.out.println(s);
//        System.out.println("test".hashCode());
//        System.out.println(new String("test").hashCode());
//        System.out.println(new StringBuilder("test").hashCode());
//
//        System.out.println("----map demo-----");
//        HashMap<String,String> hm = new HashMap<>();
//        hm.put("test","test1");
//        hm.put("test","test2");
//        hm.put(new String("test"),"test3");
//        //hm.put(new StringBuilder("test"),"test4");
//
//        System.out.println(hm);


        ConcurrentSkipListSet sl  = null;
        System.out.println(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());
    }
}
