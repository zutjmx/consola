package org.zutjmx.consola;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.zutjmx.consola.services.FakerService;
import org.zutjmx.consola.util.Levenshtein;

import java.util.List;

@SpringBootApplication
public class ConsolaApplication implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory.getLogger(ConsolaApplication.class);

	@Autowired
	private FakerService fakerService;

	@Autowired
	private Levenshtein levenshtein;

	public static void main(String[] args) {
		LOG.info("Iniciando la aplicación de consola.");
		SpringApplication.run(ConsolaApplication.class, args);
		LOG.info("Finalizando la aplicación de consola.");
	}

	@Override
	public void run(String... args) throws Exception {
		LOG.info("EJECUTANDO : command line runner");

		/*for (int i = 0; i < args.length; ++i) {
			LOG.info("args[{}]: {}", i, args[i]);
		}*/

		LOG.info("Nombre chistoso: " + fakerService.nombreChistoso());
		LOG.info("Persona: " + fakerService.generaPersona().toString());

		List<Integer> listaDeEnteros = fakerService.generaArregloDeEnteros(11);
		LOG.info("Lista de enteros: " + listaDeEnteros.toString());
		LOG.info("Lista de enteros ordenandos: ");
		listaDeEnteros.stream().sorted().forEach(System.out::println);

		String palabraUno = "Techie Delight";
		String palabraDos = "Tech Delight";
		double similitud = levenshtein.findSimilarity(palabraUno, palabraDos);
		LOG.info("Similitud entre " + palabraUno + " y " + palabraDos + " = " + similitud);

	}
}
