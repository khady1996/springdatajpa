package eu.ensup.springdatajpa.presentation;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lanceur {
	private static final Logger logger = Logger.getLogger(Lanceur.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Chargement du conteneur
		ApplicationContext appContext = (ApplicationContext) new ClassPathXmlApplicationContext("springcf.xml");

		// 2. Recuperaton d'un bean
//		EleveService eleveservice = (EleveService) appContext.getBean("eleveservice");
		// 3. Manipulation du bean
//		logger.info(eleveservice.lireEleve(1).toString());

	}

}
