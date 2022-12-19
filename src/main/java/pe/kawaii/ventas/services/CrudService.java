/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.kawaii.ventas.services;

import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author Ivan
 */
public interface CrudService<T> {

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
    Optional<ArrayList<T>> findAll();

    /**
     * Elimina un objeto según su id
     *
     * @param id id del objeto
     */
    void delete(int id);
}
