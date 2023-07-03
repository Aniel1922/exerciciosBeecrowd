import java.util.Scanner;

public class Lanche {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int cod = s.nextInt();
        int qtd = s.nextInt();
        double totalLanche;

        switch(cod) {
            case 1: totalLanche = qtd * 4.00;
            break;
            case 2: totalLanche = qtd * 4.50;
            break;
            case 3: totalLanche = qtd * 5.00;
            break;
            case 4: totalLanche = qtd * 2.00;
            break;
            case 5: totalLanche = qtd * 1.50;
            break;
            default: totalLanche = 0;
        }
        System.out.println(String.format("Total: R$ %.2f", totalLanche));
    }
}
