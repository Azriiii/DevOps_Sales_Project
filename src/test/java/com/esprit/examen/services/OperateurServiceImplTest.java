package com.esprit.examen.services;

import static org.junit.Assert.*;
import com.esprit.examen.entities.Facture;
import org.junit.Test;
import com.esprit.examen.entities.Operateur;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.esprit.examen.repositories.FournisseurRepository;
import com.esprit.examen.repositories.FactureRepository;
import lombok.extern.slf4j.Slf4j;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import com.esprit.examen.repositories.OperateurRepository;
//import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;


@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j

public class OperateurServiceImplTest {
    @Autowired
    IOperateurService operateurService;
    private OperateurRepository operateurRepository;


    @Test
    public void TestRetrieveOperateurs() {
        assertNotNull(operateurService.retrieveAllOperateurs());
        assertNotNull(operateurService,"c'est bon");
    }
}
/*public class ClientServiceImplTest {
	@Autowired
	IClientService clientService;


	@Test
	public void testAddClient() throws ParseException {

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date dateNaissance = dateFormat.parse("30/09/2000");
		Client c = new Client("Salhi", "Ahmed", dateNaissance, "ahmed.salhi@esprit.tn", "pwd", Profession.Cadre,
				CategorieClient.Ordinaire);
		Client client = clientService.addClient(c);
		System.out.print("client "+client);
		assertNotNull(client.getIdClient());
		assertNotNull(client.getCategorieClient());
		assertTrue(client.getNom().length() > 0);
		clientService.deleteClient(client.getIdClient());

	}
	@Test
	public void testDeleteClient() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date dateNaissance = dateFormat.parse("30/09/2000");
		Client c = new Client("Salhi", "Ahmed", dateNaissance, "ahmed.salhi@esprit.tn", "pwd", Profession.Cadre,
				CategorieClient.Ordinaire);
		Client client = clientService.addClient(c);
		clientService.deleteClient(client.getIdClient());
		assertNull(clientService.retrieveClient(client.getIdClient()));
	}

	@Test
	public void testRetrieveAllClients() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date dateNaissance = dateFormat.parse("30/09/2000");
		List<Client> clients = clientService.retrieveAllClients();
		int expected = clients.size();
		Client c = new Client("Salhi", "Ahmed", dateNaissance, "ahmed.salhi@esprit.tn", "pwd", Profession.Cadre,
				CategorieClient.Ordinaire);
		Client client = clientService.addClient(c);
		assertEquals(expected + 1, clientService.retrieveAllClients().size());
		clientService.deleteClient(client.getIdClient());

	}
	@Test
	public void testGetClientsByDateNaissance() throws ParseException
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date startDate = dateFormat.parse("28/09/2000");
		Date endDate = dateFormat.parse("30/09/2005");
		List<Client> clients = clientService.getClientsByDateNaissance(startDate, endDate);
		log.info(" count" + clients.size());
		for (Client client : clients) {
			log.info(" client : " + client.getNom()+ " né le "+client.getDateNaissance());

		}
	}

}
*/