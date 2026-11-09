package gestiongastos.adapters.repository;

import java.util.List;

import gestiongastos.adapters.repository.exceptions.ElementoExistenteException;
import gestiongastos.adapters.repository.exceptions.ElementoNoEncontradoException;
import gestiongastos.adapters.repository.exceptions.ErrorPersistenciaException;
import gestiongastos.modelo.Gasto;

public interface GastoRepository {

	/**
	 * Devuelve los gastos disponibles
	 *
	 * @return lista de gastos
	 */
	List<? extends Gasto> getGastos();

	/**
	 * Busca un gasto por su identificador
	 *
	 * @param id identificador del gasto
	 * @return gasto encontrado
	 * @throws ElementoNoEncontradoException si no existe el gasto
	 */
	Gasto findById(long id) throws ElementoNoEncontradoException;

	/**
	 * Añade un gasto al repositorio
	 *
	 * @param gasto 
	 * @throws ElementoExistenteException si el gasto ya existe
	 * @throws ErrorPersistenciaException si no se puede guardar
	 */
	void addGasto(Gasto gasto) throws ElementoExistenteException, ErrorPersistenciaException;

	/**
	 * Elimina un gasto. Si ya no existe, no realiza ningún cambio
	 *
	 * @param gasto 
	 * @throws ErrorPersistenciaException si no se puede eliminar
	 */
	void removeGasto(Gasto gasto) throws ErrorPersistenciaException;

	/**
	 * Guarda los cambios de un gasto existente
	 *
	 * @param gasto
	 * @return gasto actualizado
	 * @throws ErrorPersistenciaException si no se pueden guardar los cambios
	 */
	Gasto updateGasto(Gasto gasto) throws ErrorPersistenciaException;
}