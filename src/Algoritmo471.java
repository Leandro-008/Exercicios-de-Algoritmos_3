import java.util.Scanner;

public class Algoritmo471 {
    public static int divisor(int x, int y){
        int r, n1;
        n1 = 0;
        r = x % y;
        while(r == 0){
            n1++;
            x =  x / y;
            r = x % y;
        }
        return(n1);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, num1, n;

        System.out.println("Digite dividendo: ");
        num = entrada.nextInt();

        System.out.println("Digite divisor: ");
        num1 = entrada.nextInt();

        while(num1 > num){
            System.out.println("INVALIDO.digite numero menor do o dividendo: ");
            num1 = entrada.nextInt();
        }

        n = divisor(num, num1);
        
        if(n == 0){
            System.out.println("Nenhuma vez");
        }else{
        System.out.println("Numero de vezes: " + n);
        }
    }
}
