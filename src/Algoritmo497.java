import java.util.Scanner;

public class Algoritmo497 {
    public static int busca(int[] vet, int tam, int chave) {
        int ini = 0;
        int fim = tam - 1;
        int meio;
    
        while (ini <= fim) {
            meio = (ini + fim) / 2;
            if (chave == vet[meio]) {
                return meio;
            } else if (chave < vet[meio]) {
                fim = meio - 1;
            } else {
                ini = meio + 1;
            }
        }
        meio = -1;
        return (meio);
    }

    public static void ordena(int vet[], int tam){
        int l1, c1, aux;
        for(l1 = 0; l1 < tam-1; l1++){
            for(c1 = l1+1; c1 < tam; c1++){
                if(vet[l1] > vet[c1]){
                    aux = vet[l1];
                    vet[l1] = vet[c1];
                    vet[c1] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int l, c, n;
        int num[] = new int[10];

        for(l = 0; l<10; l++){
            System.out.println("Digite numero: " + (l+1) + " : " );
            num[l] = entrada.nextInt();
        }

        System.out.println("Digite numero de busca: " );

        n = entrada.nextInt();

        ordena(num, 10);

        c = busca(num, 10, n);

        System.out.println("\n VETOR \n");

        for(l = 0; l<10; l++){
            System.out.println("\n" + (l+1) + "-" + num[l]);
        }

        c++;

        if( c != 0){
            System.out.println("\n\n posicao no vetor: " + c);
        }else{
            System.out.println("\n nao encontrado");
        }

    }
}
