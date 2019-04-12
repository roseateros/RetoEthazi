
package modelo;

import controlador.ConexionDB;
import java.sql.Connection;
import java.sql.Statement;
/**
 *
 * @author acebin
 */
public class ConsultasSQL {
    
    public void InsertUsuario(String dni, String password, String nombre, String apellido, String email, String direccion, String telefono){
        String ConsultaInsertUsuario = "Insert into cliente (dni, password,nombre,apellido,email,direccionCliente,telefono)"+ " values('"+dni+"','"+password+"','"+nombre+"','"+apellido+"','"+email+"','"+direccion+"','"+telefono+"');";
        
                ConexionDB con =new ConexionDB(); //SOLO ESTO AL INSTANCIAR, ES NECESARIA PARA HACER LA CONEXIÒN//
        Connection reg=con.conexion();// SOLO ESTO AL INSTACIAR, ES NECESARIA PARA HACER LA CO
           try {   
            
            Statement st = reg.createStatement();
            st.execute(ConsultaInsertUsuario);            
            
            
            
        } catch (Exception e) { 
            System.err.println(e.getMessage()); 
        }       
    }
}
