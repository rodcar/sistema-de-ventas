/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.kawaii.ventas.models;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Ivan
 */
public class Venta {

    private int id;
    private Usuario vendedor;
    private Cliente cliente;
    private ArrayList<VentaDetalle> detalles;
    private Date fechaRegistro;
    private double total;
    private boolean anulada;

    public Venta() {
        this.anulada = false;
    }

    public Venta(int id, Usuario vendedor, Cliente cliente, ArrayList<VentaDetalle> detalles, Date fechaRegistro, double total) {
        this.id = id;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.detalles = detalles;
        this.fechaRegistro = fechaRegistro;
        this.total = total;
        this.anulada = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getVendedor() {
        return vendedor;
    }

    public void setVendedor(Usuario vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<VentaDetalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(ArrayList<VentaDetalle> detalles) {
        this.detalles = detalles;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public boolean isAnulada() {
        return anulada;
    }

    public void setAnulada(boolean anulada) {
        this.anulada = anulada;
    }

    @Override
    public String toString() {
        return "Venta{" + "id=" + id + ", vendedor=" + vendedor + ", cliente=" + cliente + ", detalles=" + detalles + ", fechaRegistro=" + fechaRegistro + ", total=" + total + '}';
    }

}
