
package modelo;

/**
 *
 * @author acebin
 */
public class Hotel extends Alojamiento{
    
    //Atributos en principio privates porque no he encotrado subclasses
    private int numEstrellals;
    
    
    /*
    Constructor de todos los atributos
    */
    public Hotel(int numEstrellals, String nombre, String ubicacion, int numHab) {
       // super(nombre, ubicacion, numHab);
        super.nombre=nombre;
        super.ubicacion=ubicacion;
        super.numHab=numHab;
        this.numEstrellals = numEstrellals;
    }
    
    
    /*
    Constructor vacio
    */
    public Hotel(){
        
    }
    
    
    
    /*
    Metodos get y set, en principio de todos los atributos
    */
    public int getNumEstrellals() {
        return numEstrellals;
    }

    public void setNumEstrellals(int numEstrellals) {
        this.numEstrellals = numEstrellals;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getNumHab() {
        return numHab;
    }

    public void setNumHab(int numHab) {
        this.numHab = numHab;
    }
    
    
    
}
