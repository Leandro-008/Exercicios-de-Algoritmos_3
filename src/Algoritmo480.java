import java.util.Scanner;

public class Algoritmo480 {
    public static int reverso(int num){
        int soma, r;
        soma = 0;
        while(num != 0){
            r = num % 10;
            soma = soma * 10 + r;
            num = num / 10;
        }
        return(soma);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n, x ;
        System.out.println("Digite numero: ");
        n = entrada.nextInt();

        x = reverso(n);
        
        System.out.println(n + " - " + x);
        if(x == n){
            System.out.println("Eh um numero capicua ");
        }else{
            System.out.println("Nao eh um numero capicua ");
        }

    }
}
