import java.util.Scanner;
import java.lang.Math;

public class Algoritmo463{
    public static float radiano(float rang){
        rang = (float) (rang * Math.PI/180);
        return rang;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float ang, r;

        System.out.println("Digite angulo em graus: ");
        ang = entrada.nextFloat();
        r = radiano(ang);
        System.out.println("Graus: " + ang + " radianos: " + r);

        entrada.close();
    }
}