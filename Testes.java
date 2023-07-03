import java.util.Scanner;

public class Testes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //System.out.println("Digite o tempo gasto na viagem: ");
        
        int tempoGasto = leitor.nextInt();
        //System.out.println("Digite a velocidade média do percurso: ");
        double velocMedia = leitor.nextDouble();
        double Kilometros = tempoGasto * velocMedia;
        double combustivel = (Kilometros / 12);

        //System.out.println("Os kilômetros rodados são: " + Kilometros);
        System.out.println(String.format("%.3f", combustivel));

        leitor.close();
    }

}