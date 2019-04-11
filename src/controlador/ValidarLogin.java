
package controlador;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Leandro
 */
public class ValidarLogin {
    
    private boolean v1, v2, v3=false; // paraa verificar los datos
    private String converDNI1="";
    private String converDNI2="";
    private String convertidoDNI="";
    private String guardoDNI;
    private String guardoContraseña="";
    private String dniFinal="";
    
    
    
    public void datosIncorrectos(){
        if(this.v1 == true && this.v2 == true && this.v3 == false){
            JOptionPane.showMessageDialog(null, "¡No existe una cuenta con esas especificaciones!");
        }
    }
    
    public void setGuardoDNI(String dni){
        this.guardoDNI = dni;
    } 
    
    public String getGuardoDNI(){
        return this.guardoDNI;
    }
    
    
    /*
    Aquí podria solo recibir el label y usar el getText();
    */
    public boolean validarDNI(JTextField dni, JLabel label) { 
        /*
            Ejemplos de DNI`s validos:
            77134922 h
            77134922h
            77134922.p
            77134922-j
            77134922 P
            77134922P
            77134922.P
            77134922-P
            Puede que no me sirva porque el dni se crearia mas de una vez en la base de datos :v
            para los distintos formatos y la idea es que sea el mismo aunque tengan formatos diferentes
        */
        
       // this.transformarDNI(dni); TENGO QUE USAR ESTO
            
            if(dniFinal.matches("^\\d{8}[A-Z]$")==true){
            System.out.println("dni correcto if " +dniFinal);
            label.setVisible(false);
            v1 = true;
            }else{
            System.out.println("dni incorrecto else "+dniFinal);
            label.setVisible(true);
            v1 = false;
            }
            
        
        
        System.out.println("el valor de v1 es "+v1);
        return v1;
    }
    
    
    public boolean validarPass(JPasswordField contraseña, JLabel label){
        /*
        La expresion regular esta diseñada para aceptar cualquier cadena
        que contenga al menos 1 número, al menos 1 letra mayúscula y al menos
        1 letra minúscula, en cualquier orden.
        */
        
        if(String.valueOf(contraseña.getPassword()).matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9]).{3,}$")==true){
            System.out.println("Contraseña aceptada if "+contraseña);
            v2 = true;
            label.setVisible(false);
        }else{
            System.out.println("contraseña incorrecto else "+contraseña);
            v2 = false;
            label.setVisible(true);
        }
        return v2;
    }
    
    
    public boolean verificarCliente(String pass, String dni, boolean dispose) throws SQLException{
        
        if(v1 == true && v2 == true){
            
            ConexionDB miCon =new ConexionDB();
            Connection reg = miCon.conexion();
            ResultSet resultadoDB;
            
            try{
                this.transformarDNI(dni);
            Statement pst = reg.createStatement();
                System.out.println("el valor del dni antes de realizar la conexion a la base de datos es "+dniFinal);
            String selectCliente = "SELECT DISTINCT(DNI), Contraseña FROM cliente Where DNI = '"+dniFinal+"' and Contraseña = '"+pass+"'"; // con el or hace busquedas por separado xD
            //Aqui se almacenará el valor de la consulta select y esta dará los datos de las filas que cumplan ambas condiciones
            resultadoDB = pst.executeQuery(selectCliente);
            
            //resultadoDB.getString(0);// obtenemos el valor de la posisicon 0 de la culumna especificada

            //Me devuelve todas las coincidencias segun mi sentencia select
            while(resultadoDB.next()){
            guardoDNI = resultadoDB.getString("DNI"); 
             // prueba
            //misDatos.setDNI(this.guardoDNI);
            this.guardoContraseña = resultadoDB.getString("Contraseña");
           
            
            System.out.println("El dni es : " + guardoDNI);
            System.out.println("la contraseña es : " + guardoContraseña);
            setGuardoDNI(guardoDNI);
           
            }
                
          
            //Verificamos el login 
            if(pass.equals(guardoContraseña) && dniFinal.equals(guardoDNI)){
                //GestionBilletes miGestion = new GestionBilletes();
                //miGestion.setVisible(true);
                dispose=true;
                v3 = true;
            }
                
            
            }catch(SQLException ex){
                System.out.println("Se ha producido un error de login "+ ex.getMessage());
            }   
        }
        return dispose;
    }
    
    
    
    public void transformarDNI(String dni){
        if(dni.matches("^\\d{8}[A-Z]$")==true){
            System.out.println("dni correcto if " +dniFinal);
            //label.setVisible(false);
            v1 = true;    
        }
        
        else if (!dni.equals(dni.matches("^\\d{8}[A-Z]$"))){
            String dni1 = dni.substring(0, 8);
            String dni2 = dni.substring(9);
            dniFinal = dni1+dni2.toUpperCase();
            System.out.println("El dni transformado es "+dniFinal);     
        } 
       
    }
    
    
    
}
