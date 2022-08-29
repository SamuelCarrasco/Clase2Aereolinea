import java.util.ArrayList;
import java.util.List;

public class Avion {
	private String patente;
	private int año;
	private double kilometraje;
	public Aereopuerto aereopuerto;
	private List<Vuelo> vuelos;

	public Avion(String patente, int año, double kilometraje, Aereopuerto aereopuerto) {
		this.patente = patente;
		this.año = año;
		this.kilometraje = kilometraje;
		this.aereopuerto = aereopuerto;
		this.vuelos = new ArrayList<>();
		this.vuelos.add(new Vuelo("17:00", "Temuco", "Neuquén", new Ciudad("Neuquén", "38º46", "65º55"), Avion.this) );
		this.vuelos.add(new Vuelo("11:00", "Barcelona", "Coquimbo", new Ciudad("Coquimbo", "38º46", "65º55"), Avion.this) );
		this.vuelos.add(new Vuelo("18:00", "Los angeles", "Buenos Aires", new Ciudad("Buenos Aires", "38º46", "65º55") , Avion.this) );
		this.vuelos.add(new Vuelo("15:00", "Santiago", "Tokio", new Ciudad("Tokio", "38º46", "65º55") , Avion.this) );
		this.vuelos.add(new Vuelo("16:00", "Berlin", "Santa fé", new Ciudad("Santa fé", "38º46", "65º55") , Avion.this) );
		// añadir los parametros
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public double getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(double kilometraje) {
		this.kilometraje = kilometraje;
	}

	public Aereopuerto getAereopuerto() {
		return aereopuerto;
	}

	public void setAereopuerto(Aereopuerto aereopuerto) {
		this.aereopuerto = aereopuerto;
	}

	public String getPatente() {
		return this.patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}
}