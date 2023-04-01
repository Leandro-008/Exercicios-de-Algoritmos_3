import java.util.Scanner;

public class Algoritmo483 {
    public static int produtointerno(int vet1[], int vet2[], int quant){
        int prod, i;
        prod = 0;
        for(i = 0 ; i < quant ; i++){
            prod = prod + (vet1[i] + vet2[i]);
        }
        return(prod);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int l, c;
        int num[] = new int[4];
        int num1[] = new int[4];

        for(l = 0 ; l < 4; l++){
        System.out.print("Digite 1 numero " + (l+1) + " : " + (num[l] = entrada.nextInt()));
        }

        for(l = 0 ; l < 4; l++){
            System.out.print("Digite 2 numero" + (l+1) + " : " + (num[l] = entrada.nextInt()) );
        }

        c = produtointerno(num, num1, 4);
        System.out.println("\nVETOR A\tVETORB\n");

        for(l = 0 ; l < 4; l++){
            System.out.println("\n" + num[l] + "\t" + num1[l]);
        }

        System.out.println("produto interno: " + c);
    }
}
