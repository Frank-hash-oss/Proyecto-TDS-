package gestiongastos.modelo;

public class Categoria {
	
	  private long id;
	    private String nombre;

	    public Categoria(long id, String nombre) {
	        this.id = id;
	        setNombre(nombre);
	    }

	    public long getId() {
	        return id;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        if (nombre == null || nombre.isBlank()) {
	            throw new IllegalArgumentException(
	                "El nombre no puede estar vacío"
	            );
	        }

	        this.nombre = nombre;
	    }

	    @Override
	    public String toString() {
	        return nombre;
	    }

}
