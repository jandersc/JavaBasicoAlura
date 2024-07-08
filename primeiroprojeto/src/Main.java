public class Main {
    public static void main(String[] args) {

        //primeira impressão de tela
        System.out.println("Esse é o Screen Match \n");
        System.out.println("Filme: Top Gun: Maverick \n");

        //imprimindo tipos primitivos
        int anoDeLancamento = 2022;
        System.out.println("Ano de lancamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        //calculando média
        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println("\nA nota média do filme é de: " + media);

        //imprimindo string
        String sinopse;
        sinopse = "\nFilme de aventura com galã dos anos 80 \n";
        System.out.println(sinopse);

        // utilizando cast para conversão de double para inteiro
        int classificacao;
        classificacao = (int) (media /2);
        System.out.println("A nota média do filme são " + classificacao + " estrelas \n");

        //Concatenando Strings
        String saudacao = "Olá, meu nome é ";
        String nome = "Alice ";
        String continuacao = "e minha idade é ";
        int idade = 17;
        System.out.println(saudacao + nome + continuacao + idade);

        //Exercicio de conversão Grau Celsius em Fahrenheit
        double temperaturaGrau;
        temperaturaGrau = 37.5;
        int temperaturaFahrenheit;
        temperaturaFahrenheit = (int) (temperaturaGrau*1.8) + 32;
        System.out.println("\nA temperatura em Fahrenheit é: " + temperaturaFahrenheit);

    }
}