import java.util.List;

public class Ciudad {
	private String nombre_ciudad;
	private String latitud;
	private String longitud;
	private List<Ciudad> ciudad;

	public Ciudad(String nombre_ciudad, String latitud, String longitud) {
		this.nombre_ciudad = nombre_ciudad;
		this.latitud = latitud;
		this.longitud = longitud;
		this.ciudad.add(new Ciudad("Temuco", "38º46", "65º55"));
		this.ciudad.add(new Ciudad("Barcelona", "38º46", "65º55"));
		this.ciudad.add(new Ciudad("Santigo", "38º46", "65º55"));
		this.ciudad.add(new Ciudad("Los Angeles", "38º46", "65º55"));
		this.ciudad.add(new Ciudad("Neuquén", "38º46", "65º55"));
		this.ciudad.add(new Ciudad("Coquimbo", "38º46", "65º55"));
		this.ciudad.add(new Ciudad("Buenos Aires", "38º46", "65º55"));
		this.ciudad.add(new Ciudad("Santa fé", "38º46", "65º55"));
		this.ciudad.add(new Ciudad("Berlin", "38º46", "65º55"));
		this.ciudad.add(new Ciudad("Tokio", "38º46", "65º55"));
	}

	public String getNombre_ciudad() {
		return this.nombre_ciudad;
	}

	public void setNombre_ciudad(String nombre_ciudad) {
		this.nombre_ciudad = nombre_ciudad;
	}

	public String getLatitud() {
		return this.latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public String getLongitud() {
		return this.longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}
}