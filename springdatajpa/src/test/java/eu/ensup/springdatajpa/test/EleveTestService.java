package eu.ensup.springdatajpa.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import eu.ensup.springdatajpa.dao.IEleveDao;
import eu.ensup.springdatajpa.domaine.Eleve;
import eu.ensup.springdatajpa.service.EleveService;

public class EleveTestService {
	private Eleve eleve;
	private EleveService eleveservice;
	private ClassPathXmlApplicationContext appContext;
	
	@Before
	public void init() {
		
		appContext = new ClassPathXmlApplicationContext("spring-data.xml");

		eleveservice = (EleveService) appContext.getBean("eleveservice"); //doit avoir la meme casse que l'interface
		eleve = new Eleve("FALL", "Yacine");
	}
	@After
	public void destroy() {
		
		eleve = null;
		appContext = null;
		eleveservice = null;
	}
	@Test
	public void testCreateEleve() {
		
		eleveservice.creerEleve(eleve);
		assertEquals("Yacine",eleveservice.lireEleve(5).getPrenom());
	}

	@Test
	public void testReadEleve() {
		assertNotNull(eleveservice.lireEleve(3));
	}



}
