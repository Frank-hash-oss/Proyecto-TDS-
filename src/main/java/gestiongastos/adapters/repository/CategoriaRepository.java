package gestiongastos.adapters.repository;

import java.util.List;

import gestiongastos.adapters.repository.exceptions.ElementoExistenteException;
import gestiongastos.adapters.repository.exceptions.ElementoNoEncontradoException;
import gestiongastos.adapters.repository.exceptions.ErrorPersistenciaException;
import gestiongastos.modelo.Categoria;

public interface CategoriaRepository {

	/**
	 * Devuelve las categorías disponibles
	 *
	 * @return lista de categorías
	 */
	List<? extends Categoria> getCategorias();

	/**
	 * Busca una categoría por su identificador
	 *
	 * @param id 
	 * @return categoría encontrada
	 * @throws ElementoNoEncontradoException si no existe la categoría
	 */
	Categoria findById(long id) throws ElementoNoEncontradoException;

	/**
	 * Añade una categoría al repositorio
	 *
	 * @param categoria 
	 * @throws ElementoExistenteException si la categoría ya existe
	 * @throws ErrorPersistenciaException si no se puede guardar
	 */
	void addCategoria(Categoria categoria) throws ElementoExistenteException, ErrorPersistenciaException;
}