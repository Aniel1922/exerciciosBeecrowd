import java.util.Scanner;

public class Soma {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);

        int A = s.nextInt();
        int B = s.nextInt();
        int Soma = A + B;

        System.out.println("X = " + Soma);

        s.close();

    }
    
}
