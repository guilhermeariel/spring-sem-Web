package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.service.ConsumoApi;
import br.com.alura.screenmatch.service.ConverteDados;
import java.util.Scanner;

public class Main {
  private Scanner leitura = new Scanner(System.in);
  private ConsumoApi consumo = new ConsumoApi();
  private final String ENDERECO = "https://omdbapi.com/?t=";
  private final String API_KEY = "&apikey=5d534a77";
  private ConverteDados converson = new ConverteDados();


  public void exibeMenu(){
    System.out.println("Digite o nome da serie: ");
    var nomeSerie = leitura.nextLine();
    var json = consumo.obterDados(ENDERECO + nomeSerie.replace( " ", "+") + API_KEY);
    DadosSerie dados = converson.obterDados(json,DadosSerie.class);
    System.out.println(dados);

  }

}
