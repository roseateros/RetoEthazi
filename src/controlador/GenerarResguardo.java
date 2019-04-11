
package controlador;

import java.io.FileWriter;
import java.io.IOException;
import modelo.Resguardo;

/**
 *
 * @author acebin
 */
public class GenerarResguardo{ //esta va a tener que heredar de todas aquellas que 
    

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
    
    
    
    
    
    
    
    
    
    
    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
        System.out.println("Esto se ha ejecutado "+nombreHotel);
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
    
    /*
    Metodo para generar resguardo
    */
    
    
    public void generarResguardo(boolean aux) throws IOException{
        // recibimos aux para comprobar que se ha pagado correctamente
        
        if(aux==true){
            FileWriter resguardo = new FileWriter("C:\\Users\\acebi\\Desktop\\pruebas txt reto4\\resguardo.txt");
        
        //me pone dasd porque utiliza directamente el valor de la variable que he declarado en la clase
        resguardo.write(" \n"
				+"                                                             RESGUARDO DE RESERVA                       "+" \n"
				+" **********************************************************************************************************************"+" \n"
				
				+" -Código de la reserva: " + "" +" \t"+"-Nombre del alojamiento: " + Procedimientos.nombreHotel +" \n"+" \n"  
				+" -Ubicación: " + "" +" \t\t"+ "-Teléfono de contacto: " + "" +" \t\n"
				+" **********************************************************************************************************************"+" \n"
				
				+" -Cliente: " +""+"     "+ "-Tipo de habitación: " + "" +" \n"+" \n" 
				+" -Fecha entrada: " + "" +"                  "+ "-Fecha salida:" +  "" +" \n"+" \n" 
				+" **********************************************************************************************************************"+" \n"
				
				+" -Tipo de pensión: " +"       "+"-Precio total: "+" "+" €"); 
        resguardo.close();
        }
        
    }
    
}
