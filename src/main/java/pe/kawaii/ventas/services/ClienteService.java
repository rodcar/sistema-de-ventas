/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.kawaii.ventas.services;

import java.util.ArrayList;
import java.util.Optional;
import pe.kawaii.ventas.daos.IClienteDAO;
import pe.kawaii.ventas.daos.impl.DaoFactory;
import pe.kawaii.ventas.models.Cliente;
import pe.kawaii.ventas.util.Util;

/**
 *
 * @author Ivan
 */
public class ClienteService implements CrudService<Cliente> {

    private IClienteDAO clienteDAO;

    public ClienteService() {
        this.clienteDAO = DaoFactory.getClienteDAO(Util.dataSource);
    }

    @Override
    public void save(Cliente t) {
        this.clienteDAO.save(t);
    }

    @Override
    public void update(Cliente t) {
        this.clienteDAO.update(t);
    }

    @Override
    public Optional<Cliente> findById(int id) {
        return this.clienteDAO.findById(id);
    }

    @Override
    public Optional<ArrayList<Cliente>> findAll() {
        return this.clienteDAO.findAll();
    }

    @Override
    public void delete(int id) {
        this.clienteDAO.delete(id);
    }

    public Optional<Cliente> findByDNI(String dni) {
        return this.clienteDAO.findByDNI(dni);
    }

}
