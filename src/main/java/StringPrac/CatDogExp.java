package StringPrac;

import java.util.Locale;

public class CatDogExp {

    public static void main(String[] args) {
        String cat = "cat";
        String dog = "dog";

        String request = "catkadjadhDOG".toLowerCase();

        if(request.contains(cat) &&request.contains(dog)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
