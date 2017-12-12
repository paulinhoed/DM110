package br.inatel.pos.mobile.clientes.ejb;

import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import br.inatel.pos.mobile.clientes.dao.ClientDAO;
import br.inatel.pos.mobile.clientes.entities.Client;
import br.inatel.pos.mobile.clientes.interfaces.ClientLocal;
import br.inatel.pos.mobile.clientes.interfaces.ClientRemote;

@Stateless
@Local(ClientLocal.class)
@Remote(ClientRemote.class)
public class ClientBean implements ClientLocal, ClientRemote{

	@EJB
	private ClientDAO dao;
	
	@Override
	public void addNewClient(String name) {
		Client client = new Client();
		client.setName(name);
		client.setEmail("email");
		dao.insert(client);
		
	}

	@Override
	public String[] listClients() {
		return dao.findAll()
				.stream()
				.map(Client::getName)
				.collect(Collectors.toList())
				.toArray(new String[0]);
	}

}
