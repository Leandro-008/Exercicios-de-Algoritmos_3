import java.util.Scanner;

public class Algoritmo495 {

    public static void ordena(String[] vet) {
        for (int i = 0; i < vet.length - 1; i++) {
            for (int j = i + 1; j < vet.length; j++) {
                if (vet[i].compareTo(vet[j]) > 0) {
                    String aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nomes = new String[5];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = entrada.nextLine();
        }

        ordena(nomes);

        System.out.println("\n\nNOMES ORDENADOS");

        for (int i = 0; i < nomes.length; i++) {
            System.out.println((i + 1) + ": " + nomes[i]);
        }
    }
}