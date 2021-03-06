package eu.ensup.springdatajpa.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import eu.ensup.springdatajpa.dao.IEleveDao;
import eu.ensup.springdatajpa.domaine.Eleve;

public class EleveTest {
	private Eleve eleve;
	private IEleveDao elevedao;
	private ClassPathXmlApplicationContext appContext;
	
	@Before
	public void init() {
		
		appContext = new ClassPathXmlApplicationContext("spring-data.xml");

		elevedao = (IEleveDao) appContext.getBean("IEleveDao"); //doit avoir la meme casse que l'interface
		eleve = new Eleve("NDIAYE", "Khady");
	}
	@After
	public void destroy() {
		
		eleve = null;
		appContext = null;
		elevedao = null;
	}
	@Test
	public void testCreateEleve() {
		
		elevedao.save(eleve);
		assertEquals("Khady",elevedao.findOne(1).getPrenom() );
	}

	@Test
	public void testReadEleve() {
		
		assertNotNull(elevedao.findOne(1));
	}


}
