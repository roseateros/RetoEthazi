
package modelo;

/**
 *
 * @author acebin
 */
public class Casa extends Alojamiento{
    
    //Atributos en principio privates porque no he encotrado subclasses
    
   protected int numBaños;
   protected int metros2; //tamano en metros 2 de la casa, sumando todas las habitaciones que tiene

    public Casa(int numBaños, int metros2, String nombre, String ubicacion, int numHab) {
       // super(nombre, ubicacion, numHab);
        super.nombre=nombre;
        super.numHab= numHab;
        super.ubicacion = ubicacion;
        this.numBaños = numBaños;
        this.metros2 = metros2;
    }
    
    
}
