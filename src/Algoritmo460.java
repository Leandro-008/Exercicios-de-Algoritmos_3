import java.util.Scanner;

public class Algoritmo460{

    public static int dobro(int a){
        return(a * 2);
    }

    public static void main(String[] args) {
    int a;
    Scanner entrada = new Scanner(System.in);
    
    for(int c= 1;c<=3;c++){
        System.out.println("Digite um numero");
        a = entrada.nextInt();
        System.out.println("Dobro: " + dobro(a));
    }
    entrada.close();
    }
}
