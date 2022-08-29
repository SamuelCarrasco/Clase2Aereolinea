import java.util.ArrayList;


public class Piloto extends Persona {
	private int id_piloto;
	public ArrayList<Vuelo> vuelosInscritos = new ArrayList<Vuelo>();

	public int getId_piloto() {
		return this.id_piloto;
	}

	public void setId_piloto(int id_piloto) {
		this.id_piloto = id_piloto;
	}
}