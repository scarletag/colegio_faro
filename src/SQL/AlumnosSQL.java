
package SQL;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.hash;
import models.Alumnos;

// DML -- Data manipulation Language 
// SELECT, DELETE, UPDATE EN EL UPDATE Y DELETE SIEMPRE USAR WHERE, INSERT  -- DML
// DDL  Data Definition Language 
// ALTER, CREATE, DROP
// SINTAXIS DEL UPDATE
// UPDATE alumnos SET nombre = pedro, apellido = perez WHERE usuario = luis.ardon;
// DELETE FROM alumnos WHERE usuario = ;

public class AlumnosSQL {
    public static String nombre, apellido;
    private final String SELECT = "SELECT usuario, contraseña, nombre, apellido, direccion, edad, correo, rol FROM alumnos INNER JOIN roles ON roles_idroles = idroles ORDER BY usuario ASC;";
    private final String INSERT = "INSERT INTO alumnos VALUES(?,?,?,?,?,?,?,?,?)";
    private final String AUTENTICACION = "SELECT usuario, contraseña, nombre, apellido FROM alumnos WHERE usuario = ? && contraseña = ?";
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    //method SQL
    public List<Alumnos> getUserAll(){
        List<Alumnos> users = new ArrayList<>();
        Alumnos u = null;
        try {
            con = Conexion.conectar();
            ps = con.prepareStatement(SELECT);
        } catch (Exception e) {
        }
        return users;
    }
    //method for authenticate an user
    public int authentication(Alumnos a){
        int response = 0;
        //hashear password
        String comparePassword = hash.sha1(a.getContraseña());
        try {
            con = Conexion.conectar();
            ps = con.prepareStatement(AUTENTICACION);
            ps.setString(1, a.getUsuario());
            ps.setString(2, comparePassword);
            rs = ps.executeQuery();
            if(rs.next()){
                response = 1;
                nombre = rs.getString("nombre");
                apellido = rs.getString("apellido");
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(AlumnosSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return response;
    }
    // metodo para crear un alumno
    public int createAlumno(Alumnos a){
        int respuesta = 0;
        String HashedPass = hash.sha1(a.getContraseña());
        try {
           con = Conexion.conectar();
           ps = con.prepareStatement(INSERT);
           ps.setString(1, a.getUsuario());
           ps.setString(2, HashedPass);
           ps.setString(3, a.getNombre());
           ps.setString(4, a.getApellido());
           ps.setString(5, a.getDireccion());
           ps.setString(6, a.getTelefono());
           ps.setInt(7, a.getEdad());
           ps.setString(8, a.getCorreo());
           ps.setInt(9, a.getRoles_idroles());
           respuesta = ps.executeUpdate();
           con.close();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(AlumnosSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return respuesta;
    }
}
