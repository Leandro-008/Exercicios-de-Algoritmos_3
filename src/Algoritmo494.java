import java.util.Scanner;

public class Algoritmo494 {

    public static void troca(String[] array, int i, int j) {
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        String[] nome = new String[3];
        String[] prof = new String[3];
        String[] ender = new String[3];

        Scanner entrada = new Scanner(System.in);

        for (int L = 0; L < 3; L++) {
            System.out.println("Digite o nome: ");
            nome[L] = entrada.nextLine();
            System.out.println("Digite o endereço: ");
            ender[L] = entrada.nextLine();
            System.out.println("Digite a profissão: ");
            prof[L] = entrada.nextLine();
        }

        for (int L = 0; L < 2; L++) {
            for (int c = L + 1; c < 3; c++) {
                if (nome[L].compareTo(nome[c]) > 0) {
                    troca(nome, L, c);
                    troca(ender, L, c);
                    troca(prof, L, c);
                }
            }
        }

        for (int L = 0; L < 3; L++) {
            System.out.println(nome[L] + "\t" + ender[L] + "\t" + prof[L]);
        }
    }
}
