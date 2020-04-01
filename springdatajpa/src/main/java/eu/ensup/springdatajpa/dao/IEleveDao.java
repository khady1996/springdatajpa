package eu.ensup.springdatajpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import eu.ensup.springdatajpa.domaine.Eleve;

public interface IEleveDao extends JpaRepository<Eleve, Integer> {


}