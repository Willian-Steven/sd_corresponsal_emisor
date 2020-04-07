package co.edu.campusucc.sd.modelo;
// Generated 29/03/2020 10:52:29 PM by Hibernate Tools 5.4.7.Final

/**
 * Locutorio generated by hbm2java
 */
public class Locutorio implements java.io.Serializable {

	private String idLocutorio;
	private Empleados empleados;
	private Pais pais;
	private String enviarGiro;

	public Locutorio() {
	}

	public Locutorio(String idLocutorio) {
		this.idLocutorio = idLocutorio;
	}

	public Locutorio(String idLocutorio, Empleados empleados, Pais pais, String enviarGiro) {
		this.idLocutorio = idLocutorio;
		this.empleados = empleados;
		this.pais = pais;
		this.enviarGiro = enviarGiro;
	}

	public String getIdLocutorio() {
		return this.idLocutorio;
	}

	public void setIdLocutorio(String idLocutorio) {
		this.idLocutorio = idLocutorio;
	}

	public Empleados getEmpleados() {
		return this.empleados;
	}

	public void setEmpleados(Empleados empleados) {
		this.empleados = empleados;
	}

	public Pais getPais() {
		return this.pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public String getEnviarGiro() {
		return this.enviarGiro;
	}

	public void setEnviarGiro(String enviarGiro) {
		this.enviarGiro = enviarGiro;
	}

}
