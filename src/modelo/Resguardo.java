
package modelo;

import controlador.Procedimientos;

/**
 *
 * @author acebin
 */
public class Resguardo {
    
    private String nombreHotel; 
    
    private String direccionHotel;
    
    private String fechaEntrada; //podria ser de tipo date
    
    private String fechaSalida;  //podria ser de tipo date
    
    private String telefonoHotel;
    
    private float precioTotal;
    
    private String tipoPension;
    
    private String idReserva;
    
    private String tipoHabitacion;
    
    private String numPersonas;
    
    

    
    
    
    /*
    Por ahora sin constructor
    */

    //public Resguardo() {
    //}

    public Resguardo(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }
    
    
    
    
    
    
    
    
    
    public String getNombreHotel() {
        this.nombreHotel = Procedimientos.nombreHotel;
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public String getDireccionHotel() {
        return direccionHotel;
    }

    public void setDireccionHotel(String direccionHotel) {
        this.direccionHotel = direccionHotel;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getTelefonoHotel() {
        return telefonoHotel;
    }

    public void setTelefonoHotel(String telefonoHotel) {
        this.telefonoHotel = telefonoHotel;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }

    public String getTipoPension() {
        return tipoPension;
    }

    public void setTipoPension(String tipoPension) {
        this.tipoPension = tipoPension;
    }

    public String getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public String getNumPersonas() {
        return numPersonas;
    }

    public void setNumPersonas(String numPersonas) {
        this.numPersonas = numPersonas;
    }
    
    
    
    
    
    
    
}
