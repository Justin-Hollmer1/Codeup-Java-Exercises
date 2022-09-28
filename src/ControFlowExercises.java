import java.math.BigInteger;
import java.util.Scanner;

public class ControFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 15) {
            System.out.print(i + " ");
            i++;
        }



        double u = 2;


        do {
            u = u * u;
            System.out.println(u);
        } while (u < 1_000_000);
    }
}
