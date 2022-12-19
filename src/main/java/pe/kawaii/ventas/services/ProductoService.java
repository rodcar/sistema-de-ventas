package pe.kawaii.ventas.services;

import java.util.ArrayList;
import java.util.Optional;
import pe.kawaii.ventas.daos.IProductoDAO;
import pe.kawaii.ventas.daos.impl.DaoFactory;
import pe.kawaii.ventas.models.Producto;
import pe.kawaii.ventas.util.Util;

/**
 *
 * @author EDITA
 */
public class ProductoService implements CrudService<Producto> {

    private IProductoDAO productoDAO;

    public ProductoService() {
        this.productoDAO = DaoFactory.getProductoDAO(Util.dataSource);
    }

    @Override
    public void save(Producto t) {
        this.productoDAO.save(t);
    }

    @Override
    public void update(Producto t) {
        this.productoDAO.update(t);
    }

    @Override
    public Optional<Producto> findById(int id) {
        return this.productoDAO.findById(id);
    }

    @Override
    public Optional<ArrayList<Producto>> findAll() {
        return this.productoDAO.findAll();
    }

    @Override
    public void delete(int id) {
        this.productoDAO.delete(id);
    }

}
