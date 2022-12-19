/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.kawaii.ventas.daos;

import pe.kawaii.ventas.models.Usuario;

/**
 *
 * @author Ivan
 */
public interface IUsuarioDAO extends ICrudDAO<Usuario> {

    public boolean login(String username, String password);
}
