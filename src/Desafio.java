import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Tony Stark";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;
        double valor = 0;
        Scanner leitura = new Scanner(System.in);
        String menu = """
        \n** Digite sua opção **
        1 - Consultar Saldo
        2 - Transferir valor
        3 - Receber valor
        4 - Sair
        """;

        System.out.println("*************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n*************************");

        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("Seu saldo atual é: \n" + saldo);
            } else if (opcao == 2) {
                System.out.println("Quanto você quer tranferir? ");
                valor = leitura.nextDouble();
                saldo -= valor;
                System.out.println("Seu saldo atual é: \n" + saldo);
            } else if (opcao == 3) {
                System.out.println("Quanto você vai receber? ");
                valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Seu saldo atual é: \n" + saldo);
            } else {
                System.out.println("Opção inválida! Tente novamente...\n");
            }
        }
    }
}
