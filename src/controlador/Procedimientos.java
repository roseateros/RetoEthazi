
package controlador;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;


/**
 *
 * @author Leandro
 */
public class Procedimientos {
    
    //Resguardo miResguardo = new Resguardo();
    
    GenerarResguardo miResguardo = new GenerarResguardo();//
    
    //Se puede usar desde otro paquete
    public static String nombreHotel; //para el txt, sirve!!!
    
    /*
    Pruebao con otra cosa
    */
    
    ConexionDB miConexion = new ConexionDB(); //Para poder usar la conexion
    
    public void buscarHotel(String nombreHotel, JList listado, DefaultListModel item)throws SQLException{
        
        CallableStatement llamar = miConexion.conexion().prepareCall("{call buscarHotel(?)}");
        
        llamar.setString(1, nombreHotel); //le damos valor al parámetro
        
        ResultSet rS = llamar.executeQuery();
        
        
        
        /*
            Antes de que me rellene la tabla, debo borrar lo que habia
        */
        //listado.append("");// o sino el set text
        //listado.setText("");
        while(rS.next()){
            
            
            //listado.append(rS.getString(1)+" "+rS.getString(2)+" "+rS.getString(3));
            //listado.append(System.getProperty("line.separator")); 
            
            //listado
            item.addElement(rS.getString(1)+" "+rS.getString(2)+" "+rS.getString(3));
            
            
        }
        
        listado.setModel(item);
        

        rS.close();
  
        
    }
    
    /*
    Asignamos la seleccion al textfield
    */
    public void asignarSeleccion(JList listado, JLabel selection){
        

         selection.setText(String.valueOf(listado.getSelectedValue()));
         
       
       
        //this.miResguardo.setNombreHotel(String.valueOf(listado.getSelectedValue()));
        nombreHotel = String.valueOf(listado.getSelectedValue());
        //nombreHotel="holaaaaaaaaaaaa";
    }
    
    
    
    
    
    
}
