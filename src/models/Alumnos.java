package models;

public class Alumnos {

    //atributos
    private String usuario, contraseña, nombre, apellido, direccion, telefono, tipoRol, correo;
    private int edad, roles_idroles;

    //constructor vacio
    public Alumnos() {

    }

    //constructor para realizar la insercion en la BD
    public Alumnos(String usuario, String contraseña, String nombre, String apellido, String direccion, String telefono, String correo, int edad, int roles_idroles) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.edad = edad;
        this.roles_idroles = roles_idroles;
    }
    //constructor para el despliegue los datos de la BD 
    public Alumnos(String usuario, String contraseña, String nombre, String apellido, String direccion, String telefono, String tipoRol, String correo, int edad) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.tipoRol = tipoRol;
        this.correo = correo;
        this.edad = edad;
    } 
    //constructor para el login
    public Alumnos(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
    //metodos getter y setter

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipoRol() {
        return tipoRol;
    }

    public void setTipoRol(String tipoRol) {
        this.tipoRol = tipoRol;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getRoles_idroles() {
        return roles_idroles;
    }

    public void setRoles_idroles(int roles_idroles) {
        this.roles_idroles = roles_idroles;
    }


}
