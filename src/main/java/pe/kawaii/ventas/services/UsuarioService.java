package pe.kawaii.ventas.services;

import java.util.ArrayList;
import java.util.Optional;
import pe.kawaii.ventas.daos.IUsuarioDAO;
import pe.kawaii.ventas.daos.impl.DaoFactory;
import pe.kawaii.ventas.models.Usuario;
import pe.kawaii.ventas.session.UserSession;
import pe.kawaii.ventas.util.Util;

/**
 *
 * @author Ivan
 */
public class UsuarioService implements CrudService<Usuario> {

    private IUsuarioDAO usuarioDAO;

    public UsuarioService() {
        this.usuarioDAO = DaoFactory.getUsuarioDAO(Util.dataSource);
    }

    @Override
    public void save(Usuario t) {
        this.usuarioDAO.save(t);
    }

    @Override
    public void update(Usuario t) {
        this.usuarioDAO.update(t);
    }

    @Override
    public Optional<Usuario> findById(int id) {
        return this.usuarioDAO.findById(id);
    }

    @Override
    public Optional<ArrayList<Usuario>> findAll() {
        return this.usuarioDAO.findAll();
    }

    @Override
    public void delete(int id) {
        this.usuarioDAO.delete(id);
    }

    public boolean login(String username, String password) {
        Optional<Usuario> usuario = this.usuarioDAO.login(username, password);
        if(usuario.isPresent()) {
            UserSession.getInstance().setId(usuario.get().getId());
            UserSession.getInstance().setRol(usuario.get().getRol());
            return true;
        }
        return false;
    }

}
