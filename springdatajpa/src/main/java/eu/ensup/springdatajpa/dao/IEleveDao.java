package eu.ensup.springdatajpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import eu.ensup.springdatajpa.domaine.Eleve;

public interface IEleveDao extends JpaRepository<Eleve, Integer> {

	public List<Eleve> findByNom(String nom);

}