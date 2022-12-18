/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.kawaii.ventas.daos;

import java.util.List;
import java.util.Optional;
import pe.kawaii.ventas.models.Venta;

/**
 *
 * @author Ivan
 */
public class VentaDAO implements ICrudDAO<Venta> {

    @Override
    public void save(Venta t) {

    }

    @Override
    public void update(Venta t) {

    }

    @Override
    public Optional<Venta> findById(int id) {
        return Optional.empty();
    }

    @Override
    public Optional<List<Venta>> findAll() {
        return Optional.empty();
    }

    @Override
    public void delete(int id) {

    }

}
