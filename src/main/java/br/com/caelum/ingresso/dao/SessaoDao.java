package br.com.caelum.ingresso.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import antlr.collections.List;
import br.com.caelum.ingresso.model.Sala;
import br.com.caelum.ingresso.model.Sessao;
import br.com.caelum.ingresso.model.Sessão;

@Repository

public class SessaoDao {
@PersistenceContext
private EntityManager manager;

public void save(Sessão sessao) { 
	manager.persist(sessao);
}
public List buscaSessoesDaSala(Sala sala) {
	return (List) manager.createQuery("select s from Sessão s where s.sala = :sala",
								Sessão.class)
			.setParameter("sala", sala) 
			.getResultList();

	}
}
