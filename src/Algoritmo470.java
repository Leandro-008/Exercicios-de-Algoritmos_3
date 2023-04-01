import java.util.Scanner;

public class Algoritmo470 {
    public static int primo(int n){
        int c,p;
        c=0;
        p=2;
        while(c == 0 && p <= n/2 ){
            if(n % p == 0){ 
                c = 1;
            }
            p++;
        }
        return(c);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, pri;

        System.out.println("digite um numero >0: ");
        num = entrada.nextInt();

        pri = primo(num);
        if(pri == 0){
            System.out.println(num + " eh primo ");
        }else{
            System.out.println(num + " nao eh primo ");
        }
        
    }
}
