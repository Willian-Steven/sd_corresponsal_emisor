package co.edu.campusucc.edu.sd.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import co.edu.campusucc.sd.daos.TipoDocumentoDAO;
import co.edu.campusucc.sd.modelo.TipoDocumento;

class TipoDocumentoTest {

	@Test
	void testPersist() {

		TipoDocumentoDAO dao = new TipoDocumentoDAO();
		TipoDocumento td = new TipoDocumento();

		td.setIdTipoDocumento("11");
		td.setNombreDocumento("Cedula");

		try {
			dao.persist(td);
			assertTrue(true);

		} catch (Exception e) {

			fail(e.toString()); // TODO
		}

	}

}
