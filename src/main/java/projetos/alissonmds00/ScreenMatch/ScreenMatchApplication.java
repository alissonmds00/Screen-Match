package projetos.alissonmds00.ScreenMatch;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import projetos.alissonmds00.ScreenMatch.model.DataSeries;
import projetos.alissonmds00.ScreenMatch.services.API;
import projetos.alissonmds00.ScreenMatch.services.DataConvert;

@SpringBootApplication
public class ScreenMatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenMatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoAPI = new API();
		var resposta = consumoAPI.obterDados("http://www.omdbapi.com/?apikey=5e2241c4&t=gotham");
		System.out.println(resposta);

		var dataConversor = new DataConvert();
		var json = dataConversor.obterDados(resposta, DataSeries.class);
		System.out.println(json);
	}
}
