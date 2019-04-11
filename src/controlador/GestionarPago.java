
package controlador;

import javax.swing.JLabel;
import javax.swing.JOptionPane;



/**
 *
 * @author acebin
 */
public class GestionarPago {
    
    
    private float pagadoAnterior;

    public void calcularTotal(float valor, JLabel actualizar){
        
        try{
            //actualizar.setText(String.valueOf(valor+pagadoAnterior)); 
            //actualizar.getText();
            pagadoAnterior = Float.parseFloat(actualizar.getText());            
        
        }catch(NumberFormatException e){
            e.getMessage();
        }

         actualizar.setText(String.valueOf(Math.round((valor+pagadoAnterior)*100f)/100f));            
        
    }
    
    
    
    public boolean verificarPago(JLabel precioTotal, JLabel pagado) throws NumberFormatException{
        
        float total = Float.parseFloat(precioTotal.getText());
        float aPagar = Float.parseFloat(pagado.getText());
       
        boolean aux=false;
        
            
            if(total>aPagar){
                JOptionPane.showMessageDialog(null, "Falta pagar "+(total-aPagar));
            }else if(total==aPagar){
                JOptionPane.showMessageDialog(null, "Correcto, gracias... ");
                aux = true;
                
                //La otra opcion es controlar la excepcion en el propio metodo
//                try{
//                    miResguardo.generarResguardo();
//                }catch(IOException e){
//                    e.getMessage();
//                } 
            }else if(aPagar > total){
                aux = true;
                JOptionPane.showMessageDialog(null, "Su cambio es "+(aPagar-total));
//                try{
//                    miResguardo.generarResguardo();
//                }catch(IOException e){
//                    e.getMessage();
//                } 
            }else if(pagado.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Ingrese el dinero, por favor!");
            }
            
            return aux;
    }
    
}
