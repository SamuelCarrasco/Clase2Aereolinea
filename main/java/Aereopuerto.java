import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aereopuerto {
	public ArrayList<Avion> aviones = new ArrayList<Avion>();

	public Avion agregarAvion(String patente, int año, double kilometraje) {
		this.aviones.add(new Avion("SACG-17", 2010, 15222045, Aereopuerto.this));
		this.aviones.add(new Avion("SJAJ-10", 2019, 1298045, Aereopuerto.this));
		this.aviones.add(new Avion("CBRR-28", 2018, 1529832045, Aereopuerto.this));
		this.aviones.add(new Avion("LAJAU-02", 2020, 15223045, Aereopuerto.this));
		this.aviones.add(new Avion("YEHN-20", 2020, 329832045, Aereopuerto.this));
		this.aviones.add(new Avion("JHDS-17", 2022, 23152045, Aereopuerto.this));
		this.aviones.add(new Avion("LOJGT-36", 2021, 21512045, Aereopuerto.this));
		this.aviones.add(new Avion("UJGS-88", 2022, 1222102145, Aereopuerto.this));
		this.aviones.add(new Avion("FFFLEH-06", 2022, 1231543125, Aereopuerto.this));
		this.aviones.add(new Avion("ZAELCB-04", 2017, 231043215, Aereopuerto.this));
		throw new UnsupportedOperationException();
	}

	public void verAviones() {
		throw new UnsupportedOperationException();
	}

	public List<Avion> getAviones() {
		throw new UnsupportedOperationException();
	}

	public List<Pasajero> buscarPasajerosFechas(Date fecha) {
		throw new UnsupportedOperationException();
	}

	public List<Pasajero> buscarPasajerosVuelos(Vuelo vuelo) {
		throw new UnsupportedOperationException();
	}

	public List<Pasajero> busarPasajerosCovid() {
		throw new UnsupportedOperationException();
	}
}