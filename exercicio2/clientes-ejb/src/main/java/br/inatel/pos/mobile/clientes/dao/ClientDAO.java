package br.inatel.pos.mobile.clientes.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.inatel.pos.mobile.clientes.entities.Client;

@Stateless
public class ClientDAO {

	@PersistenceContext(unitName = "clientManager")
	private EntityManager em;

	public void insert(Client client) {
		em.persist(client);
	}
	
	public List<Client> findAll(){
		return em.createQuery("from Client c", Client.class).getResultList();
	}
}
