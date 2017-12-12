package br.inatel.pos.mobile.clientes.impl;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import br.inatel.pos.mobile.clientes.api.ClientService;
import br.inatel.pos.mobile.clientes.interfaces.ClientRemote;

@RequestScoped
public class ClientServiceImpl implements ClientService{

	@EJB(lookup="java:app/clientes-ejb-1.0.0-SNAPSHOT/ClientBean!br.inatel.pos.mobile.clientes.interfaces.ClientRemote")
	private ClientRemote clientBean;
	
	@Override
	public void addNewClient(String name) {
		clientBean.addNewClient(name);
		
	}

	@Override
	public String[] listClients() {
		return clientBean.listClients();
	}

}
