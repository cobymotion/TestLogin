package com.example.luiscobian.testlogin;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by luiscobian on 3/24/17.
 */

public class SessionManager {

    private static SessionManager OBJETO;
    private final SharedPreferences misPref;
    private boolean isLogeado = false;

    private SessionManager(Context context) {
        misPref = context.getApplicationContext()
                .getSharedPreferences("sesion"
                        ,Context.MODE_PRIVATE);
    }

    public static SessionManager get(Context context){
        if(OBJETO==null)
            OBJETO = new SessionManager(context);
        return OBJETO;
    }

    public void crearSesion(Usuario user)
    {
        if(user!=null){
            SharedPreferences.Editor editor =
                    misPref.edit();
            editor.putString("nombre",user.getNombre());
            // aqui guardan todo lo que quieran
            editor.apply();
            isLogeado = true;
        }
    }

    public void cerrarSesion() {
        SharedPreferences.Editor editor = misPref.edit();
        editor.putString("nombre","");
        editor.apply();
        isLogeado =false;
    }

    public boolean getLogeado() {
        return isLogeado;
    }
}






















