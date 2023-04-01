import java.util.Scanner;

public class Algoritmo473 {
    public static int maiuscula(String letra){
        if(letra == "A" || letra == "a" || letra == "E" || letra == "e" || letra == "I" || letra == "i" ||
        letra == "O" || letra == "o" || letra == "U" || letra == "u"){
            return (1);
        }else{
            return(0);
        }
    }
        
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String c;
        System.out.println("Digite letra: ");
        c = entrada.next();

        if(maiuscula(c) == 1){
            System.out.println("Eh uma consoante");
        }else{
            System.out.println("Nao eh uma consoante");
        }

        entrada.close();
    }
}
