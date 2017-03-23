package com.example.luiscobian.testlogin;

import com.google.gson.annotations.SerializedName;

/**
 * Created by luiscobian on 3/22/17.
 */

public class DatoJson {

    @SerializedName("id")

    private String status;
    private String correo;
    private String password;

    public DatoJson(String status, String correo, String password) {
        this.status = status;
        this.correo = correo;
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
