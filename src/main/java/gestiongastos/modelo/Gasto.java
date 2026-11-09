package gestiongastos.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Gasto {

	   private long id;
	    private BigDecimal cantidad;
	    private LocalDate fecha;
	    private Categoria categoria;

	    public Gasto(long id, BigDecimal cantidad,
	                 LocalDate fecha, Categoria categoria) {

	        this.id = id;
	        setCantidad(cantidad);
	        setFecha(fecha);
	        setCategoria(categoria);
	    }

	    public long getId() {
	        return id;
	    }

	    public BigDecimal getCantidad() {
	        return cantidad;
	    }

	    public void setCantidad(BigDecimal cantidad) {
	        if (cantidad == null ||
	            cantidad.compareTo(BigDecimal.ZERO) <= 0) {

	            throw new IllegalArgumentException(
	                "La cantidad debe ser positiva");
	        }

	        this.cantidad = cantidad;
	    }

	    public LocalDate getFecha() {
	        return fecha;
	    }

	    public void setFecha(LocalDate fecha) {
	        if (fecha == null) {
	            throw new IllegalArgumentException(
	                "La fecha no puede ser nula");
	        }

	        this.fecha = fecha;
	    }

	    public Categoria getCategoria() {
	        return categoria;
	    }

	    public void setCategoria(Categoria categoria) {
	        if (categoria == null) {
	            throw new IllegalArgumentException(
	                "La categoría no puede ser nula");
	        }

	        this.categoria = categoria;
	    }
	
}
