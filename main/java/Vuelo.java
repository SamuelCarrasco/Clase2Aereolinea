import java.util.ArrayList;

public class Vuelo {
	private String fecha_inicio;
	private String lugar_inicio;
	private String destino;
	public Ciudad ciudadDestino;
	public Avion avion;
	public ArrayList<Pasajero> pasajeros = new ArrayList<Pasajero>();
	public ArrayList<Piloto> unnamed_Piloto_ = new ArrayList<Piloto>();

	public Vuelo(String fecha_inicio, String lugar_inicio, String destino, Ciudad ciudadDestino, Avion avion) {
		this.fecha_inicio = fecha_inicio;
		this.lugar_inicio = lugar_inicio;
		this.destino = destino;
		this.ciudadDestino = ciudadDestino;
		this.avion = avion;
		this.pasajeros.add(new Pasajero(  "20910556-k"));

	}



	public Ciudad getCiudadDestino() {
		return ciudadDestino;
	}

	public String getFecha_inicio() {
		return this.fecha_inicio;
	}

	public String getLugar_inicio() {
		return this.lugar_inicio;
	}

	public String getDestino() {
		return this.destino;
	}
}
