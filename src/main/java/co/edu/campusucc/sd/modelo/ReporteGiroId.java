package co.edu.campusucc.sd.modelo;
// Generated 29/03/2020 10:52:29 PM by Hibernate Tools 5.4.7.Final

/**
 * ReporteGiroId generated by hbm2java
 */
public class ReporteGiroId implements java.io.Serializable {

	private String idReporte;
	private String reporte;

	public ReporteGiroId() {
	}

	public ReporteGiroId(String idReporte) {
		this.idReporte = idReporte;
	}

	public ReporteGiroId(String idReporte, String reporte) {
		this.idReporte = idReporte;
		this.reporte = reporte;
	}

	public String getIdReporte() {
		return this.idReporte;
	}

	public void setIdReporte(String idReporte) {
		this.idReporte = idReporte;
	}

	public String getReporte() {
		return this.reporte;
	}

	public void setReporte(String reporte) {
		this.reporte = reporte;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ReporteGiroId))
			return false;
		ReporteGiroId castOther = (ReporteGiroId) other;

		return ((this.getIdReporte() == castOther.getIdReporte()) || (this.getIdReporte() != null
				&& castOther.getIdReporte() != null && this.getIdReporte().equals(castOther.getIdReporte())))
				&& ((this.getReporte() == castOther.getReporte()) || (this.getReporte() != null
						&& castOther.getReporte() != null && this.getReporte().equals(castOther.getReporte())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getIdReporte() == null ? 0 : this.getIdReporte().hashCode());
		result = 37 * result + (getReporte() == null ? 0 : this.getReporte().hashCode());
		return result;
	}

}
