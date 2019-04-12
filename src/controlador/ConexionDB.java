
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


/**
 *
 * @author acebin
 */
public class ConexionDB {
    
    Connection conectar = null;
    private String url="jdbc:mysql://localhost:3306/reshotel";//aqui cambiamos el nombre
    private String password="";
    private String userName="root";
    
    public Connection conexion(){
   
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            //conectar = DriverManager.getConnection("jdbc:mysql://localhost:33065/bidaion","root","");
            conectar = DriverManager.getConnection(url,userName,password);   //PARA CASA
            
            /*mensaje comprobatorio*/
            JOptionPane.showMessageDialog(null, "Hola, estas dentro!!");
            System.out.println("Conexion establecida siempre y cuando cumpla los requisitos");
           
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return conectar;
    }
}
