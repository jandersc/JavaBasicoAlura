import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhar {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int aleatorio = new Random().nextInt(100);
        int tentativa = 0;
        int digitado = 0;

        while (tentativa < 5) {
            System.out.println("\nTente adivinhar o número gerado de 0 a 100");
            digitado = leitura.nextInt();

            if (aleatorio == digitado) {
                System.out.println("Parabéns você acertou o número");
                break;
            }
            else if (aleatorio < digitado) {
                System.out.println("Você digitou um número MAIOR que o número gerado");
            }
            else {
                System.out.println("Você digitou um número MENOR que o número gerado");
            }

            tentativa++;

            if (tentativa == 5) {
                System.out.println("\nVocê errou as 5 tentativas o número correto é: " + aleatorio);
            }
        }

    }
}