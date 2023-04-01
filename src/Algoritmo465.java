import java.util.Scanner;

public class Algoritmo465 {
    public static void verifica(int n1, int n2){
        if(n1 < n2){
            System.out.println(n2);
        }else{
            System.out.println(n1);
        }
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num1,num2;
        System.out.println("Digite numero 1: ");
        num1 = entrada.nextInt();
        System.out.println("Digite o numero 2: ");
        num2 = entrada.nextInt();

        verifica(num1,num2);
        
        entrada.close();
    }
}
