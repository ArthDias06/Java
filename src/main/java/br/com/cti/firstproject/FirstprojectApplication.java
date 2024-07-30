package br.com.cti.firstproject;

import br.com.cti.firstproject.model.DadosCharacter;
import br.com.cti.firstproject.service.ConsumoApi;
import br.com.cti.firstproject.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class FirstprojectApplication implements CommandLineRunner {

	public static void main(String[] args) {

			SpringApplication.run(FirstprojectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<DadosCharacter> personagem = new ArrayList();
		for(int i = 1; i<=10;i++){
			ConsumoApi consumoApi = new ConsumoApi();
			var json = consumoApi.obterDados("https://rickandmortyapi.com/api/character/"+i);
			ConverteDados conversor = new ConverteDados();
			DadosCharacter dados = conversor.obterDados(json, DadosCharacter.class);
			personagem.add(dados);
		}
		personagem.forEach(System.out::println);
	}
}
