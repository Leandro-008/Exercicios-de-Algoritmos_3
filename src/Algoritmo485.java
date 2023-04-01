import java.util.Scanner;

public class Algoritmo485 {
    public static void multivetor(int vet1[],String vet2[], int tam){
        int i, w;
        for(i = 0; i < tam ;i++){
            System.out.println("\n");
            for(w = 0 ;w < vet1[i];  w++){
                System.out.print(vet2[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int l ;
        int num[] = new int[6];
        String num1[] = new String[6];

        for(l = 0 ; l < 6 ; l++){
            System.out.println("Digite  numero: " + (l+1) + " : " + (num[l] = entrada.nextInt()));
        }
        for(l = 0 ; l < 6 ; l++){
            System.out.println("Digite caractere: " + (l+1) + " : " + (num[l] = entrada.nextInt()));
        }

        multivetor(num, num1, 6);
    }
    
}
