package pe.kawaii.ventas.models;

public class Cliente extends Persona {

    private String dni;
    private String ruc;
    private String correo;
    private String celular;
    private String direccion;

    public Cliente(int id,String nombreCompleto, String dni, String ruc, String correo, String celular, String direccion) {
        super(id,nombreCompleto);
        this.dni = dni;
        this.ruc = ruc;
        this.correo = correo;
        this.celular = celular;
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" + "dni=" + dni + ", ruc=" + ruc + ", correo=" + correo + ", celular=" + celular + ", direccion=" + direccion + '}';
    }

}
