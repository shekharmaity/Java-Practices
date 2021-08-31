package random;


import org.springframework.stereotype.Service;

import java.util.function.BiFunction;

@Service
public class EqualsDemo {
    public static void main(String[] args) {
        String x = "sheku";
        String y = "sheku";
        System.out.println(x==y);

    }
}
