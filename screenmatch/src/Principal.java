import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
      Filme meuFilme = new Filme();
      meuFilme.setNome("O poderoso chefão");
      meuFilme.setAnoDeLancamento(1970);
      meuFilme.setDuracaoEmMinutos(180);
      meuFilme.setIncluidoNoPlano(true);
      System.out.println("A duração do new filme é: " + meuFilme.getDuracaoEmMinutos());

      meuFilme.exibeFichaTecnica();

      meuFilme.avalia(9.5);
      meuFilme.avalia(8.8);
      meuFilme.avalia(8.9);

      System.out.println("O total de avaliações é: " + meuFilme.getTotalDeAvaliacoes());

      System.out.println("Sua média de avaliação é: " + meuFilme.pegaMedia());

      Serie twd = new Serie();
      twd.setNome("The Walking Dead");
      twd.setAnoDeLancamento(2011);
      twd.exibeFichaTecnica();
      twd.setTemporadas(10);
      twd.setEpisodiosPorTemporada(10);
      twd.setMinutosPorEpisodio(50);
      System.out.println("Duração para maratonar TWD: " + twd.getDuracaoEmMinutos());

      Filme outroFilme = new Filme();
      outroFilme.setNome("MIB - Homens de Preto");
      outroFilme.setAnoDeLancamento(1999);
      outroFilme.setDuracaoEmMinutos(120);

      CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
      calculadora.inclui(meuFilme);
      calculadora.inclui(outroFilme);
      calculadora.inclui(twd);
      System.out.println(calculadora.getTempoTotal());

      FiltroRecomendacao filtro = new FiltroRecomendacao();
      filtro.filtra(outroFilme);

      Episodio episodio = new Episodio();
      episodio.setNumero(1);
      episodio.setSerie(twd);
      episodio.setTotalVisualizacoes(300);
      filtro.filtra(episodio);

    }
}