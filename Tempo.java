import java.util.Scanner;

public class Tempo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int segundos;
        int minutos;
        int horas;

        horas = N/3600;
        minutos = (N % 3600) / 60; //resto da conta anterior q é as horas e dividir pelo total de minutos
        segundos = (N % 3600) % 60;// em vez de dividir, queremos apenas o resto, q é o q falta

        System.out.println(horas + ":" + minutos + ":" + segundos);

    }
}

