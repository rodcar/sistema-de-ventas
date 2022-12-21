package pe.kawaii.ventas.daos;

import java.util.Optional;
import pe.kawaii.ventas.models.Cliente;

public interface IClienteDAO extends ICrudDAO<Cliente> {

    public Optional<Cliente> findByDNI(String dni);

}
