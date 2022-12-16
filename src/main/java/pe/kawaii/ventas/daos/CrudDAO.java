package pe.kawaii.ventas.daos;

import java.util.List;
import java.util.Optional;

/**
 * Esta interface sirve como interface a implementar para los clases DAO
 *
 * @author Ivan Rodriguez
 * @param <T> Clase genérica
 */
public interface CrudDAO<T> {

    /**
     * Registra el objeto
     *
     * @param t Objeto
     */
    void save(T t);

    /**
     * Actualiza el objeto
     *
     * @param t Objeto
     */
    void update(T t);

    /**
     * Busca un objeto según su id
     *
     * @param id id del objeto
     * @return Objeto de tipo <T> según su id
     */
    Optional<T> findById(int id);

    /**
     * Busca todos los objetos
     *
     * @return Lista de todos los objetos
     */
    Optional<List<T>> findAll();

    /**
     * Elimina un objeto según su id
     *
     * @param id id del objeto
     */
    void delete(int id);

}
