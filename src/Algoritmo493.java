import java.util.Scanner;

public class Algoritmo493 {

    public static int verificaOrdem(int[] vet, int tam) {
        int crescente = busca(vet, tam);
        int decrescente = buscaL(vet, tam);

        if (crescente == 1) {
            return 1;
        } else if (decrescente == 2) {
            return 2;
        } else {
            return 0;
        }
    }

    public static int buscaL(int[] vet, int tam) {
        int i, x;

        for (i = 0; i < tam - 1; i++) {
            if (vet[i] < vet[i+1]) {
                x = 0;
                return x;
            }
        }

        x = 2;
        return x;
    }

    public static int busca(int[] vet, int tam) {
        int i, x;

        for (i = 0; i < tam - 1; i++) {
            if (vet[i] > vet[i+1]) {
                x = 0;
                return x;
            }
        }

        x = 1;
        return x;
    }

    public static void main(String[] args) {
        int L, c, num[] = new int[10];
        Scanner entrada = new Scanner(System.in);

        for (L = 0; L < 10; L++) {
            System.out.print("Digite numero: " + (L+1) + ": ");
            num[L] = entrada.nextInt();
        }

        c = verificaOrdem(num, 10);

        if (c == 1) {
            System.out.println("\nORDENACAO CRESCENTE");
        } else if (c == 2) {
            System.out.println("\nORDENACAO DECRESCENTE");
        } else {
            System.out.println("\nNAO ESTA ORDENADO");
        }
    }
}

