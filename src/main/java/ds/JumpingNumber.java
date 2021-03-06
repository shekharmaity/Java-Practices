package ds;

import java.io.IOException;
import java.util.*;

public class JumpingNumber {

    // Prints all jumping numbers smaller than or equal to x starting
    // with 'num'. It mainly does BFS starting from 'num'.
    public SortedSet<Integer> jumpNum = new TreeSet<Integer>();

    public void bfs(int x, int num)
    {
        // Create a queue and enqueue 'i' to it
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(num);

        // Do BFS starting from i
        while (!q.isEmpty()) {
            num = q.peek();
            q.poll();
            if (num <= x) {
                System.out.print(num + " ");
                jumpNum.add(num);
                int last_digit = num % 10;

                // If last digit is 0, append next digit only
                if (last_digit == 0) {
                    q.add((num * 10) + (last_digit + 1));
                }

                // If last digit is 9, append previous digit only
                else if (last_digit == 9) {
                    q.add((num * 10) + (last_digit - 1));
                }

                // If last digit is neighter 0 nor 9, append both
                // previous and next digits
                else {
                    q.add((num * 10) + (last_digit - 1));
                    q.add((num * 10) + (last_digit + 1));
                }
            }
        }
    }

    // Prints all jumping numbers smaller than or equal to
    // a positive number x
    public void printJumping(int x)
    {
        System.out.print("0 ");

        for (int i = 1; i <= 9 && i <= x; i++) {
            this.bfs(x, i);
        }
    }

    // Driver program
    public static void main(String[] args) throws IOException
    {
        int x = 69;
        JumpingNumber obj = new JumpingNumber();
        obj.printJumping(x);
        System.out.println("");
        System.out.println(obj.jumpNum.last());
        //  obj.jumpNum.size();

    }
}

