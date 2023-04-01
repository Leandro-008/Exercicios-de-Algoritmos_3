import java.util.Scanner;

public class Algoritmo490 {

    public static int restantes(String[] vet, int tam, String x) {
        int cont = 0;
        for (int i = 0; i < tam; i++) {
            if (vet[i].equals(x)) {
                vet[i] = "1";
                cont++;
            }
        }
        return cont;
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nome = new String[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite uma palavra em letras minúsculas: ");
            nome[i] = entrada.nextLine();
            int cont = restantes(nome, nome[i].length(), "c");
            System.out.println("A palavra " + nome[i] + " tem " + cont + " letras c.");
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + " - " + nome[i]);
        }
    }
}