import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        //importante iniciar variaveis numericas com zero.
        double mediaAvaliacao = 0;
        double nota = 0;

        //repete a solicitação enquanto o i é menor que zero, (lembrando que a repetição é feita na ordem 0, 1, 2...)
        for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua avaliação para o filme ");
            nota = leitura.nextDouble();
            //usa o += para incrementar ao valor já existente na variável
            mediaAvaliacao += nota;
        }

        System.out.println("Media de avaliações: " + mediaAvaliacao/3);
    }
}
