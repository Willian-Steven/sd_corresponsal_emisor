package co.edu.campusucc.edu.sd.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.campusucc.sd.daos.AdministradorDAO;

import co.edu.campusucc.sd.modelo.Administrador;

class AdministradorTest {

	@Test
	void testPersist() {

		AdministradorDAO dao = new AdministradorDAO();
		Administrador ad = new Administrador();

		ad.setNombreAdministrador("Carlos");
		ad.setIdAdministrador("10");

		try {
			dao.persist(ad);
			assertTrue(true);

		} catch (Exception e) {

			fail(e.toString()); // TODO
		}
	}
}
