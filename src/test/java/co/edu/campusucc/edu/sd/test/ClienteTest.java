package co.edu.campusucc.edu.sd.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.campusucc.sd.daos.ClienteDAO;
import co.edu.campusucc.sd.daos.PaisDAO;
import co.edu.campusucc.sd.modelo.Cliente;
import co.edu.campusucc.sd.modelo.Pais;

class ClienteTest {

	@Test
	void testPersist() {
		ClienteDAO dao = new ClienteDAO();
		Cliente cl = new Cliente();

		cl.setApellido("Bonilla");
		cl.setIdCliente("6");
		cl.setIdGiro("4");
		cl.setNombres("David");
	
	

		try {
			dao.persist(cl);
			assertTrue(true);

		} catch (Exception e) {

			fail(e.toString()); // TODO
		}

	}

}