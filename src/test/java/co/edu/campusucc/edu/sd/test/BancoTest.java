package co.edu.campusucc.edu.sd.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.campusucc.sd.daos.AdministradorDAO;
import co.edu.campusucc.sd.daos.BancoDAO;
import co.edu.campusucc.sd.modelo.Administrador;
import co.edu.campusucc.sd.modelo.Banco;

class BancoTest {

	@Test
	void testPersist() {

		BancoDAO dao = new BancoDAO();
		Banco ba = new Banco();

		ba.setIdBanco("1123");
		ba.setIdDivisas("223");

		try {
			dao.persist(ba);
			assertTrue(true);

		} catch (Exception e) {

			fail(e.toString()); // TODO
		}
	}
}

