
package modelo;

/**
 *
 * @author acebin
 */
public class Apartamento extends Casa{
    
    //Atributos en principio privates porque no he encotrado subclasses
    private int piso;

    public Apartamento(int piso, int numBaños, int metros2, String nombre, String ubicacion, int numHab) {
        super(numBaños, metros2, nombre, ubicacion, numHab);
        this.piso = piso;
    }
}
