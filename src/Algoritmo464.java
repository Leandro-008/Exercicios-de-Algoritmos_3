import java.lang.Math;
import java.util.Scanner;

public class Algoritmo464 {
    public static float graus(float gang){
        gang = (float) (gang *  180/Math.PI);
        return gang;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float ang,g;
        System.out.println("Digite angulo em radianos: ");
        ang = entrada.nextFloat();
        g = graus(ang);
        
        System.out.println("Radianos: " + ang + " Graus: " + g);

        entrada.close();
    }
}
