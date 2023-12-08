package org.zutjmx.consola.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Service;
import org.zutjmx.consola.models.ApiColombiaInfoGeneral;

import java.io.IOException;

@Service
public class ApiColombia {
    public void GetInfoGeneral() {
        ObjectMapper om = new ObjectMapper();
        OkHttpClient client = new OkHttpClient();
        String url = "https://api-colombia.com/api/v1/Country/Colombia";
        Request request = new Request.Builder()
                .url(url)
                .build();
        try {
            String respuesta;
            try (Response response = client.newCall(request).execute()) {
                assert response.body() != null;
                respuesta = response.body().string();
            }
            System.out.println("Respuesta de ApiColombia-InfoGeneral: " + respuesta);
            ApiColombiaInfoGeneral apiColombiaInfoGeneral = om.readValue(respuesta, ApiColombiaInfoGeneral.class);
            System.out.println("apiColombiaInfoGeneral = " + apiColombiaInfoGeneral.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
