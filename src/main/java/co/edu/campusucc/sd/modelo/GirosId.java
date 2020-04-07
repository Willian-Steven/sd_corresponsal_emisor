package co.edu.campusucc.sd.modelo;
// Generated 29/03/2020 10:52:29 PM by Hibernate Tools 5.4.7.Final

/**
 * GirosId generated by hbm2java
 */
public class GirosId implements java.io.Serializable {

	private String idGiros;
	private String idCliente;
	private String idSede;
	private String idReporte;
	private String idAdministrador;

	public GirosId() {
	}

	public GirosId(String idGiros) {
		this.idGiros = idGiros;
	}

	public GirosId(String idGiros, String idCliente, String idSede, String idReporte, String idAdministrador) {
		this.idGiros = idGiros;
		this.idCliente = idCliente;
		this.idSede = idSede;
		this.idReporte = idReporte;
		this.idAdministrador = idAdministrador;
	}

	public String getIdGiros() {
		return this.idGiros;
	}

	public void setIdGiros(String idGiros) {
		this.idGiros = idGiros;
	}

	public String getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public String getIdSede() {
		return this.idSede;
	}

	public void setIdSede(String idSede) {
		this.idSede = idSede;
	}

	public String getIdReporte() {
		return this.idReporte;
	}

	public void setIdReporte(String idReporte) {
		this.idReporte = idReporte;
	}

	public String getIdAdministrador() {
		return this.idAdministrador;
	}

	public void setIdAdministrador(String idAdministrador) {
		this.idAdministrador = idAdministrador;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof GirosId))
			return false;
		GirosId castOther = (GirosId) other;

		return ((this.getIdGiros() == castOther.getIdGiros()) || (this.getIdGiros() != null
				&& castOther.getIdGiros() != null && this.getIdGiros().equals(castOther.getIdGiros())))
				&& ((this.getIdCliente() == castOther.getIdCliente()) || (this.getIdCliente() != null
						&& castOther.getIdCliente() != null && this.getIdCliente().equals(castOther.getIdCliente())))
				&& ((this.getIdSede() == castOther.getIdSede()) || (this.getIdSede() != null
						&& castOther.getIdSede() != null && this.getIdSede().equals(castOther.getIdSede())))
				&& ((this.getIdReporte() == castOther.getIdReporte()) || (this.getIdReporte() != null
						&& castOther.getIdReporte() != null && this.getIdReporte().equals(castOther.getIdReporte())))
				&& ((this.getIdAdministrador() == castOther.getIdAdministrador())
						|| (this.getIdAdministrador() != null && castOther.getIdAdministrador() != null
								&& this.getIdAdministrador().equals(castOther.getIdAdministrador())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getIdGiros() == null ? 0 : this.getIdGiros().hashCode());
		result = 37 * result + (getIdCliente() == null ? 0 : this.getIdCliente().hashCode());
		result = 37 * result + (getIdSede() == null ? 0 : this.getIdSede().hashCode());
		result = 37 * result + (getIdReporte() == null ? 0 : this.getIdReporte().hashCode());
		result = 37 * result + (getIdAdministrador() == null ? 0 : this.getIdAdministrador().hashCode());
		return result;
	}

}