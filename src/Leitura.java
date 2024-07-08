//importando a lib do Scanner
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        //criamos uma instância da classe Scanner passando o objeto System.in' como parâmetro para indicar que queremos
        // ler a entrada do usuário pelo teclado.
        Scanner leitura = new Scanner(System.in);

        //Solicita a inserção de cada variável, nesse caso uma String, um inteiro e um double. usamos o método
        // nextLine() para ler uma linha de texto. Além desse, utilizamos também o nextInt() para ler um número inteiro
        // e o nextDouble() para ler um número decimal.
        System.out.println("Digite seu filme favorito: ");
        String filme = leitura.nextLine();
        System.out.println("\nQual o ano de lancamento? ");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("\nDiga sua avaliação para o filme ");
        double avaliacao = leitura.nextDouble();

        //Imprimindo as variaveis que foram imputadas
        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);
    }
}
