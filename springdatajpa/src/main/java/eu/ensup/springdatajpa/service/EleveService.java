package eu.ensup.springdatajpa.service;

import eu.ensup.springdatajpa.dao.IEleveDao;
import eu.ensup.springdatajpa.domaine.Eleve;

public class EleveService {
	
	private IEleveDao elevedao;

	public IEleveDao getElevedao() {
		return elevedao;
	}

	public void setElevedao(IEleveDao elevedao) {
		this.elevedao = elevedao;
	}
	
	public Eleve creerEleve(Eleve eleve) {
		return elevedao.save(eleve);
	}
	
	public Eleve lireEleve(int id) {
		return elevedao.findOne(id);
	}

}
