import java.util.Scanner;

public class Algoritmo499 {

    public static int entrada(int vet[], int t) {
        Scanner entrada = new Scanner(System.in);
        int l;

        for (l = 0; l < t; l++) {
            System.out.print("Digite o " + (l + 1) + "o numero: ");
            vet[l] = entrada.nextInt();
        }
        return vet[l];
    }

    public static int imprime(int vet[], int t) {
        System.out.println("\nVETOR");
        int l;

        for (l = 0; l < t; l++) {
            System.out.println((l + 1) + " - " + vet[l]);
        }
        return vet[l];
    }

    public static int ordena(int[] vet, int tam) {
        int l1, c1, aux;

        for (l1 = 0; l1 < 4; l1++) {
            for (c1 = l1 + 1; c1 < 5; c1++) {
                if (vet[l1] > vet[c1]) {
                    aux = vet[l1];
                    vet[l1] = vet[c1];
                    vet[c1] = aux;
                }
            }
        }
        return(vet[l1]);
    }

    public static void main(String[] args) {
        int[] num = new int[5];
        int l, flag, op;
        Scanner entrada = new Scanner(System.in);

        flag = 0;

        for(l= 0; l<5 ; l++){
            num[l] = 0;
        }do{
            System.out.println("\n\nMENU VETOR - FUNCAO");
            System.out.println("\n1 Dados do VETOR");
            System.out.println("2 Ordena VETOR");
            System.out.println("3 Imprime VETOR");
            System.out.println("4 Sai do programa");
            System.out.print("\nOPCAO: ");

            op = entrada.nextInt();

            switch (op) {
                case 1:
                    entrada(num, 5);
                    flag = 1;
                    break;

                case 2:
                    if (flag == 1) {
                        ordena(num, 5);
                    } else {
                        System.out.println("\nEscolha primeiro opcao 1");
                    }
                    break;

                case 3:
                    if (flag == 1) {
                        imprime(num, 5);
                    } else {
                        System.out.println("\nEscolha primeiro opcao 1");
                    }
                    break;

                case 4:
                    System.out.println("\nSaindo do algoritmo");
                    break;

                default:
                    System.out.println("\nOpcao invalida");
                    break;
            }
        }while (op != 4);
        
    }
}

