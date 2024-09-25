package model;

import java.sql.cennection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    String ip = "localhost";
    String puerto = "3306";
    String usuario = "root";
    String pass = "centro.403";
    string bd = "verduleria";
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    cennection con = null;
    
    public connection conectar() {
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             con= DriverManager.getConnection(cadena,usuario,pass);
             JOptionPane.showMessageDialog(null, "se conecto correctamente la base de datos");
        } catch (Exeption e){
            JOptionPane.showMessageDialog(null, "No se conectó a la base de datos, error: " + e.getMessage());
        }
        return con;
    }
}
