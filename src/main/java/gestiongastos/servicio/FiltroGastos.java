package gestiongastos.servicio;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import gestiongastos.modelo.Gasto;

public class FiltroGastos {

    public List<Gasto> filtrarPorFechas(List<Gasto> gastos,LocalDate fechaInicio,LocalDate fechaFin) {

        if (gastos==null || fechaInicio==null || fechaFin==null) {
            throw new IllegalArgumentException("La lista de gastos y las fechas son obligatorias");
        }

        if (fechaInicio.isAfter(fechaFin)) {
            throw new IllegalArgumentException("La fecha inicial no puede ser posterior a la final");
        }

        return gastos.stream().filter(gasto ->!gasto.getFecha().isBefore(fechaInicio) && !gasto.getFecha().isAfter(fechaFin)).collect(Collectors.toList());
    }
    
}