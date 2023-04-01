import java.util.Scanner;
import java.lang.Math;

public class Algoritmo467 {

    public static double loga(double base,double expo){
        double i;
        i = Math.log(base)/Math.log(expo);
        return(i);
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double z, l, b;
        int c;

        for(c= 1; c<= 3; c++){
            System.out.println("Digite logaritmando maior do que 0: ");
            l = entrada.nextDouble();

            while(l <= 0){
                System.out.println("Invalido.Digite logaritmando maior do que O: ");
                l = entrada.nextDouble();
            }

            System.out.println("digite base maior que O e diferente de 1: ");
            b = entrada.nextDouble();

            while(b < 0 || b == 1){
                System.out.println("lnvalido.digite base maior que O e diferente de 1: ");
                b = entrada.nextDouble();
            }

            System.out.println("logaritmo : " + loga(l,b));

            z = loga(l, b);

            System.out.println("z = " + z);
        }
    }
}
