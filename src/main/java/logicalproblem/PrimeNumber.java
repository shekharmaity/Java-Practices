package logicalproblem;

public class PrimeNumber {

    public static void main(String[] args) {
        int x = 2;
        int flag = 0;
        for(int i = 2; i<= x/2; i++){
            if(x%i == 0){
                flag = 1;
                break;
            }
        }
        System.out.println(x +(flag == 0? " is prime number": " not a prime number"));
    }

}
