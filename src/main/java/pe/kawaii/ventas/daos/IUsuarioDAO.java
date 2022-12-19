/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.kawaii.ventas.daos;

import java.util.Optional;
import pe.kawaii.ventas.models.Usuario;

/**
 *
 * @author Ivan
 */
public interface IUsuarioDAO extends ICrudDAO<Usuario> {

    public Optional<Usuario> login(String username, String password);
}
