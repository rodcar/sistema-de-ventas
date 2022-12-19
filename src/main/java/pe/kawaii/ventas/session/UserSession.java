/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.kawaii.ventas.session;

import pe.kawaii.ventas.models.Rol;

/**
 *
 * @author Ivan
 */
public final class UserSession {

    private static UserSession INSTANCE;
    private int id = -1;
    private Rol rol = null;

    private UserSession() {
    }

    public static UserSession getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new UserSession();
        }

        return INSTANCE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

}
