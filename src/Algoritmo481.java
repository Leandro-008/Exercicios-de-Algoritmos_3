import java.util.Scanner;

public class Algoritmo481 {
    public static int converte(int nnum, int nbase){
        int nb, r, b;
        b = 0;
        nb = 0;
        while(nnum >= nbase){
            r = nnum % nbase;
            nb = nb + 10 ^b * r;
            nnum = nnum/nbase;
            b++;
        }
        nb = nb + 10 ^b * nnum;
        return(nb);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, base, c;

        System.out.println("digite numero maior ou igual a 0: ");
        num = entrada.nextInt();

        while(num < 0){
            System.out.println("Numero negativo.Digite numero maior ou igual a 0: ");
            num = entrada.nextInt();
        }

        System.out.println("digite a base em deseja representa-lo(2-10): ");
        base = entrada.nextInt();

        while(base < 2 || base > 10){
            System.out.println("Nao sei converter.Digite a base em deseja 420 representa-lo(2-10): ");
            base = entrada.nextInt();
        }

        c = converte(num, base);

        System.out.println("numero em decimal: " + num);

        System.out.println("numero na base " + base + " : " + c);
    }
}
