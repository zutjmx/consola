package org.zutjmx.consola;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsolaApplication implements CommandLineRunner {

	private static Logger LOG = LoggerFactory.getLogger(ConsolaApplication.class);

	public static void main(String[] args) {
		LOG.info("Iniciando la aplicación de consola.");
		SpringApplication.run(ConsolaApplication.class, args);
		LOG.info("Finalizando la aplicación de consola.");
	}

	@Override
	public void run(String... args) throws Exception {
		LOG.info("EJECUTANDO : command line runner");

		for (int i = 0; i < args.length; ++i) {
			LOG.info("args[{}]: {}", i, args[i]);
		}
	}
}
