package co.edu.campusucc.edu.sd.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import co.edu.campusucc.sd.daos.TipoClienteDAO;
import co.edu.campusucc.sd.modelo.TipoCliente;

class TipoClienteTest {

	@Test
	void testPersist() {
		TipoClienteDAO dao = new TipoClienteDAO();
		TipoCliente tc = new TipoCliente();

		tc.setNombre("William");
		tc.setIdTipoCliente("222");

		try {
			dao.persist(tc);
			assertTrue(true);

		} catch (Exception e) {

			fail(e.toString()); // TODO
		}

	}

}