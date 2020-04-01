package eu.ensup.springdatajpa.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

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
		eleve = new Eleve("FALL", "khady");
		elevedao = (IEleveDao)appContext.getBean("IEleveDao"); // RECUPERATION DAO !!!
	}

	@After
	public void destroy() {
		eleve = null;
		elevedao = null;
		appContext = null;
	}

	@Test
	public void testSaveEleve() {
		elevedao.save(eleve);
	}

	@Test
	public void testfindElevebyId() {
		Eleve student = elevedao.findOne(1);
		assertNotNull(student);
	}
	

}
