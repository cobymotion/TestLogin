package com.example.luiscobian.testlogin;

/**
 * Created by luiscobian on 3/22/17.
 */

//regresar
public class Usuario {

    private String status;
    private String nombre;
    private String correo;

    public Usuario(String status, String nombre, String correo) {
        this.status = status;
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
