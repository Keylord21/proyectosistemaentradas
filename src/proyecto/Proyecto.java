
package proyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane ;
public class Proyecto {

    private Connection conex;
    
    private String cadenaConexion = "jdbc:postgresql://localhost:5432/Sistemas_Entradas";
    private String usuario = "postgres";
    private String contrasena = "Andresg21";
    
    public void ConectarBD(){
        try {
            Class.forName("org.postgresql.Driver");
            conex = DriverManager.getConnection(cadenaConexion , usuario , contrasena);
            JOptionPane.showMessageDialog(null,"Base de datos conectada");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "ERROR" + e.getMessage());
        }
    }
    
    public void CerrarBD(){
        try{
            conex.close();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null , "Error" +e.getMessage());
        }
    }
  
    public static void main(String[] args) {
       Proyecto con = new Proyecto();
      
    }
    
}
