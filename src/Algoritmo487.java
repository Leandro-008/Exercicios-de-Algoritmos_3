import java.util.Scanner;

public class Algoritmo487 {
    public static void inverte(int[] vet, int max) {
        int k = max;
        for (int i = 0; i < max/2; i++) {
            int aux = vet[i];
            k--;
            vet[i] = vet[k];
            vet[k] = aux;
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int[] num = new int[n];
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.print("Digite numero " + (i+1) + ": ");
            num[i] = entrada.nextInt();
        }

        inverte(num, n);
        
        System.out.println("\nVETOR\n");

        for (int i = 0; i < n; i++) {
            System.out.println((i+1) + " - " + num[i]);
        }
    }
}