package co.edu.campusucc.edu.sd.pgm;

import static org.junit.jupiter.api.Assertions.*;

import co.edu.campusucc.sd.daos.BancoDAO;

import co.edu.campusucc.sd.modelo.Banco;

class BancoPGM {

	public static void main(String[] args) {

		BancoDAO dao = new BancoDAO();
		Banco ba = new Banco();

		ba.setIdBanco("1123");
		ba.setIdDivisas("223");

		try {
			dao.persist(ba);
			System.out.println("sublime");

		} catch (Exception e) {

			System.out.print((e.toString())); // TODO
		}
	}
}
