import java.util.Scanner;

public class Algoritmo462 {

    public static float media(float x,float y,float z){
        float ma = (x+y+z)/3;
        return(ma);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float n1,n2,n3,m;

        System.out.println("Digite nota 1: ");
        n1 = entrada.nextFloat();
        System.out.println("Digite nota 2: ");
        n2 = entrada.nextFloat();
        System.out.println("Digite nota 3: ");
        n3 = entrada.nextFloat();

        m = media(n1,n2,n3);

        System.out.println("Media armazenada em variavel: " + m);

        entrada.close();
    }
}
