package one.digitalinnovation.basecamp;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        //complete os espaços com sua solução
        Scanner leitor = new Scanner(System.in);
        System.out.print("Escreva o valor de N:");
        int N = leitor.nextInt();
        float X, Y; //Basicamente a resolução que eu achei ta aqui, determinar que as variaveis são float.
        for (int i = 0; i < N; i++) {
            System.out.print("Escreva o valor de X:");
            X = leitor.nextInt();
            System.out.print("Escreva o valor de Y:");
            Y = leitor.nextInt();
            if (Y == 0) System.out.println("divisao impossivel"); // Y não pode ser 0 se não a divisão é impossivel.
            else System.out.println("Resultado:" +  X / Y);
        }
    }

}
