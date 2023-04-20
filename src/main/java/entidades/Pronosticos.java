package entidades;

public class Pronosticos {
	
	private int id;
	private String ronda;
	private String nombre;
	private int puntaje;
	
	
	public Pronosticos() {
		
	}
	
	public Pronosticos(String ronda, String nombre, int puntaje) {
		this.ronda=ronda;
		this.nombre=nombre;
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
	
	
	
	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	
	
	@Override
	public String toString() {
		return "Pronosticos[id=" + id + ", ronda=" + ronda + ", nombre=" + nombre + ", puntaje=" + puntaje + "]";
	}

}
