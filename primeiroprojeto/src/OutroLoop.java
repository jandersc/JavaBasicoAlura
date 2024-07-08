import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        //importante iniciar variaveis numericas com zero.
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        //repete a solicitação enquanto o imput é diferente de -1
        while (nota != -1) {
            System.out.println("Diga sua avaliação para o filme ou -1 para encerrar");
            nota = leitura.nextDouble();

            //Se a nota for diferente de -1 o calculo da media é realizado com os imputs
            if (nota != -1){
                //usa o += para incrementar ao valor já existente na variável
                mediaAvaliacao += nota;
                totalDeNotas++;
            }
        }

        System.out.println("Media de avaliações: " + mediaAvaliacao/totalDeNotas);
    }
}
