package org.zutjmx.consola;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.zutjmx.consola.services.ApiColombia;
import org.zutjmx.consola.services.FakerService;
import org.zutjmx.consola.services.ManejoDeCadena;
//import org.zutjmx.consola.util.ConectaConSqlServer;
import org.zutjmx.consola.util.EjemploGetClass;
import org.zutjmx.consola.util.EjemploJavaUtilDate;
import org.zutjmx.consola.util.FlujoDeControl;
import org.zutjmx.consola.util.Levenshtein;
import org.zutjmx.consola.util.PasarPorReferencia;
import org.zutjmx.consola.util.PasarPorReferenciaObjeto;
import org.zutjmx.consola.util.PasarPorValor;
import org.zutjmx.consola.util.WrapperBoolean;
import org.zutjmx.consola.util.WrapperInteger;

import java.util.List;

@SpringBootApplication
public class ConsolaApplication implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory.getLogger(ConsolaApplication.class);

	@Autowired
	private FakerService fakerService;

	@Autowired
	private Levenshtein levenshtein;

	@Autowired
	private FlujoDeControl flujoDeControl;

	@Autowired
	private ApiColombia apiColombia;

	@Autowired
	private ManejoDeCadena manejoDeCadena;

	@Autowired
	private WrapperInteger wrapperInteger;

	@Autowired
	private WrapperBoolean wrapperBoolean;

	@Autowired
	private EjemploGetClass ejemploGetClass;

	@Autowired
	private PasarPorValor pasarPorValor;

	@Autowired
	private PasarPorReferencia pasarPorReferencia;

	@Autowired
	private PasarPorReferenciaObjeto pasarPorReferenciaObjeto;

	@Autowired
	private EjemploJavaUtilDate ejemploJavaUtilDate;

	/* @Autowired
	private ConectaConSqlServer conectaConSqlServer; */

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

		LOG.info("Tema de flujos de control");
		LOG.info("Sentencia if");
		flujoDeControl.sentenciaSi();

		LOG.info("Sentencia if-else");
		flujoDeControl.sentenciaSiCasoContrario();

		LOG.info("Número de días de cada mes.");
		flujoDeControl.numDiasMes();

		LOG.info("Sentencia switch-case");
		flujoDeControl.switchCase();

		LOG.info("Número de días de cada mes con switch-case.");
		flujoDeControl.numDiasMesSwitchCase();

		LOG.info("Ciclo For");
		flujoDeControl.cicloFor();

		LOG.info("Iterar sobre un arreglo con For");
		flujoDeControl.arregloConFor();

		LOG.info("Llamando una ApiRest con OkHttp");
		apiColombia.GetInfoGeneral();

		LOG.info("Ciclo While");
		flujoDeControl.cicloWhile();

		LOG.info("Ciclo Do-While");
		flujoDeControl.cicloDoWhile();

		LOG.info("Ciclo ForEach");
		flujoDeControl.cicloForEach();

		LOG.info("Quiz de LinkedIn");
		manejoDeCadena.subCadena();

		LOG.info("Búsqueda dentro de una cadena con for");
		flujoDeControl.busquedaConForAnidado();

		LOG.info("generaObjetoInteger");
		wrapperInteger.generaObjetoInteger();

		LOG.info("autoBoxingInteger");
		wrapperInteger.autoBoxingInteger();

		LOG.info("wrapperOperadoresRelacionales");
		wrapperInteger.wrapperOperadoresRelacionales();

		LOG.info("wrapperBoolean");
		wrapperBoolean.metodoPrincipal();

		LOG.info("Ejemplo del método GetClass");
		ejemploGetClass.metodoGetClass();

		LOG.info("Ejemplo de pasar por valor");
		pasarPorValor.metodoPrincipal();

		LOG.info("Ejemplo de pasar por referencia");
		pasarPorReferencia.metodoPrincipal();

		LOG.info("Ejemplo de pasar por referencia objeto");
		pasarPorReferenciaObjeto.metodoPrincipal();

		LOG.info("Ejemplo con java.util.Date");
		ejemploJavaUtilDate.metodoPrincipal();
		ejemploJavaUtilDate.tiempoEnMiliSegundos();

		/* LOG.info("Ejemplo para conectarse a una BD de Sql Server");
		conectaConSqlServer.metodoPrincipal(); */
	}
}
