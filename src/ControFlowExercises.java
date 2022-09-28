import java.math.BigInteger;
import java.util.Scanner;

public class ControFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 15) {
            System.out.print(i + " ");
            i++;
        }



        for (double u = 2; u < 1_000_000; u *= u) {
            System.out.println(u);
        }
    }
}
