package com.example.luiscobian.testlogin;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by luiscobian on 3/22/17.
 */

public interface LoginInterface {

    public static final String URL=
            "http://130.133.41.148/8vo/JSON/";

    @POST("controles/wslogin.php")
    Call<Usuario> login(@Body DatoJson loginBody);



}
