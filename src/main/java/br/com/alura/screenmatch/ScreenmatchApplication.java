package br.com.alura.screenmatch;

import br.com.alura.screenmatch.principal.Main;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Main main = new Main();
		main.exibeMenu();



//			List<DadosTemporada> temporadas = new ArrayList<>();
//
//		for (int i = 1; i<= dados.totalTemporadas(); i++){
//					json = consumoApi.obterDados("https://omdbapi.com/?t=gilmore+girls&Season=" + i + "&apikey=5d534a77");
//			DadosTemporada dadosTemporada = converson.obterDados(json, DadosTemporada.class);
//			temporadas.add(dadosTemporada);
//
//		}
//		temporadas.forEach(System.out::println);
	}
}
