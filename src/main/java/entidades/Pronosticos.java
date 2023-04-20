package entidades;

public class Pronosticos {
	
	private int id;
	private String ronda;
	private String nombre;
	private String pronostico;
	private int puntaje;
	
	
	public Pronosticos() {
		
	}
	
	public Pronosticos(String ronda, String nombre, String pronostico, int puntaje) {
		this.ronda=ronda;
		this.nombre=nombre;
		this.pronostico=pronostico;
		this.puntaje=puntaje;
		
	}
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	public String getRonda() {
		return ronda;
	}

	public void setRonda(String ronda) {
		this.ronda = ronda;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public String getPronostico() {
		return pronostico;
	}

	public void setPronostico(String pronostico) {
		this.pronostico = pronostico;
	}
	
	
	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	
	
	public String toString() {
		return "Pronosticos[id=" + id + ", ronda=" + ronda + ", nombre=" + nombre + ", pronostico=" + pronostico + ", puntaje=" + puntaje + "]";
	}

}
